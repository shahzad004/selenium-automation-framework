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
    private final Logger logger = LogManager.getLogger(Base.class);

    @BeforeMethod
    public void setup() {
        driver = DriverManager.initializeWebDriver();
        driver.get(baseUrl);
        logger.info("Navigating to URL: " + baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        if ( driver != null ) {
            driver.quit();
            logger.info("Driver instance is quit after the test." + baseUrl);
        }
    }

}
