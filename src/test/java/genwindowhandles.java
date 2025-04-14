import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class genwindowhandles {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chenn\\IdeaProjects\\TestNG_Selenium_22March\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
//        String parentwindow=driver.getWindowHandle();
//        System.out.println(parentwindow);
        driver.get("https://www.flipkart.com");
        Set<String> windows=driver.getWindowHandles();
////        String currentwindow=driver.getWindowHandle();
//        driver.switchTo().window("");
        Iterator<String> iterator=windows.iterator();//returns all data into sequence manner
        while(iterator.hasNext()){//0,1,2,3,
            String ChildWindow = iterator.next();
           driver.switchTo().window(ChildWindow);
            System.out.println(ChildWindow);
        }
//        timeouts----2 ways in selenium-----implicit wait(once declared then it wil applicable for all--it will be more
//        and explicit wait (it will be applicable for only specific element)
    }

}
