package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Yahoo {

    WebDriver driver;   // creatting a reference for webdriver interface to get the abstract methods from interface
    public Yahoo(WebDriver driver) {
        PageFactory.initElements(driver, this); // it will callout all the attributes or elemets from the page at run time
    }

    @FindBy(how=How.XPATH,using="//div[@title='Sign In']")
    WebElement elementSignInbutton;

    public void clickonSigninbutton(){
        elementSignInbutton.click();
    }


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