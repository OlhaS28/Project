package steps;

import com.github.javafaker.Address;
import com.github.javafaker.Code;
import com.github.javafaker.Country;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.ui.Select;
import pages.MyInfo_Page;
import utilities.Config;
import utilities.Driver;

public class MyInfoSteps {


    MyInfo_Page myInfo_page = new MyInfo_Page();
    Faker faker = new Faker();

    @When("clicked on the  My info text link")
    public void clicked_on_the_my_info_text_link() {
        Driver.getDriver().get(Config.getProperty("url"));
    }
    @When("I navigate back and click  on Contact Details")
    public void i_navigate_back_and_click_on_contact_details() {
        myInfo_page.ContactDetails.click();
    }
    @When("I navigate back and click on Edit button")
    public void i_navigate_back_and_click_on_edit_button() {
        myInfo_page.EditBtn.click();
    }
    @When("I navigate back and click Address Street {int}")
    public void i_navigate_back_and_click_address_street(Integer int1) {
        myInfo_page.AddressStreet1.sendKeys("365 Neptune ave, Apt D10");

    }
    @When("I navigate back and click City")
    public void i_navigate_back_and_click_city() {
        myInfo_page.City.sendKeys("Brooklyn");
    }
    @When("I navigate back and click State Province")
    public void i_navigate_back_and_click_state_province() {
        myInfo_page.StateProvince.sendKeys(faker.address().state());
    }
    @When("I navigate back and click Zip Postal Code")
    public void i_navigate_back_and_click_zip_postal_code() {
        myInfo_page.zipPostalCode.sendKeys("11235");
    }
    @When("I navigate back and click Country then select United States fro drop down selection")
    public void i_navigate_back_and_click_country_then_select_united_states_fro_drop_down_selection() {
        Select select = new Select(myInfo_page.Country);
        select.selectByVisibleText("United States");
    }
    @Then("I navigate back and click Home Telephone")
    public void i_navigate_back_and_click_home_telephone() {
        myInfo_page.HomeTelephone.sendKeys("3474456578");
    }
    @Then("I navigate back and click Mobile")
    public void i_navigate_back_and_click_mobile() {
        myInfo_page.Mobile.sendKeys("3472756595");
    }
    @Then("I navigate back and click Work Telephone")
    public void i_navigate_back_and_click_work_telephone() {
        myInfo_page.WorkTelephone.sendKeys("");
    }
    @Then("I navigate back and click Work Email")
    public void i_navigate_back_and_click_work_email() {
        myInfo_page.workEmail.sendKeys("");
    }
    @Then("I navigate back and click Other Email")
    public void i_navigate_back_and_click_other_email() {
        myInfo_page.otherEmail.sendKeys("kana2022@gmail.com");
    }
    @Then("Click the save button")
    public void click_the_save_button() {
        myInfo_page.SaveBtn.click();

    }


}
