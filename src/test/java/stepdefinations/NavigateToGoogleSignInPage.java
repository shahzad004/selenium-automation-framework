package stepdefinations;

import config.ConfigManager;
import enums.WaitStrategy;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.google.LandingPage;
import pages.google.SignInPage;
import tests.browser.Base;
import tests.browser.DriverManager;
import tests.browser.WaitUtils;

public class NavigateToGoogleSignInPage extends Base {

    public LandingPage googleLandingPage;
    public SignInPage googleSignInPage;

//    @Before
//    public void prepare() {
//        this.googleLandingPage = new LandingPage(DriverManager.getDriver());
//    }

    @Given("User is on google dashboard")
    public void user_is_on_google_dashboard() {}

    @When("I will click on google signIn button")
    public void i_will_click_on_google_sign_in_button() {
        this.googleLandingPage = new LandingPage(DriverManager.getDriver());
        WaitUtils.globalWait();
        WaitUtils.applyWait(driver, googleLandingPage.signInButton, WaitStrategy.CLICKABLE);
        WaitUtils.globalWait();
        googleLandingPage.clickOnSignInButton();
        WaitUtils.globalWait();
    }

    @Then("I should see Use your Google Account text on signin page")
    public void i_should_see_use_your_google_account_text_on_sign_in_page() {
        this.googleSignInPage = new SignInPage(DriverManager.getDriver());
        String actualText = googleSignInPage.useYourGoogleAccount.getText();
        String expectedText = "Use your Google Account";
        Assert.assertEquals(actualText, expectedText, "The text dose not match.");
    }



}
