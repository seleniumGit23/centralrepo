import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class LaunchBrowser {


    public static void main(String[] args) {

        //launch chrome browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chenn\\IdeaProjects\\TestNG_Selenium_22March\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();//create an object for specific browser class
//        WebDriver driver1=new ChromeDriver();
        driver.get("https://www.flipkart.com/");//to open URL in browser

//        driver.findElement(By.xpath("(//*[text()='Mobiles'])[1]")).click();
//
//        driver.findElement(By.xpath("anyxapth")).click();
//        System.out.println(driver.getTitle());

        driver.manage().window().maximize();//to maximize your browser
////        driver.manage().window().minimize();
////        driver.close();//will close onlt current browser
////        driver.get("https://www.google.co.in/");
//        driver.navigate().to("https://www.google.co.in/");
////        driver.quit();
//        System.out.println(driver.getTitle());
//        WebElement element=driver.findElement(By.id("dropdown"));
//        Select select =new Select(element);
////        select.selectByVisibleText("Option 1");
//        List<WebElement> options=select.getOptions();
//        System.out.println(options.get(1).getText());

        List<WebElement> alllinks=driver.findElements(By.xpath("//a"));

        System.out.println("total number of links in Flipkart home page "+alllinks.size());

        driver.getWindowHandles();//
//        click(), sendKeys()
    }

}
