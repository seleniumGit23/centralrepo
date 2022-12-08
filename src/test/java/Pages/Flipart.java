package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Flipart {
    WebDriver driver;   // creatting a reference for webdriver interface to get the abstract methods from interface
    public Flipart(WebDriver driver) {
        PageFactory.initElements(driver, this); // it will callout all the attributes or elemets from the page at run time
    }

    @FindBy(how = How.NAME, using = "q")  //it is a annotation which gets the parameter content it will take 2 parameters to process
    private WebElement searchProduct;

    @FindBy(how=How.XPATH,using="//button[@type='submit']")
    private WebElement searchElement;


    @FindBy(how=How.XPATH,using="(//button)[2]")
    private WebElement closeLoginpopup;

    public void enterproduct(String producttype){
        searchProduct.sendKeys(producttype);
    }

    public void clickonsearch(){
        searchElement.click();
    }

    public void clickonclosepopup(){
        closeLoginpopup.click();
    }


}



