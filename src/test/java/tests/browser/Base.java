package tests.browser;

import config.ConfigManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

    public WebDriver driver;
    private final String baseUrl = ConfigManager.getProperty("baseUrl");
    private final Logger logger = LogManager.getLogger(this);

    @BeforeMethod
    public void setup() {
        driver = DriverManager.getDriver();
        driver.get(baseUrl);
        logger.info("Navigating to URL: {}", baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
        logger.info("Driver instance is quit after the test.");
    }

}
