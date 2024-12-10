package tests.browser;

import enums.WaitStrategy;
import org.testng.annotations.Test;
import pages.google.LandingPage;

public class NavigateToGoogle extends Base {

    @Test
    public void NavigateToAboutPageTest() {
        LandingPage landingPage = new LandingPage(driver);
        WaitUtils.globalWait();
        WaitUtils.waitForPresence(driver, landingPage.gmailButton);
        WaitUtils.applyWait(driver, landingPage.aboutButton, WaitStrategy.CLICKABLE);
        landingPage.clickOnAboutButton();
        WaitUtils.globalWait();
    }

    @Test
    public void navigateToStorePageTest() {
        LandingPage landingPage = new LandingPage(driver);
        WaitUtils.globalWait();
        WaitUtils.applyWait(driver, landingPage.storeButton, WaitStrategy.CLICKABLE);
        landingPage.clickOnStoreButton();
        WaitUtils.globalWait();
    }

    @Test
    public void NavigateToAboutTwoPageTest() {
        LandingPage landingPage = new LandingPage(driver);
        WaitUtils.globalWait();
        WaitUtils.applyWait(driver, landingPage.aboutButton, WaitStrategy.CLICKABLE);
        landingPage.clickOnAboutButton();
        WaitUtils.globalWait();
    }

}
