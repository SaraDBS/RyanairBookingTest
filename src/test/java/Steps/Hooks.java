package Steps;

import Base.BaseUtil;
import Pages.RyanairBasePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Sara on 21/07/2018.
 */
public class Hooks extends RyanairBasePage {
    public Hooks(BaseUtil base) { super(base);}

    //hooks for Setup and tear down
    @Before
    public void setUp(){

       // System.setProperty("webdriver.firefox.marionette", "C:\\Program Files/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
        base.Driver  = new FirefoxDriver();
       // base.Driver.manage().window().maximize();

       base.Driver.get("http://www.ryanair.com/ie/en");

    }


    @After
    public void tearDownTest(){
        base.Driver.quit();
    }
}
