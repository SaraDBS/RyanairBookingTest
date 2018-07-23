package Pages;

import Base.BaseUtil;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Sara on 21/07/2018.
 */
public class CheckoutAndPaymentPage extends RyanairBasePage {

    public CheckoutAndPaymentPage(BaseUtil base) {
        super(base);
    }

    private By message = By.xpath("//prompt[@class='error prompt-text']");
    private By payNow = By.xpath("//button[contains(@translate, 'common.components.payment_forms.pay_now')]");
    private By passengerName = By.xpath("//div[@class='form-field payment-passenger-first-name']");
    private By passengerSurname = By.xpath("//div[contains(@class,'form-field payment-passenger-last-name')]");
    private By passengerTitle = By.xpath("//select[@ng-model='$ctrl.pax.name.title']");
    private By creditCardNumber = By.name("cardNumber");
    private By creditCardName = By.name("cardHolderName");
    private By creditCardCode = By.xpath("//div[@class='card-security-code']");
    private By expiryMM = By.name("expiryMonth");
    private By expiryYYYY = By.name("expiryYear");
    private By creditCardType = By.name("cardType");
    private By acceptPolicyButton = By.xpath("//input[contains(@name,'acceptPolicy')]");
    private By addressLine1 = By.id("billingAddressAddressLine1");
    private By addressLine2 = By.id("billingAddressAddressLine2");
    private By addressCity = By.id("billingAddressCity");
    private By addressPostcode = By.id("billingAddressPostcode");


    public void fillPassengerDetails(int passengers) {
        waitForPageToLoad();
        WebDriverWait wait = new WebDriverWait(base.Driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

        Faker faker = new Faker();
        for (int numbrOfPassengers = 1; numbrOfPassengers <= passengers; numbrOfPassengers++) {
            selectDropdownOfTheListByText(passengerTitle, numbrOfPassengers, "Mr");
            typeTextOnWebElementOfTheList(passengerName, numbrOfPassengers, faker.name().firstName());
            typeTextOnWebElementOfTheList(passengerSurname, numbrOfPassengers, faker.name().lastName());

        }
    }

    public void fillCreditCardDetails(String cardNumber, String expirationMonth, String expirationYear, String ccv) {
        waitForPageToLoad();
        WebDriverWait wait = new WebDriverWait(base.Driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

        WebElement cardNumberElement = base.Driver.findElement(creditCardNumber);
        cardNumberElement.sendKeys(cardNumber.replaceAll(" ", ""));

        WebElement cardTypeElement = base.Driver.findElement(creditCardType);
        selectDropdownByText(cardTypeElement, "MasterCard");

        WebElement expiryMonthElement = base.Driver.findElement(expiryMM);
        selectDropdownByText(expiryMonthElement, expirationMonth);

        WebElement expiryYearElement = base.Driver.findElement(expiryYYYY);
        selectDropdownByText(expiryYearElement, expirationYear);

        WebElement securityCodeElement = base.Driver.findElement(creditCardCode);
        securityCodeElement.sendKeys(ccv);

        WebElement cardHolderName = base.Driver.findElement(creditCardName);
        cardHolderName.sendKeys("Henry Smith");

        base.Driver.findElement(acceptPolicyButton).click();
        base.Driver.findElement(payNow).click();

    }

    public void fillBillingAddressDetails() {
        waitForPageToLoad();
        WebDriverWait wait = new WebDriverWait(base.Driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

        base.Driver.findElement(addressLine1).sendKeys("55 White Street");
        base.Driver.findElement(addressLine2).sendKeys("Cul de sac");
        base.Driver.findElement(addressCity).sendKeys("Dublin");
        base.Driver.findElement(addressPostcode).sendKeys("3456");

    }

    public String getPaymentDeclinedMessage() {
        waitForPageToLoad();
        WebDriverWait wait = new WebDriverWait(base.Driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("plane-spinner")));
        waitForPageToLoad();
        WebElement declinedMessage = base.Driver.findElement(message);
        return declinedMessage.getAttribute("ng-switch-when");
    }
}
