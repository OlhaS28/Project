package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Login_Page;
import utilities.Config;
import utilities.Driver;

public class LoginSteps {


    Login_Page loginPage = new Login_Page();
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(Config.getProperty("url"));

    }

    @When("I enter username")
    public void i_enter_username() {
    loginPage.UserName.sendKeys("Admin");
    }

    @When("I enter password")
    public void i_enter_password() {
     loginPage.Password.sendKeys("admin123");
    }

    @When("click the Login button")
    public void click_the_login_button() {
    loginPage.Login.click();

    }



}
