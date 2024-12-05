package tests.browser;

import config.ConfigManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {

   private static WebDriver driver;

    public static WebDriver initializeWebDriver() {

        String browserName = ConfigManager.getProperty("browser").toUpperCase();

        switch (browserName) {
            case "CHROME":
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                driver = new FirefoxDriver();
                break;
            case "EDGE":
                driver = new EdgeDriver();
                break;
            case "SAFARI":
                driver = new SafariDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser name");
        }

        driver.manage().window().maximize();
        return driver;
    }

}
