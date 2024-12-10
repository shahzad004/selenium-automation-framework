package pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardPF {

    WebDriver driver;

    @FindBy(xpath = "//span[text()='Hello, sign in']")
    public WebElement signIn;

    public dashboardPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions for elements
    public void clickOnSignInButton() {
        this.signIn.click();
    }


}
