package Steps;

import Pages.Flipkart_pages;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AmazonEcomSteps {

    WebDriver driver;
    Scenario scenario;

    public AmazonEcomSteps(WebDriverHooks webDriverHooks) {
        this.driver = webDriverHooks.getDriver();
        this.scenario =webDriverHooks.getScenario();
    }



    @Given("Launch the Flipkart web site")
    public void launchTheFlipkartWebSite() {
        driver.get("https://www.flipkart.com/");
    }

    @When("Search the groceries on Amazon")
    public void searchTheGroceriesOnAmazon() {
        Flipkart_pages amazonPages=new Flipkart_pages(driver);
        amazonPages.searchtheproduct("lux international creamy soap");//you can pass the input
    }

    @And("Add the product")
    public void addTheProduct() {

    }

    @Then("User able to see the added product")
    public void userAbleToSeeTheAddedProduct() {

    }
}
