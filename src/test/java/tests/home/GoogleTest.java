package tests.home;

import io.cucumber.java.it.Ed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {

    public static void main(String[] args) throws InterruptedException {

//       navigateToGoogleWebPage();
//       navigateToFacebookWebPage();

    }

    public static void navigateToGoogleWebPage(String browserName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        switch ( browserName ){
            case "FireFox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        System.out.println( driver.getTitle() );
        System.out.println( driver.getCurrentUrl() );

        WebElement aboutButton = driver.findElement(By.xpath("//a[text()='About']"));
        aboutButton.click();

        Thread.sleep(3000);

        driver.close();
        driver.quit();

    }
    public static void navigateToFacebookWebPage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        System.out.println( driver.getTitle() );
        System.out.println( driver.getCurrentUrl() );

        WebElement createNewAccountButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAccountButton.click();

        Thread.sleep(3000);

        driver.close();
        driver.quit();
    }

}
