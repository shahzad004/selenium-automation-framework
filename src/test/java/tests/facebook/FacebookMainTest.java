package tests.facebook;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.facebook.FacebookLoginPage_PF;
import utils.WaitUtils;

public class FacebookMainTest extends BaseTest {


    @Test
    public void enterEmailAndPassword() {

        FacebookLoginPage_PF facebookPageFactory = new FacebookLoginPage_PF(driver);
        String expectedUrl = "https://www.facebook.com/";
        String currentUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, currentUrl, "User did not navigated to correct url");

        facebookPageFactory.enterEmailAddress("john_doe@gmail.com");

        WaitUtils.applyGlobalWait();

        facebookPageFactory.enterPassword("john_doe123!@#");

        WaitUtils.applyGlobalWait();

        facebookPageFactory.clickOnLoginButton();

        WaitUtils.applyGlobalWait();

    }
}
