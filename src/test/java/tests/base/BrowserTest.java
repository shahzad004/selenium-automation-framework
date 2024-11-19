package tests.base;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserTest extends BaseTest {

    @Test
    public void myBrowserTest() {
        String expectedUrl = "https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();

        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");

        Assert.assertEquals(actualUrl, expectedUrl, "Failed");
    }


}
