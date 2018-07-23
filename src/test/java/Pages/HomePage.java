package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Created by Sara on 21/07/2018.
 */
public class HomePage extends RyanairBasePage {

    public HomePage(BaseUtil base) {
        super(base);
    }

    private By oneWay = By.xpath("//input[@id='flight-search-type-option-one-way']");
    private By toAirport =  By.xpath("//input[@aria-labelledby='label-airport-selector-to']");
    private By passengers =  By.xpath("//div[@class='dropdown-handle']");
    private By moreAdults = By.xpath("//div[@label='Adults']//button[@data-ref='core-inc-dec-increment']");
    private By moreChildren =  By.xpath("//div[@label='Children']//button[@data-ref='core-inc-dec-increment']");
    private By adults =  By.xpath("//div[@value='paxInput.adults']//input[@ng-model='value']");
    private By children =  By.xpath("//div[@value='paxInput.children']//input[@ng-model='value']");
    private By flyingDay = By.xpath("//input[contains(@aria-label,'Fly out: - DD')]");
    private By flyingMonth = By.xpath("//input[contains(@aria-label,'Fly out: - MM')]");
    private By flyingYear = By.xpath("//input[contains(@aria-label,'Fly out: - YYYY')]");
    private By letsGoButton = By.xpath("//button[@ng-click='searchFlights()']");
    private By mainView = By.xpath("//main[@ui-view='mainView']");

    public void makeABooking(String to, String day, String month, String year, int nAdults, int nChildren){

        waitForPageToLoad();

        WebElement backToMainView = base.Driver.findElement(mainView);
        base.Driver.findElement(oneWay).click();

        WebElement toAirportElement = base.Driver.findElement(toAirport);
        toAirportElement.click();
        toAirportElement.clear();
        toAirportElement.sendKeys(to);
        toAirportElement.sendKeys(Keys.RETURN);

        backToMainView.click();

        waitForPageToLoad();

        WebElement flyingDayElement = base.Driver.findElement(flyingDay);
        flyingDayElement.clear();
        flyingDayElement.sendKeys(day);

        backToMainView.click();

        WebElement flyingMonthElement = base.Driver.findElement(flyingMonth);
        flyingMonthElement.click();
        flyingMonthElement.clear();
        flyingMonthElement.sendKeys(month);

        backToMainView.click();

        WebElement flyingYearElement = base.Driver.findElement(flyingYear);
        flyingMonthElement.click();
        flyingYearElement.clear();
        flyingYearElement.sendKeys(year);

        base.Driver.findElement(passengers).click();

        addPassengers(nAdults, adults, moreAdults);
        addPassengers(nChildren, children, moreChildren);

        base.Driver.findElement(letsGoButton).click();

        waitForPageToLoad();

    }

    public void addPassengers(int number, By passenger, By increment) {
        for ( int i = Integer.parseInt(base.Driver.findElement(passenger).getAttribute("value")); i < number; i++){
            base.Driver.findElement(increment).click();
        }

    }

}
