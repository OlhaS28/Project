package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ForgotPassOHRMPage;
import pages.OrangeHRMLoginPage;
import utilities.Driver;


public class OrangeHRMLoginSteps {

    OrangeHRMLoginPage orangeHRMLoginPage = new OrangeHRMLoginPage();
    ForgotPassOHRMPage forgotPassOHRMPage = new ForgotPassOHRMPage();
    String expectedErrorMsg = "Invalid credentials";
    @When("User is on OrangeHRM login page")
    public void user_is_on_orange_hrm_login_page() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @When("User enters correct username")
    public void user_enters_the_correct_username() {
        orangeHRMLoginPage.username.sendKeys("Admin");
    }

    @When("User enters correct password")
    public void user_enters_correct_password() {
        orangeHRMLoginPage.password.sendKeys("admin123");
    }

    @When("User enters incorrect password")
    public void user_enters_incorrect_password() {
        orangeHRMLoginPage.password.sendKeys("admin321");
    }

    @When("User clicks on login button")
    public void user_clicks_on() {
        orangeHRMLoginPage.getLoginBtn.click();
    }
    @Then("User should be logged in and taken to the Dashboard Tab be able to verify \"tabText\" is displayed on page")
    public void user_should_be_logged_in_and_taken_to_the_dashboard_tab_be_able_to_verify_tabText_is_displayed_on_page() {
        orangeHRMLoginPage.getTabText.isDisplayed();
    }
    //negative scenario

    @Then("User should see an error message and be able to verify error message is displayed on page")
    public void user_should_see_an_error_message_and_be_able_to_verify_error_message_is_displayed_on_page() {
        forgotPassOHRMPage.getResetPassBtn.click();
        Assert.assertEquals(expectedErrorMsg,orangeHRMLoginPage.getErrorMsg);
    }




}



