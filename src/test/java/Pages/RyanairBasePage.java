package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by Sara on 21/07/2018.
 */
public class RyanairBasePage extends BaseUtil{

    protected BaseUtil base;

    public RyanairBasePage(BaseUtil base) {
        this.base = base;
    }



    protected void waitForPageToLoad() {

        String wait = "return document.readyState";
        JavascriptExecutor jExecutor = (JavascriptExecutor) base.Driver;

        for (int i = 0; i < 10; i++) {
            if (jExecutor.executeScript(wait).equals("complete")) {
                try {
                    base.Driver.wait(1000);
                } catch (Exception ex) {
                }

                return;
            }
        }

    }

    protected void clickElementOfTheList(By by, int index) {
        List<WebElement> elements = base.Driver.findElements(by);
        if (elements.size() > 1) {
            elements.get(index).click();
        } else
            elements.get(0).click();
    }

    protected void typeTextOnWebElementOfTheList(By by, int index, String text) {
        List<WebElement> elements = base.Driver.findElements(by);
        if (elements.size() > 1) {

            elements.get(index-1).sendKeys(text);

        } else

            elements.get(0).sendKeys(text);
    }


    protected void selectDropdownByText(WebElement element, String text) {
        Select select = new Select(element);
        if (select.isMultiple()) {
            select.deselectAll();
        }
        select.selectByVisibleText(text);
    }

    protected void selectDropdownOfTheListByText(By by, int index, String text) {
        List<WebElement> elements = base.Driver.findElements(by);
        if (elements.size() > 1 && elements.size() > (index-1) ) {
            selectDropdownByText(elements.get(index-1),text);
        }else
            selectDropdownByText(elements.get(0),text);

    }

}


