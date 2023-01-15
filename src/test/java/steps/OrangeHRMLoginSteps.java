package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ForgotPassOHRMPage;
import pages.OHRMLogoutPage;
import pages.OrangeHRMLoginPage;
import utilities.Config;
import utilities.Driver;

import java.time.Duration;


public class OrangeHRMLoginSteps {
    OrangeHRMLoginPage orangeHRMLoginPage = new OrangeHRMLoginPage();
    ForgotPassOHRMPage forgotPassOHRMPage = new ForgotPassOHRMPage();
    OHRMLogoutPage ohrmLogoutPage = new OHRMLogoutPage();

    @When("User is on Orange HRM login page")
    public void user_is_on_orange_hrm_login_page() {
        Driver.getDriver().get(Config.getProperty("url"));
    }
    @When("User enters correct username {string}")
    public void user_enters_correct_username(String username) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(orangeHRMLoginPage.username));
        orangeHRMLoginPage.username.sendKeys(username);
    }
    @When("User enters correct password {string}")
    public void user_enters_correct_password(String password) {
        orangeHRMLoginPage.password.sendKeys(password);
    }

    @When("User clicks on login Button")
    public void user_clicks_on_login_button() {
        orangeHRMLoginPage.getLoginBtn.click();
    }
    @Then("User should be taken to the Orange HRM Dashboard Page")
    public void user_should_be_taken_to_the_orange_hrm_dashboard_page() {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(orangeHRMLoginPage.getDashboardText));
        Assert.assertTrue(orangeHRMLoginPage.getDashboardText.isDisplayed());
    }

    //Negative Scenario Variation
    @Then("User should see an error message and be able to verify error message is displayed on page")
    public void user_should_see_an_error_message_and_be_able_to_verify_error_message_is_displayed_on_page() {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(orangeHRMLoginPage.getErrorMsg));
        Assert.assertTrue(orangeHRMLoginPage.getErrorMsg.isDisplayed());
    }
    @Then("User should be logged in and taken to the Dashboard Tab and should be able to click on picture icon")
    public void user_should_be_logged_in_and_taken_to_the_dashboard_tab_and_should_be_able_to_click_on_picture_icon() {
        ohrmLogoutPage.getIdPicture.click();
    }

    @Then("User will then be able to see the dropdown menu and click on the Logout option")
    public void user_will_then_be_able_to_see_the_dropdown_menu_and_click_on_the_logout_option() {
        ohrmLogoutPage.getLogoutOption.click();
    }

    @Then("User should taken back to the Login page")
    public void user_should_taken_back_to_the_login_page() {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(orangeHRMLoginPage.getGetLoginText));
        Assert.assertTrue(orangeHRMLoginPage.getGetLoginText.isDisplayed());
    }
    //forgot Password Scenario

    @When("Admin user enters username and password")
    public void adminUserEntersUsernameAndPassword() {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(orangeHRMLoginPage.username));
        orangeHRMLoginPage.username.sendKeys(Config.getProperty("username"));
        orangeHRMLoginPage.password.sendKeys(Config.getProperty("pass"));
    }


    @Given("User clicks on forgot your password link")
    public void user_clicks_on_forgot_your_password_link() {
        Driver.getDriver().get(Config.getProperty("url"));
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(forgotPassOHRMPage.getForgotPassLink));
     forgotPassOHRMPage.getForgotPassLink.click();
    }
    @Then("User should be taken to the password reset page and enters correct username {string}")
    public void user_should_be_taken_to_the_password_reset_page_and_enters_correct_username(String username) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(forgotPassOHRMPage.usernameInput));
        forgotPassOHRMPage.usernameInput.sendKeys(username);
    }
    @Then("User clicks on Reset password button")
    public void user_clicks_on_reset_password_button() {
        forgotPassOHRMPage.getResetPassBtn.click();
    }
    @Then("User should see a Reset Password link sent successfully confirmation message")
    public void user_should_see_a_reset_password_link_sent_successfully_confirmation_message() {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(forgotPassOHRMPage.getResetSuccessMsg));
        Assert.assertTrue(forgotPassOHRMPage.getResetSuccessMsg.isDisplayed());

    }
}



