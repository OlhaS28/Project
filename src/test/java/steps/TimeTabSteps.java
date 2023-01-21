package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TimeTabSteps {
    public class timeTabPage {
        public timeTabPage(){
            PageFactory.initElements(Driver.getDriver(),this);

        }

        @FindBy(xpath ="//span[.=\"Time\"]")
        public WebElement timeBtn;

        @FindBy (xpath ="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
        public WebElement viewBtn;


    }
}
