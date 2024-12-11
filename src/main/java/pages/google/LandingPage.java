package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    private final WebDriver driver;
    public final WebElement aboutButton;
    public final WebElement storeButton;
    public final By gmailButton;
    public final WebElement signInButton;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        this.aboutButton =  driver.findElement(By.xpath("//a[text()='About']"));
        this.storeButton =  driver.findElement(By.xpath("//a[text()='Store']"));
        this.gmailButton = By.xpath("//a[text()='Gmail']");
        this.signInButton = driver.findElement(By.xpath("//a[@aria-label='Sign in']"));
    }

    public void clickOnAboutButton() {
        aboutButton.click();
    }

    public void clickOnStoreButton() {
        storeButton.click();
    }

    public void clickOnSignInButton() { signInButton.click(); }

    public void clickOnGmailButton() { driver.findElement(gmailButton).click(); }


}
