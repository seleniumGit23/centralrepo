import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Testngpractise2 {

    @BeforeSuite
    void laucnhbrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chenn\\IdeaProjects\\TestNG_Selenium_22March\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();//create an object for specific browser class
//        WebDriver driver1=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        System.out.println("browser method called");
    }
}
