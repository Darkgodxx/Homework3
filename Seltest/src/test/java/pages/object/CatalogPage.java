package pages.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage {
    private WebDriver driver;
    private By price = By.cssSelector("[itemprop=\"offers\"]");
    private By stockStatus = By.cssSelector("[class=\"stock-available\"]");
    private By deliveryStatus = By.cssSelector("[class=\"stock-delivery\"]");

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPrice() {
        return driver.findElement(price).getText();
    }

    public String getStockStatus() {
        return driver.findElement(stockStatus).getText();
    }

    public String getDeliveryStatus() {
        return driver.findElement(deliveryStatus).getText();
    }
}
