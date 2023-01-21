package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LeaveTabPage {
    public LeaveTabPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h6[.='Leave']")
    public WebElement leavePageText;

    @FindBy(xpath = "//span[@ class=\"oxd-topbar-body-nav-tab-item\"]")
    public WebElement entitlementsTab;

    @FindBy(css = "a[class=\"oxd-topbar-body-nav-tab-link\"]")
    public WebElement addElementTab;

    @FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p orangehrm-main-title\"]")
    public WebElement addLeaveEntitlementText;

    @FindBy(xpath = "(//a[@ class=\"oxd-topbar-body-nav-tab-item\"])[2]")
    public WebElement myLeaveListTab;

    @FindBy (xpath = "//h5")
    public WebElement myLeaveListTxt;

}
