package Pages;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Google {

    WebDriver driver;   // creatting a reference for webdriver interface to get the abstract methods from interface
    public Google(WebDriver driver) {
        PageFactory.initElements(driver, this); // it will callout all the attributes or elemets from the page at run time
    }

    @FindBy(how=How.XPATH,using="//input[@title='Search']")
    WebElement elementSearchbox;

    public void entervalue(String searchitem){
        elementSearchbox.sendKeys(searchitem);
    }

    public boolean verifysearchbox(){
        return elementSearchbox.isDisplayed();
    }

    @FindBy(how=How.XPATH,using="//select")
    WebElement select_element;

    public void selectCountry(String countryname){
        Select select=new Select(select_element);
        select.selectByIndex(9);
        select.selectByVisibleText(countryname);

    }

    public String fetchSelectedCountry(){
        Select select=new Select(select_element);
        return select.getFirstSelectedOption().getText();
    }





//    WebDriver driver;   // creatting a reference for webdriver interface to get the abstract methods from interface
//    public Google(WebDriver driver) {
//        PageFactory.initElements(driver, this); // it will callout all the attributes or elemets from the page at run time
//    }
//
//    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Electronics')]")  //it is a annotation which gets the parameter content it will take 2 parameters to process
//    private WebElement linkElectronics;
//
//    @FindBy(how = How.XPATH, using = "//span[text()='Home Audio']")
//    private WebElement OtherItem;
//
//    @FindBy(how = How.XPATH, using = "//i[@class='a-icon a-icon-checkbox']/parent::label/parent::div/following-sibling::span[contains(text(),'Made for Amazon')]")
//    private WebElement madeforAmazon;
//
//    public String getOtherItemName(){
//        return OtherItem.getText();
//    }
//
//    public void clickonEletronics() {
//        linkElectronics.click();
//    }
//
//    public void clickonMadeforAmazon(){
//        madeforAmazon.click();
//    }
//
//    public String encryptedPassword(){
//        byte[] encodedBytes = Base64.encodeBase64("Password".getBytes());
//        return new String(encodedBytes);
//    }
//
//    public String decryptedPassword(String encryptedPassValue){
//        byte[] decodedBytes = Base64.decodeBase64(encryptedPassValue);
//        return new String(decodedBytes);
//    }
//
//    public void webdriverImplicitWait(int TimeOut){
//        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
//    }
//
//    public void webdriverExplicitwait(By loc){
//        WebDriverWait wait=new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
//    }

}

// Explicit wait types on ExpectedConditions
//    alertIsPresent()
//    elementSelectionStateToBe()
//    elementToBeClickable()
//    elementToBeSelected()
//    frameToBeAvaliableAndSwitchToIt()
//    invisibilityOfTheElementLocated()
//    invisibilityOfElementWithText()
//    presenceOfAllElementsLocatedBy()
//    presenceOfElementLocated()
//    textToBePresentInElement()
//    textToBePresentInElementLocated()
//    textToBePresentInElementValue()
//    titleIs()
//    titleContains()
//    visibilityOf()
//    visibilityOfAllElements()
//    visibilityOfAllElementsLocatedBy()
//    visibilityOfElementLocated()