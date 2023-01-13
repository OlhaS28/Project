package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class OrangeHRMLoginPage {

    public OrangeHRMLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@name=\"username\"]")
    public WebElement usernameInput;

    @FindBy (xpath = "//input[@name=\"password\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement getLoginBtn;

    @FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]")
    public WebElement getErrorMsg;

    @FindBy(xpath = "//h6")
    public WebElement getTabText;


}
