package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sara on 21/07/2018.
 */
public class SelectingFarePage extends RyanairBasePage {

    public SelectingFarePage(BaseUtil base) {  super(base); }

    private By continueButton = By.xpath("//button[contains(@id, 'continue')]");
    private By flightsCarousel = By.xpath("//div[@class='base-carousel']");
    private By selectedPrice = By.xpath("//div[@class='flight-header__min-price hide-mobile']//span[@class='flights-table-price__price']");
    private By spinner = By.className("plane-spinner");
    private By selectedFare = By.xpath("//div[@class='flights-table-price__price-wraper flights-table-price__price-wraper--row']//span[@class='flights-table-fares__fare-radio']");


    public void selectFlightAndPrice()  {
        waitForPageToLoad();
        WebDriverWait wait = new WebDriverWait(base.Driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(flightsCarousel));

        WebElement selectedPriceElement = wait.until(ExpectedConditions.elementToBeClickable(selectedPrice));
        selectedPriceElement.click();

        WebElement spinnerElement = base.Driver.findElement(spinner);
        while (spinnerElement.isDisplayed()) {
            base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        WebElement selectedFareElement = wait.until(ExpectedConditions.elementToBeClickable(selectedFare));
        selectedFareElement.click();

        waitForPageToLoad();

        WebElement continueButtonElement = wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButtonElement.click();

        while (spinnerElement.isDisplayed()) {
            base.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

    }

}
