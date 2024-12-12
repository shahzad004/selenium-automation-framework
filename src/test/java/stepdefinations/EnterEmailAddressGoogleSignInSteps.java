package stepdefinations;

import constants.ApplicationConstants;
import constants.ApplicationErrorConstants;
import enums.WaitStrategy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.google.LandingPage;
import pages.google.PasswordPage;
import pages.google.SignInPage;
import tests.browser.Base;
import tests.browser.DriverManager;
import tests.browser.WaitUtils;


public class EnterEmailAddressGoogleSignInSteps extends Base {

    public LandingPage googleLandingPage;
    public SignInPage googleSignInPage;

    @Given("User is on google dashboardd")
    public void user_is_on_google_dashboard() {}

    @When("I will click on google signIn buttond")
    public void i_will_click_on_google_sign_in_button() {
        this.googleLandingPage = new LandingPage(DriverManager.getDriver());
        WaitUtils.applyWait(driver, googleLandingPage.signInButton, WaitStrategy.CLICKABLE);
        googleLandingPage.clickOnSignInButton();
    }

    @Then("I should see Use your Google Account text on signin paged")
    public void i_should_see_use_your_google_account_text_on_sign_in_page() {
        this.googleSignInPage = new SignInPage(DriverManager.getDriver());
        String actualText = googleSignInPage.useYourGoogleAccount.getText();
        String expectedText = "Use your Google Account";
        Assert.assertEquals(actualText, expectedText, "The text dose not match.");
    }

    @When("I enter an email address")
    public void i_enter_an_email_address() {
        googleSignInPage.enterEmailAddress("someone123@gmail.com");
    }

    @And("I click on next button")
    public void i_click_on_next_button() {
        googleSignInPage.clickOnNextButton();
        WaitUtils.globalWait();
    }

    @Then("I should see welcome text")
    public void i_should_see_welcome_text() {
        PasswordPage googlePasswordPage = new PasswordPage(DriverManager.getDriver());
        String expectedText = ApplicationConstants.GOOGLE_SIGN_IN_WELCOME_TEXT;
        String actualText = googlePasswordPage.welcomeText.getText();
        Assert.assertEquals(actualText, expectedText, ApplicationErrorConstants.NO_MATCH_ERROR);
        WaitUtils.globalWait();
    }


}
