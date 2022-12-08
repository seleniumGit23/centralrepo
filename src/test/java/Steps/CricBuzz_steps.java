package Steps;

import Pages.Cricbuzz;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CricBuzz_steps {
    WebDriver driver;
    Cricbuzz cricbuzz;
    public CricBuzz_steps(WebDriverHooks webDriverHooks) {
        this.driver = webDriverHooks.getDriver();
//        this.scenario =webDriverHooks.getScenario();
    }
    @Given("I launch the {string} webpage")
    public void iLaunchTheWebpage(String strUrl) throws Exception{
        driver.get(strUrl);
    }

    @When("I clicked on More link")
    public void iClickedOnMoreLink() throws Exception{
        cricbuzz=new Cricbuzz(driver);
        cricbuzz.clickonMorelink();
    }

    @And("I clicked on Quiz link")
    public void iClickedOnQuizLink() throws Exception{
        cricbuzz.selectQuizitem();
    }

    @Then("I should see the Quiz page loaded successfully")
    public void iShouldSeeTheQuizPageLoadedSuccessfully() throws Exception{
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        String actualItemvalue=cricbuzz.gettextofItem();
        Assert.assertEquals("Comparing the text ",actualItemvalue,"Can you connect the DRS dots?");

    }
}
