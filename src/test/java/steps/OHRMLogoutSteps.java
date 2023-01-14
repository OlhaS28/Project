package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.OHRMLogoutPage;
import pages.OrangeHRMLoginPage;
import utilities.Config;
import utilities.Driver;


public class OHRMLogoutSteps {
    OrangeHRMLoginPage orangeHRMLoginPage = new OrangeHRMLoginPage();
    OHRMLogoutPage ohrmLogoutPage = new OHRMLogoutPage();

    @When("User is on OrangeHRM login page")
    public void user_is_on_orange_hrm_login_page() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @When("User enters correct username")
    public void user_enters_the_correct() {
        Driver.getDriver().get(Config.getProperty("username"));
    }
    @When("User enters correct password")
    public void user_enters_correct() {

        Driver.getDriver().get(Config.getProperty("pass"));
    }
    @When("User clicks on login button")
    public void user_clicks_on() {

        orangeHRMLoginPage.getLoginBtn.click();
    }
    @When("User should be logged in and taken to the Dashboard Tab and should be able to click on picture icon")
    public void user_should_be_logged_in_and_taken_to_the_Dashboard_Tab_and_should_be_able_to_click_on_picture_icon() {
        Driver.getDriver().get(Config.getProperty("ohrmLogoutURL"));
        ohrmLogoutPage.getIdPicture.click();
    }
    @And("User will then be able to see the dropdown menu and click on the Logout option")
    public void user_will_then_be_able_to_see_the_dropdown_menu_and_click_on_the_Logout_option(){
        ohrmLogoutPage.getDropdownMenu.click();
        Select select = new Select(ohrmLogoutPage.getLogoutOption);
        select.selectByIndex(3);
    }
    @Then("User should taken back to the Login page")
    public void user_should_taken_back_to_the_Login_page(){

        Driver.getDriver().get(Config.getProperty("url"));
    }
}
