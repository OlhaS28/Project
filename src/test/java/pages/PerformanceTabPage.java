package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PerformanceTabPage {
    public PerformanceTabPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public WebElement getTabByText(String tabName) {

        WebElement tab = Driver.getDriver().findElement(By.xpath("//span[.='" + tabName + "']"));
        return tab;
    }


    @FindBy(xpath = "//span[.=\"Performance\"]")
    public WebElement performanceTab;
    @FindBy(xpath = "(//span[@class=\"oxd-topbar-body-nav-tab-item\"])[1]")
    public WebElement getConfigureTab;
    @FindBy(xpath = "(//span[@class=\"oxd-topbar-body-nav-tab-item\"])[2]")
    public WebElement getManageReviewsTab;
    @FindBy(xpath = "(//a[@class=\"oxd-topbar-body-nav-tab-item\"])[1]")
    public WebElement getMyTrackersTab;
    @FindBy(xpath = "(//a[@class=\"oxd-topbar-body-nav-tab-item\"])[2]")
    public WebElement getEmployeeTrackers;
    @FindBy(xpath = "[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]")
    public WebElement getEmployeeNameInput;

}
