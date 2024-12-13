package stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.google.LandingPage;
import tests.browser.Base;

public class NavigateToGoogleStorePageSteps extends Base {

    LandingPage googleLandingPage;

    @Before
    public void setup() {
        super.setup();
        this.googleLandingPage = new LandingPage(driver);
    }

    @Given("I am on the google page")
    public void i_am_on_the_google_page() {}

    @When("I click on store button")
    public void i_click_on_store_button() {
//        googleLandingPage.clickOnStoreButton();
    }
    @Then("I should see store page")
    public void i_should_see_store_page() throws InterruptedException {
        Thread.sleep(2000);
    }

    @After
    public void tearDown() {
        super.tearDown();
    }

}
