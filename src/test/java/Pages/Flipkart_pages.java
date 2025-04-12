package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_pages {

    //locators and methods going to work on

    //lux international creamy soap
    WebDriver driver;//opened browser to control here


    public Flipkart_pages(WebDriver driver) {
        PageFactory.initElements(driver, this); // it will callout all the attributes or elemets from the page at run time
    }

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search for Products, Brands and More']")  //it is a annotation which gets the parameter content it will take 2 parameters to process
    private WebElement flipkart_Search_Input;


    @FindBy(how = How.XPATH, using = "//button[@title='Search for Products, Brands and More']")  //it is a annotation which gets the parameter content it will take 2 parameters to process
    private WebElement search_Btn;

    @FindBy(how=How.XPATH, using="//a[contains(text(),'LUX International Creamy Perfection Bar,Bathing Soap')]")
    private WebElement luxProduct;

    public void searchtheproduct(String product){//customized method,  should take any input
        flipkart_Search_Input.sendKeys(product);
        search_Btn.click();
    }


    //implicit wait---applicable for all elements in specific page class
    //explicit wait---specific element only instead keeping in touch all elements


    public void addtheProduct(){
        luxProduct.click();
        driver.switchTo().window(driver.getWindowHandle());

    }


}
