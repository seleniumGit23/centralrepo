package Steps;

import Pages.Google;
import Pages.Yahoo;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Yahoo_Steps {

    protected WebDriver driver;
    protected Scenario scenario;

    public Yahoo_Steps(WebDriverHooks webDriverHooks) {
        this.driver = webDriverHooks.getDriver();
        this.scenario =webDriverHooks.getScenario();
    }

    @Given("Launch the Yahoo web site")
    public void launchTheYahooWebSite() {
        driver.get("https://in.search.yahoo.com/");
    }

    @Then("Verify the Sign in button is displayed")
    public void verifyTheSignInButtonIsDisplayed() {
        Yahoo yahoo=new Yahoo(driver);
        yahoo.clickonSigninbutton();
    }

    @And("Something")
    public void something() {

    }
}
