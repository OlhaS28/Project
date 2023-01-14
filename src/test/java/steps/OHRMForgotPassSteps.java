package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v102.css.model.Value;
import pages.ForgotPassOHRMPage;

public class OHRMForgotPassSteps {

    ForgotPassOHRMPage forgotPassOHRMPage = new ForgotPassOHRMPage();
    String expectedMsg = "Reset Password link sent successfully";


    @When("User clicks on forgot password link")
    public void user_clicks_on_forgot_password_link() {
        forgotPassOHRMPage.getForgotPassLink.click();
    }

    @And("User enters username in the input field")
    public void user_enters_username_in_the_input_field(){
        forgotPassOHRMPage.usernameInput.sendKeys("Admin");

    }
    @And("User clicks on reset password button")
    public void user_clicks_on_reset_password_button() {
        forgotPassOHRMPage.getResetPassBtn.click();
    }


    @Then("User should see a confirmation message and be able to verify it is displayed on page")
    public void user_should_see_a_confirmation_message_and_be_able_to_verify_it_is_displayed_on_page() {

       Assert.assertEquals(expectedMsg,forgotPassOHRMPage.getResetSuccessMsg);

    }

}
