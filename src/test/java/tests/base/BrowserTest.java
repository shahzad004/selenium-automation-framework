package tests.base;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserTest extends BaseTest {

    @Test
    public void myBrowserTest() {
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();

        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");

        Assert.assertEquals(actualUrl, expectedUrl, "Failed");
    }

    @Test
    public void myBrowserTestTwo() throws InterruptedException {
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();

        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");

        Assert.assertEquals(actualUrl, expectedUrl, "Failed");
    }
}
