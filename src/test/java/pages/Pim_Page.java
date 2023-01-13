package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Pim_Page {

    public Pim_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='oxd-table-filter']")
    public WebElement PimTab;

    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
    public WebElement EmployeeInfo;

    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill']")
    public WebElement icon;











}
