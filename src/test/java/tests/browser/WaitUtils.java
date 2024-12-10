package tests.browser;

import config.ConfigManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    public static Duration getTimeout() {
       String timeoutValue = ConfigManager.getProperty("timeout");
       int timeoutInSeconds = ( timeoutValue != null ) ? Integer.parseInt(timeoutValue) : 10;
       return Duration.ofSeconds(timeoutInSeconds);
    }

    public static void globalWait()  {
         boolean enableWait = Boolean.parseBoolean(ConfigManager.getProperty("EnableWait"));
         int waitInSeconds = Integer.parseInt(ConfigManager.getProperty("waitInSeconds"));
         if ( enableWait && waitInSeconds > 0 ) {
             try {
                 Thread.sleep(waitInSeconds * 1000L);
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
                 System.out.println("Global wait interrupted." + e.getMessage());
             }
         }
    }

    public static WebElement applyWait(WebDriver driver, WebElement element, WaitStrategy waitStrategy ) {
        WebDriverWait wait = new WebDriverWait(driver, getTimeout());
        switch ( waitStrategy ) {
            case CLICKABLE:
                return wait.until(ExpectedConditions.elementToBeClickable(element));
            case VISIBLE:
                return wait.until(ExpectedConditions.visibilityOf(element));
            case NONE:
            default:
                return element;
        }
    }

    public static WebElement waitForPresence(WebDriver driver, By element) {
        WebDriverWait wait = new WebDriverWait(driver, getTimeout());
        return wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

}
