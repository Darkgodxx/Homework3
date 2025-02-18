package pages.object.test;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.object.BinPage;
import pages.object.TestBase;

import java.time.Duration;

public class BinTest extends TestBase {
    int quantity;
    int quantityExpected;

    @Test
    public void FindQuantityTest1() {
        quantityExpected = 1;
        BinPage binPage = new BinPage(driver);
        binPage.getRedDuck();
        binPage.getcardProduct();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(binPage.getQuantity(), "1"));
        quantity = binPage.getIntQuantity();
        Assert.assertEquals(quantity, quantityExpected);
    }

    @Test
    public void FindQuantityTest2() {
        quantityExpected = 2;
        BinPage binPage = new BinPage(driver);
        binPage.getRedDuck();
        binPage.getcardProduct();
        binPage.getcardProduct();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(binPage.getQuantity(), "2"));
        quantity = binPage.getIntQuantity();
        Assert.assertEquals(quantity, quantityExpected);
    }
}
