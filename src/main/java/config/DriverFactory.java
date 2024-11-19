package config;

import enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    // WebDriver instance used across the test execution
    public static WebDriver driver;

    /**
     * Initializes and returns a WebDriver instance based on the configured browser.
     * The browser configuration is retrieved from the ConfigManager.
     * If "isHeadless" is true, the browser will run in headless mode.
     *
     * @return the initialized WebDriver instance for the configured browser
     */
    public static WebDriver initializeWebDriver() {

        // Get the browser type (e.g., CHROME, FIREFOX, EDGE, SAFARI) from the configuration
        Browser browser = Browser.valueOf(ConfigManager.getProperty("browser").toUpperCase());

        // Get the headless mode flag from the configuration (true or false)
        boolean isHeadless = Boolean.parseBoolean(ConfigManager.getProperty("isHeadless"));
        System.out.println("Loaded configuration with headless mode: " + isHeadless);

        // Switch between different browser types and set up WebDriver accordingly
        switch (browser) {
            case CHROME:
                // Setup ChromeDriver using WebDriverManager to handle dependencies
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                // Add headless arguments if configured
                if (isHeadless) {
                    chromeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920x1080");
                }
                driver = new ChromeDriver(chromeOptions);  // Instantiate ChromeDriver with the options
                break;

            case FIREFOX:
                // Setup FirefoxDriver using WebDriverManager to handle dependencies
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                // Add headless arguments if configured
                if (isHeadless) {
                    firefoxOptions.addArguments("--headless");
                }
                driver = new FirefoxDriver(firefoxOptions);  // Instantiate FirefoxDriver with the options
                break;

            case EDGE:
                // Setup EdgeDriver using WebDriverManager to handle dependencies
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                // Add headless arguments if configured
                if (isHeadless) {
                    edgeOptions.addArguments("--headless");
                }
                driver = new EdgeDriver(edgeOptions);  // Instantiate EdgeDriver with the options
                break;

            case SAFARI:
                // Setup SafariDriver (no options for headless support)
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();  // Instantiate SafariDriver
                break;

            default:
                // Throw an exception if the specified browser is unsupported
                throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        // Maximize the browser window to ensure the window size is consistent across tests
        driver.manage().window().maximize();

        // Return the instantiated WebDriver
        return driver;
    }

    /**
     * Quits the current WebDriver instance and closes the browser.
     * This method should be called after the test execution is complete.
     */
    public static void quitDriver() {
        // Only quit if the driver is initialized
        if (driver != null) {
            driver.quit();  // Close the browser and clean up resources
        }
    }
}
