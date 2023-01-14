package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.PerformanceTabPage;
import utilities.Config;
import utilities.Driver;

public class Performance_steps {


    PerformanceTabPage performanceTabPage = new PerformanceTabPage();

    @Given("User is logged in to OrangeHrm Tester account and Performance Page")
    public void user_is_logged_in_to_orange_hrm_tester_account_and_performance_page() {

        Driver.getDriver().get(Config.getProperty("url"));
        performanceTabPage.performanceTab.click();
    }
    @Given("User selects configure")
    public void user_selects_configure() {
performanceTabPage.getConfigureTab.click();
    }
    @Given("User selects Manage Reviews")
    public void user_selects_manage_reviews() {
performanceTabPage.getManageReviewsTab.click();
    }
    @Given("User selects My trackers")
    public void user_selects_my_trackers() {
performanceTabPage.getMyTrackersTab.click();
    }
    @Given("User selects Employee trackers")
    public void user_selects_employee_trackers() {
performanceTabPage.getEmployeeTrackers.click();
    }
    @Given("User selects Employee Reviews")
    public void user_selects_employee_reviews() {
performanceTabPage.getManageReviewsTab.click();
    }
    @Given("User selects Employee Name")
    public void user_selects_employee_name() {
performanceTabPage.getEmployeeNameInput.sendKeys("Alex Bologna");
    }
    @Given("User selects Job Title")
    public void user_selects_job_title() {

    }
    @Given("User selects Sub Unit")
    public void user_selects_sub_unit() {

    }
    @Given("User selects Include")
    public void user_selects_include() {

    }
    @Given("User selects Review Status")
    public void user_selects_review_status() {

    }
    @Given("User selects From Date")
    public void user_selects_from_date() {

    }
    @Given("User selects To Date")
    public void user_selects_to_date() {

    }
    @Given("User should be able to press Submit btn")
    public void user_should_be_able_to_press_submit_btn() {

    }
    @Given("User should be able to press Search btn")
    public void user_should_be_able_to_press_search_btn() {

    }
    @Then("User verifies if the records were found")
    public void user_verifies_if_the_records_were_found() {

    }
}
