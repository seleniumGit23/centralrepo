package Steps;

import Helpers.WebElementHelper;
import Pages.Amazon;
import Pages.Flipart;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Flipkart_steps_new {

    protected WebDriver driver;
    protected Scenario scenario;
    protected Flipart flipkart;
    protected WebDriverHooks webDriverHooks;

    public Flipkart_steps_new(WebDriverHooks webDriverHooks){
        this.driver = webDriverHooks.getDriver();
        this.scenario =webDriverHooks.getScenario();
    }

    @Given("User Launch the Flipkart website")
    public void user_launch_the_flipkart_website() {
        driver.get("https://www.flipkart.com");
    }
    @When("User search the {string} in search box")
    public void user_search_the_in_search_box(String producttype) {
        flipkart=new Flipart(driver);
        flipkart.clickonclosepopup();
        flipkart.enterproduct(producttype);
        flipkart.clickonsearch();
    }
    @Then("User validates the {string} content is displayed")
    public void userValidatesTheContentIsDisplayed(String searcheditem) {
        if(driver.getTitle().contains(searcheditem)){
            System.out.println(searcheditem+" items are displayed successfully");
        }

    }

    @When("User search the <{string}> in search box")
    public void userSearchTheInSearchBox(String producttype) {
        flipkart=new Flipart(driver);
        flipkart.clickonclosepopup();
        flipkart.enterproduct(producttype);
        flipkart.clickonsearch();
    }


    @Then("User validates the {string} contents is displayed")
    public void userValidatesTheContentsIsDisplayed(String searcheditem) {
        if(driver.getTitle().contains(searcheditem)){
            System.out.println(searcheditem+" items are displayed successfully");
        }
    }
}
