package Helpers;

import Steps.WebDriverHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebElementHelper {
    WebDriver driver;

    public WebElementHelper(WebDriverHooks webDriverHooks) {
        this.driver = webDriverHooks.getDriver();
    }

    public void clickonWebElement(String loc){
        driver.findElement(By.xpath(loc)).click();
    }

    public WebElement getWebElement(By loc){
        return driver.findElement(loc);
    }

    public void getBrowser(String browsername){
        if(browsername.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
//        System.setProperty("wedriver.gecko.driver","C:\\Automation\\Drivers\\firefox.exe")
            driver = new ChromeDriver();
        }else if(browsername.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Drivers\\gecko.exe");
//        System.setProperty("wedriver.gecko.driver","C:\\Automation\\Drivers\\firefox.exe")
            driver = new FirefoxDriver();
        }else {
            System.setProperty("webdriver.InternetExplorer.driver", "C:\\Automation\\Drivers\\InternetExplorer.exe");
//        System.setProperty("wedriver.gecko.driver","C:\\Automation\\Drivers\\firefox.exe")
            driver = new InternetExplorerDriver();
        }
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
//        System.setProperty("wedriver.gecko.driver","C:\\Automation\\Drivers\\firefox.exe")
        driver = new ChromeDriver();
    }
}
