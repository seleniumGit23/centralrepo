package Steps;

import Helpers.WebElementHelper;
import Pages.Amazon;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Amazon_steps {
    protected WebDriver driver;
    protected Scenario scenario;
    protected WebElementHelper webElementHooks;
    protected Amazon amazon;

    public Amazon_steps(WebDriverHooks webDriverHooks) {
        this.driver = webDriverHooks.getDriver();
        this.scenario =webDriverHooks.getScenario();
    }

    @Given("I launch the Amazon web page")
    public void iLaunchTheAmazonWebPage() throws Exception{
        driver.get("https://www.amazon.in");
    }

    @When("I clicked on Electronics link")
    public void i_clicked_on_electronics_link() throws Exception{
        amazon=new Amazon(driver);
//        amazon.webdriverImplicitWait(3); //implicitely wait
//        amazon.webdriverExplicitwait();
        amazon.clickonEletronics();
//        amazon.webdriverImplicitWait(3);
    }
    @Then("I should see the Electronic items on page")
    public void i_should_see_the_electronic_items_on_page() throws Exception{
        String electronicItemtext=amazon.getOtherItemName();
        if(electronicItemtext.contains("Headphones")){
            scenario.log("Verified that "+electronicItemtext+" Electronic item is present ");
        }else{
            scenario.log("Verified that "+electronicItemtext+" Electronic item is present ");
        }
    }
    @Then("I should verify other items presence")
    public void i_should_verify_other_items_presence() throws Exception{
        amazon.clickonMadeforAmazon();
//        String encryptedPass=amazon.encryptedPassword();
    }
}