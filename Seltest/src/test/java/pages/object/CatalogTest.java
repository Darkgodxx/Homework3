package pages.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CatalogTest extends TestBase {
    private String deliveryStatus;
    private String stockStatus;
    private String price;
    private String deliveryStatusExpected = "Delivery Status: 3-5 days";
    private String stockStatusExpected = "Stock Status: 29 pcs";
    private String priceExpected = "$0";
    private String stockStatusExpected1 = "Stock Status: 22 pcs";
    private String priceExpected1 = "$20";

    @Test
    public void CatalogTest1() {
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/");
        CatalogPage catalogPage = new CatalogPage(driver);
        WebElement element = driver.findElement(By.cssSelector("[class=\"link\"][title=\"Purple Duck\"]"));
        element.click();
        price = catalogPage.getPrice();
        stockStatus = catalogPage.getStockStatus();
        deliveryStatus = catalogPage.getDeliveryStatus();
        Assert.assertEquals(stockStatus, stockStatusExpected);
        Assert.assertEquals(price, priceExpected);
        Assert.assertEquals(deliveryStatus, deliveryStatusExpected);
    }

    @Test
    public void CatalogTest2() {
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/");
        CatalogPage catalogPage = new CatalogPage(driver);
        WebElement element = driver.findElement(By.cssSelector("[class=\"link\"][title=\"Blue Duck\"]"));
        element.click();
        price = catalogPage.getPrice();
        stockStatus = catalogPage.getStockStatus();
        deliveryStatus = catalogPage.getDeliveryStatus();
        Assert.assertEquals(stockStatus, stockStatusExpected1);
        Assert.assertEquals(price, priceExpected1);
        Assert.assertEquals(deliveryStatus, deliveryStatusExpected);
    }
}
