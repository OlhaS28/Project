package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.devtools.v103.page.Page;
import pages.Pim_Page;
import utilities.Config;
import utilities.Driver;

public class PIMStep {

    Pim_Page pimPage = new Pim_Page();

    Faker faker = new Faker();

    @Given("I am in the OrangeHRM page")
    public void i_am_in_the_orange_hrm_page() {
        Driver.getDriver().get(Config.getProperty("url"));
    }
    @When("clicked on the  PIM text link")
    public void clicked_on_the_pim_text_link() {
       pimPage.PimTab.click();
    }
    @When("I navigate back and click  on Employee List")
    public void i_navigate_back_and_click_on_employee_list() {
        pimPage.EmployeeInfo.click();
    }









}
