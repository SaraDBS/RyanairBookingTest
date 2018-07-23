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
public class SelectingSeatsPage extends RyanairBasePage {

    public SelectingSeatsPage(BaseUtil base) { super(base); }

    private By spinner = By.className("plane-spinner");
    private By seats = By.xpath("//div[@class='ranimate-seat-rows']/div[@class='seat-wrapper seat-group-STANDARD']/span[@class='seat-row-seat standard']/span[@class='seat-click']/img[@class='icon-26 seat-person' and not(following-sibling::*)]/..");
    private By seatPlan = By.xpath("//div[contains(@class,'seat-map-scrolling-body')]");
    private By passengers = By.xpath("//div[@class='sm-carousel__pax-circle']/core-icon");
    private By gotItButton = By.xpath("//button[contains(@class,'same-seats') and contains(@class,'core-btn-primary')]");
    private By reviewSeatsButton = By.xpath("//button[contains(@class,'dialog-overlay-footer__ok-button')]");
    private By checkoutButton = By.xpath("//*[@id='booking-selection']/article/div[2]/section/div[2]/button");
    private By noPriority = By.xpath("//*[@id='ngdialog22']/div/div[2]/div[3]/div[3]/a");

    public void selectSeats(int numberOfPassengers){

        waitForPageToLoad();

        WebDriverWait wait = new WebDriverWait(base.Driver, 10);
        WebElement gotItButtonElement = wait.until(ExpectedConditions.elementToBeClickable(gotItButton));
        gotItButtonElement.click();

        waitForPageToLoad();

        WebElement seatPlanElement = wait.until(ExpectedConditions.visibilityOfElementLocated(seatPlan));

        if (seatPlanElement.isEnabled()){
            for ( int i = 1; i <= numberOfPassengers; i++) {

                clickElementOfTheList(passengers, i - 1);
                base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                clickElementOfTheList(seats, 40 + i);
                base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            }
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

        WebElement reviewSeatsButtonElement = wait.until(ExpectedConditions.elementToBeClickable(reviewSeatsButton));
        reviewSeatsButtonElement.click();

        waitForPageToLoad();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

        wait.until(ExpectedConditions.elementToBeClickable(reviewSeatsButton));
        reviewSeatsButtonElement.click();

        waitForPageToLoad();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

    }

    public void dismissAddOnsAndClickCheckout(){

        waitForPageToLoad();
        WebDriverWait wait = new WebDriverWait(base.Driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
        WebElement noPriorityElement = wait.until(ExpectedConditions.elementToBeClickable(noPriority));
        noPriorityElement.click();
        waitForPageToLoad();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
        WebElement spinnerElement = base.Driver.findElement(spinner);
        while (spinnerElement.isDisplayed()) {
            base.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        WebElement checkoutButtonElement = wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
        checkoutButtonElement.click();
        waitForPageToLoad();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
    }
}

