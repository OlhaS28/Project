package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchFunctionSteps {
    public class searchFunctionPage {
        public searchFunctionPage(){
            PageFactory.initElements(Driver.getDriver(),this);

        }

        @FindBy(xpath = "//input[@class=\"oxd-input oxd-input--active toggled\"]")
        public WebElement SearchBar;

        @FindBy (xpath = "//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]")
        public WebElement SearchText;




    }
}
