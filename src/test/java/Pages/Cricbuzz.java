package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class Cricbuzz {
    WebDriver driver;
    public Cricbuzz(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how=How.XPATH,using="//div[text()='More']")
    private WebElement linkMore;

    @FindBy(how=How.CSS,using="a[title='Cricket Quiz']")
    private WebElement linkQuiz;

    @FindBy(how=How.XPATH,using="//a[contains(text(),'Can you connect the DRS dots?')]")
    private WebElement linkText;

//    private By element=By.xpath("");

    public void clickonMorelink(){
        linkMore.click();
    }

    public void selectQuizitem(){
        linkQuiz.click();
    }

    public String gettextofItem(){
        return linkText.getText();
    }

}
