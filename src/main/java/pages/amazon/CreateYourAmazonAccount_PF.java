package pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateYourAmazonAccount_PF {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='ap_customer_name']")
    WebElement fullName;

    @FindBy(xpath = "//input[@id='ap_email']")
    WebElement emailOrPhoneNumber;

    @FindBy(id = "ap_password")
    WebElement password;

    @FindBy(id = "ap_password_check")
    WebElement re_enter_password;

    @FindBy(id = "continue")
    WebElement continueButton;

    public CreateYourAmazonAccount_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFullName(String fullName) {
        this.fullName.sendKeys(fullName);
    }

    public void enterEmailAddressOrPhoneNumber(String email) {
        this.emailOrPhoneNumber.sendKeys(email);
    }

    public void enterEmailAddressOrPhoneNumber(int phoneNumber) {
        this.emailOrPhoneNumber.sendKeys(Integer.toString(phoneNumber));
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void reEnterPassword(String password) {
        this.re_enter_password.sendKeys(password);
    }

    public void clickOnContinueButton() {
        this.continueButton.click();
    }



}
