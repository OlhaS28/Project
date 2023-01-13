package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login_Page {

    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath ="(//*[@class='oxd-input oxd-input--active'])[1]")
    public WebElement UserName;

    @FindBy(xpath = "(//*[@name='password'])[1]")
    public WebElement Password;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement Login;



}
