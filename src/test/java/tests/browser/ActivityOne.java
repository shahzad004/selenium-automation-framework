package tests.browser;

import org.testng.annotations.Test;
import pages.google.LandingPage;

public class ActivityOne extends Base {

    @Test
    public void test() {
        LandingPage page = new LandingPage(driver);
        page.clickOnSignInButton();
        WaitUtils.globalWait();
    }

}
