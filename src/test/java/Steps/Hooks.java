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

        System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)/geckodriver.exe");
        base.Driver  = new FirefoxDriver();
        base.Driver.manage().window().maximize();
        String baseHomePage = "www.ryanair.com/ie/en";
        base.Driver.navigate().to("https://" + baseHomePage);

    }


    @After
    public void tearDownTest(){
        base.Driver.quit();
    }
}
