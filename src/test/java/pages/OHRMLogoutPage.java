package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class OHRMLogoutPage {
    public OHRMLogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@alt=\"profile picture\"]")
    public WebElement getIdPicture;

    @FindBy(xpath = "//ul[@class=\"oxd-dropdown-menu\"]")
    public WebElement getDropdownMenu;

    @FindBy(xpath = "//a[@href=\"/web/index.php/auth/logout\"]")
    public WebElement getLogoutOption;
}
