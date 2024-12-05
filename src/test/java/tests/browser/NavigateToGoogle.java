package tests.browser;

import org.testng.annotations.Test;
import pages.google.LandingPage;

public class NavigateToGoogle extends Base {

    @Test
    public void NavigateToAboutPageTest() throws InterruptedException {
        LandingPage landingPage = new LandingPage(driver);
        Thread.sleep(1000);
        landingPage.clickOnAboutButton();
        Thread.sleep(2000);
    }

    @Test
    public void navigateToStorePageTest() throws InterruptedException {
        LandingPage landingPage = new LandingPage(driver);
        Thread.sleep(1000);
        landingPage.clickOnStoreButton();
        Thread.sleep(2000);
    }

    @Test
    public void NavigateToAboutTwoPageTest() throws InterruptedException {
        LandingPage landingPage = new LandingPage(driver);
        Thread.sleep(1000);
        landingPage.clickOnAboutButton();
        Thread.sleep(2000);
    }

}
