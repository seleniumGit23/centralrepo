package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverHooks {

    private WebDriver driver;
    private Scenario scenario;

    @Before(order =1)
    public void setUp(Scenario scenario) {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Order 1 hook");
        this.scenario =scenario;
    }

    @Before(order =1)
    public void setUpNew() {
        System.out.println("Order 2 hook");
    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        Thread.sleep(3000);
            byte[] scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES); //
            scenario.attach(scr,"image/png", scenario.getName());
//            driver.close();//
//            driver.quit();//closes all teh browsers which is opened by selenium
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Scenario getScenario() {
        return scenario;
    }
}

//        System.setProperty("wedriver.gecko.driver","C:\\Automation\\Drivers\\firefox.exe")