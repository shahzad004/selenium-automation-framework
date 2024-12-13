package tests.browser;

import enums.WaitStrategy;
import org.testng.annotations.Test;
import pages.google.LandingPage;

import java.util.ArrayList;
import java.util.List;


public class SimpleSeleniumTest extends Base {

        @Test
        public void simpleTest() {
            LandingPage googleLandingpage = new LandingPage(driver);
            WaitUtils.applyWait(driver, googleLandingpage.aboutButton, WaitStrategy.CLICKABLE);
            googleLandingpage.clickOnAboutButton();
            WaitUtils.globalWait();
        }

}
