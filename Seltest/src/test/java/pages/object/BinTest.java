package pages.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BinTest extends TestBase {
    @Test
    public void BinTest1() {
        int quantityExpected = 1;
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/");
        BinPage binPage = new BinPage(driver);
        WebElement element1 = driver.findElement(By.cssSelector("[class=\"link\"][title=\"Red Duck\"]"));
        element1.click();
        WebElement element2 = driver.findElement(By.cssSelector("[name=\"add_cart_product\"]"));
        element2.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("span.quantity"), "1"));
        int quantity = Integer.parseInt(binPage.getQuantity());
        Assert.assertEquals(quantity, quantityExpected);
    }

    @Test
    public void BinTest2() {
        int quantityExpected = 2;
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/");
        BinPage binPage = new BinPage(driver);
        WebElement element1 = driver.findElement(By.cssSelector("[class=\"link\"][title=\"Red Duck\"]"));
        element1.click();
        WebElement element2 = driver.findElement(By.cssSelector("[name=\"add_cart_product\"]"));
        element2.click();
        WebElement element3 = driver.findElement(By.cssSelector("[name=\"add_cart_product\"]"));
        element3.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("span.quantity"), "2"));
        int quantity = Integer.parseInt(binPage.getQuantity());
        Assert.assertEquals(quantity, quantityExpected);
    }
}
