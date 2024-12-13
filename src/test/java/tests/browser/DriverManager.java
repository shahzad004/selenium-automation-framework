package tests.browser;

import config.ConfigManager;
import enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class DriverManager {

//   private static WebDriver driver;
   private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

   public static WebDriver getDriver() {
       if ( driver.get() == null ) {
           initializeWebDriver();
       }
       return driver.get();
   }


    private static void initializeWebDriver() {

        Browser browserName = Browser.valueOf(ConfigManager.getProperty("browser").toUpperCase());
        System.out.println("Browser: " + browserName );
        boolean isHeadless = Boolean.parseBoolean(ConfigManager.getProperty("isHeadless"));
        System.out.println("Headless mode: " + isHeadless);

        WebDriver webDriver;

        switch (browserName) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                if ( isHeadless ) {
                    chromeOptions.addArguments("--headless");
                }
                webDriver = new ChromeDriver(chromeOptions);
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions fireFoxOptions = new FirefoxOptions();
                if ( isHeadless ) {
                    fireFoxOptions.addArguments("--headless");
                }
                webDriver = new FirefoxDriver(fireFoxOptions);
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                if ( isHeadless ) {
                    edgeOptions.addArguments("--headless");
                }
                webDriver = new EdgeDriver(edgeOptions);
                break;
           /* case "SAFARI":
                driver = new SafariDriver(safariOptions);
                break;*/
            default:
                throw new IllegalArgumentException("Invalid browser name");
        }

        webDriver.manage().window().maximize();
        System.out.println("Driver: " + driver );
        driver.set(webDriver);
    }

    public static void quitDriver() {
        if ( driver.get() != null ) {
            driver.get().quit();
            driver.remove();
        }
    }

}
