package pages.google;

import constants.xpaths.ApplicationSignInConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PasswordPage {

    public WebDriver driver;

    public WebElement welcomeText;


    public PasswordPage(WebDriver driver) {
        this.driver = driver;
        this.welcomeText = driver.findElement(By.xpath(ApplicationSignInConstants.WELCOME_TEXT));
    }

}
