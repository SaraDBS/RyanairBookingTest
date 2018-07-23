package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Sara on 21/07/2018.
 */
public class SignUpToCheckoutPage extends RyanairBasePage {

    public SignUpToCheckoutPage(BaseUtil base) { super(base);}

    private By loginButton = By.xpath("//button[contains(@ui-sref,'login')]");
    private By loginForm = By.xpath("//div[@class='modal-form-container']");
    private By submitButton = By.xpath("//button[contains(@type,'submit') and contains(@class,'core-btn-primary')]");
    private By userEmail = By.xpath("//div[@class='form-field']//input[contains(@name,'emailAddress')]");
    private By userPassword = By.xpath("//input[contains(@name,'password')]");

    public void signUpAndSubmit(){

        WebDriverWait wait = new WebDriverWait(base.Driver, 10);
        WebElement loginElement = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginElement.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginForm));

        WebElement userEmailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(userEmail));
        userEmailElement.sendKeys("saramarchioni57@gmail.com");

        WebElement userPasswordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(userPassword));
        userPasswordElement.sendKeys("Ryanair23456");

        WebElement submitButtonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton));
        submitButtonElement.click();

    }

}
