package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

    public WebDriver driver;

    public WebElement useYourGoogleAccount;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        this.useYourGoogleAccount = driver.findElement(By.xpath("//span[text()='Use your Google Account']"));
    }



}
