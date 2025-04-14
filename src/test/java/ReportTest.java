import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class ReportTest {
    ExtentSparkReporter extentSparkReporter;
    ExtentReports extentReports;
    ExtentTest extentTest;

    @BeforeTest
    void startReport(){
        extentSparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/src/test-output/FirstReport.html");//where to save
        extentReports=new ExtentReports();//giving space in RAM
        extentReports.attachReporter(extentSparkReporter);

        extentSparkReporter.config().setDocumentTitle("My First Test Report");//setting properties
        extentSparkReporter.config().setReportName("Extent Report for the Test");

    }

    @AfterMethod
    void performaction(ITestResult result){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chenn\\IdeaProjects\\TestNG_Selenium_22March\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();//create an object for specific browser class
//        WebDriver driver1=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        System.out.println("browser method called");
        extentTest.log(Status.PASS,result.getTestName());
    }

    @Test
    void maintest() throws Exception{
        extentTest=extentReports.createTest("test case title","Name of test");
    }

    @AfterTest
    void savereport(){
        extentReports.flush();//save and close report
    }



}
