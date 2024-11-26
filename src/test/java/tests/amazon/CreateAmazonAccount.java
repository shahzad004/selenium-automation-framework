package tests.amazon;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.amazon.CreateYourAmazonAccount_PF;
import pages.amazon.Dashboard_PF;
import pages.amazon.SignInPage_PF;
import utils.WaitUtils;

public class CreateAmazonAccount extends BaseTest {


    @Test
    public void createAccount() {
        var amazonDashboardPage = new Dashboard_PF(driver);
        var amazonSignInPage = new SignInPage_PF(driver);
        var amazonCreateYourAccountPage = new CreateYourAmazonAccount_PF(driver);
        amazonDashboardPage.clickOnSignInButton();
        WaitUtils.applyGlobalWait();
        amazonSignInPage.clickOnCreateYourAmazonAccount();
        WaitUtils.applyGlobalWait();
        amazonCreateYourAccountPage.enterFullName("John Doe");
        amazonCreateYourAccountPage.enterEmailAddressOrPhoneNumber("JohnDoe@gmail.com");
        amazonCreateYourAccountPage.enterPassword("JohnDoe!@#123");
        amazonCreateYourAccountPage.reEnterPassword("JohnDoe!@#123");
        amazonCreateYourAccountPage.clickOnContinueButton();
        WaitUtils.applyGlobalWait();

    }

}
