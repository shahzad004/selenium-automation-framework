package tests.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.google.LandingPage;

import java.time.Duration;

public class ActivityOne extends Base {

    @Test
    public void test() {
        LandingPage page = new LandingPage(DriverManager.getDriver());
        page.clickOnSignInButton();
        WaitUtils.globalWait();
    }

//    public static void main(String[] args) {
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        WebDriverWait exWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement googleAboutButton = driver.findElement(By.xpath("//a[text()='About']"));
//        exWait.until(ExpectedConditions.elementToBeClickable(googleAboutButton));
//
//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(2))
//                .ignoring(StaleElementReferenceException.class);
//
//        WebElement googleStoreButtonTwo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Store']")));
//
//
//
//
//
//
//
//
//
//
//
//    }

}
