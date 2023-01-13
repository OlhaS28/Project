package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyInfo_Page {


    public MyInfo_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "menu_pim_viewMyDetails")
    public WebElement MyInfo;

    @FindBy(xpath = "//a[text()='Contact Details']")
    public WebElement ContactDetails;

    @FindBy(id = "btnSave")
    public WebElement EditBtn;

    @FindBy(id = "contact_street1")
    public WebElement AddressStreet1;

    @FindBy(id = "contact_street2")
    public WebElement AddressStreet2;

    @FindBy(id = "contact_city")
    public WebElement City;
    @FindBy(id = "contact_province")
    public WebElement StateProvince;
    @FindBy(id = "contact_emp_zipcode")
    public WebElement zipPostalCode;

    @FindBy(id = "contact_country")
    public WebElement Country;
    @FindBy(id = "contact_emp_hm_telephone")
    public WebElement HomeTelephone;
    @FindBy(id = "contact_emp_mobile")
    public WebElement Mobile;

    @FindBy(id = "contact_emp_work_telephone")
    public WebElement WorkTelephone;
    @FindBy(id = "contact_emp_work_email")
    public WebElement workEmail;

    @FindBy(id = "contact_emp_oth_email")
    public WebElement otherEmail;

    @FindBy(xpath = "//input[@id=\"btnSave\"]")
    public WebElement SaveBtn;




}
