package pages.object.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.object.DuckPage;

import java.time.Duration;


public class DuckTest {
    String title;
    String titleeExpected;
    WebDriver driver;

    @BeforeMethod
    public void methodSetup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void methodTeardown() {
        driver.quit();
    }

    @Test
    public void GetTitleOnlineStoreTest() {
        titleeExpected = "Online Store | My Store";
        driver.get("https://litecart.stqa.ru/en/");
        DuckPage duckPage = new DuckPage(driver);
        duckPage.clickmyStorePageButton();
        title = duckPage.getTitlePage();
        Assert.assertEquals(title, titleeExpected);
    }

    @Test
    public void GetTitleRubberDucksTest() {
        titleeExpected = "Rubber Ducks";
        driver.get("https://litecart.stqa.ru/en/");
        DuckPage duckPage = new DuckPage(driver);
        duckPage.clickRubberDucksCategoryButton();
        title = duckPage.getTitlePageOther();
        Assert.assertEquals(title, titleeExpected);
    }

    @Test
    public void GetTitleSubcategoryTest() {
        titleeExpected = "Subcategory | My Store";
        driver.get("https://litecart.stqa.ru/en/");
        DuckPage duckPage = new DuckPage(driver);
        duckPage.FindMyStorePageButton();
        duckPage.clickRubberDucksCategoryButton2();
        title = duckPage.getTitlePage();
        Assert.assertEquals(title, titleeExpected);
    }

    @Test
    public void DragDropGateAndBallTest() {
        driver.get("https://learn.javascript.ru/article/mouse-drag-and-drop/ball4/");
        DuckPage duckPage = new DuckPage(driver);
        duckPage.FindGateAndBall();
    }

    @Test
    public void ContextMenuTest() {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        DuckPage duckPage = new DuckPage(driver);
        duckPage.contextMenuClick();

    }

    @Test
    public void DubleClickTest() {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        DuckPage duckPage = new DuckPage(driver);
        duckPage.dubleClick();
    }
}
