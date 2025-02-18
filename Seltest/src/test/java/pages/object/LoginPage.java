package pages.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailInput = By.cssSelector("[name=email]");
    private By passInput = By.cssSelector("[name=password]");
    private By loginButton = By.cssSelector("[name=login]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String pass) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passInput).sendKeys(pass);
        driver.findElement(loginButton).click();
    }
}
