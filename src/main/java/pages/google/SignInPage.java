package pages.google;

import constants.xpaths.ApplicationSignInConstants;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class SignInPage {

    public WebDriver driver;

    public WebElement useYourGoogleAccount;
    public WebElement emailOrPhoneField;
    public WebElement nextButton;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        this.useYourGoogleAccount = driver.findElement(By.xpath(ApplicationSignInConstants.USE_YOUR_GOOGLE_ACCOUNT));
        this.emailOrPhoneField = driver.findElement(By.xpath(ApplicationSignInConstants.EMAIL_OR_PHONE_FIELD));
        this.nextButton = driver.findElement(By.xpath(ApplicationSignInConstants.NEXT_BUTTON));
    }

    public void enterEmailAddress(String email) {
        emailOrPhoneField.sendKeys(email);
    }

    public void clickOnNextButton() {
        WaitUtils.applyWait(driver, nextButton, WaitStrategy.CLICKABLE);
        nextButton.click();
    }



}
