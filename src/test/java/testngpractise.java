import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngpractise {
    WebDriver driver;
    @BeforeTest
    void launchbrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chenn\\IdeaProjects\\TestNG_Selenium_22March\\src\\test\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Test
    void launch_homepage(){
        driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
    }
}
