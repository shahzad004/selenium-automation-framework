package stepdefinations;

import base.BaseTest;
import config.ConfigManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Before;
import pages.amazon.CreateYourAmazonAccount_PF;
import pages.amazon.Dashboard_PF;
import pages.amazon.SignInPage_PF;

public class CreateAmazonAccountSteps extends BaseTest {

    Dashboard_PF amazonDashboardPage;
    SignInPage_PF amazonSignInPage;
    CreateYourAmazonAccount_PF amazonCreateAccountPage;

    @Before
    public void setupDriver() {
        setup();
        this.amazonDashboardPage = new Dashboard_PF(driver);
        this.amazonSignInPage = new SignInPage_PF(driver);
        this.amazonCreateAccountPage = new CreateYourAmazonAccount_PF(driver);
    }

    @Given("I am on the amazon web page")
    public void I_am_on_the_amazon_web_page() {
        driver.get(ConfigManager.getProperty("baseUrl"));
    }

    @When("I click on signIn button")
    public void I_click_on_signIn_button() {
        amazonDashboardPage.clickOnSignInButton();
    }

    @Then("I click on Create amazon account button")
    public void I_click_on_create_amazon_account_button() {
        amazonSignInPage.clickOnCreateYourAmazonAccount();
    }

    @And("I will enter username as value for your name field")
    public void I_will_enter_username_as_value_for_your_name_field() {
        amazonCreateAccountPage.enterFullName("John Doe");
    }

    @And("I will enter phone number as value for phone number field")
    public void I_will_enter_phone_number_as_value_for_phone_number_field() {
        amazonCreateAccountPage.enterEmailAddressOrPhoneNumber(303313333);
    }


    @And("I will enter password as a valid password value for password field")
    public void I_will_enter_password_as_a_valid_password_as_a_value_for_password_field() {
        amazonCreateAccountPage.enterPassword("JohnDoe!@#123");
    }

    @And("I will re-enter the password as a valid password value")
    public void I_will_re_enter_the_password_as_a_valid_password_value() {
        amazonCreateAccountPage.reEnterPassword("JohnDoe!@#123");
    }

    @Then("I click on verify mobile number button")
    public void I_click_on_verify_mobile_number_button() {
        amazonCreateAccountPage.clickOnContinueButton();
    }

    @After
    public void tearDownDriver() {
        tearDown();
    }


}
