package Steps;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Google_Steps {

    protected WebDriver driver;
    protected Scenario scenario;
//    protected Amazon amazon;
    public Google_Steps(WebDriverHooks webDriverHooks) {
        this.driver = webDriverHooks.getDriver();
        this.scenario =webDriverHooks.getScenario();
    }

    @Given("I launch the chrome Browser and navigate to Google home page")
    public void iLaunchTheChromeBrowserAndNavigateToGoogleHomePage() throws Exception {
        driver.get("https://www.google.com");
//        driver.navigate().to("https://www.google.com");
//        driver.navigate().forward();
//        driver.navigate().back();
    }

    @When("I entered the desired {string} string")
    public void iEnteredTheDesiredString(String str) throws Exception {
        driver.findElement(By.name("q")).sendKeys(str, Keys.ENTER);

    }

    @Then("I see the {string} search results are displayed")
    public void iSeeTheSearchResultsAreDisplayed(String text) throws Exception{
        String actText=driver.findElement(By.xpath("//h3[contains(text(),'Amazon.in')]")).getText();
        Assert.assertEquals("Amazon.in is matched from google search engine ",actText,text);
    }


}
