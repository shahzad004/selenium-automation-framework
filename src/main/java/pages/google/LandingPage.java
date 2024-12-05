package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    private final WebDriver driver;
    private final WebElement aboutButton;
    private final WebElement storeButton;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        this.aboutButton =  driver.findElement(By.xpath("//a[text()='About']"));
        this.storeButton =  driver.findElement(By.xpath("//a[text()='Store']"));
    }


    public void clickOnAboutButton() {
        aboutButton.click();
    }

    public void clickOnStoreButton() {
        storeButton.click();
    }


}
