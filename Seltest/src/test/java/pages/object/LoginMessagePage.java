package pages.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginMessagePage {
    private WebDriver driver;
    private By messageSuccess = By.cssSelector("[class=\"notice success\"]");
    private By messageError = By.cssSelector("[class=\"notice errors\"]");

    public LoginMessagePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMessageSuccess() {
        return driver.findElement(messageSuccess).getText();
    }

    public String getMessageError() {
        return driver.findElement(messageError).getText();
    }
}
