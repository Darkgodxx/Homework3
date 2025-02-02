import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DuckTest {
    @Test
    public void duckTest1 (){
        String title;
        String titleActual = "Online Store | My Store";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://litecart.stqa.ru/en/");
        WebElement element = driver.findElement(By.cssSelector("[id=site-menu-wrapper] [class=general-0]"));
        element.click();
        title = driver.getTitle();
        Assert.assertEquals(title, titleActual);
        driver.quit();
    }
    @Test
    public void duckTest2 (){
        String title;
        String titleActual = "Rubber Ducks";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://litecart.stqa.ru/en/");
        WebElement element = driver.findElement(By.xpath("//li[@class=\"category-1\"]"));
        element.click();
        WebElement element1 = driver.findElement(By.xpath("//div[@id=\"box-category\"]/h1[@class=\"title\"]"));
        title = element1.getText();
        Assert.assertEquals(title, titleActual);
        driver.quit();
    }
    @Test
    public void duckTest3 (){
        String title;
        String titleActual = "Subcategory | My Store";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
        Actions actions = new Actions(driver);
        driver.get("https://litecart.stqa.ru/en/");
        WebElement element = driver.findElement(By.cssSelector("[id=site-menu-wrapper] [class=category-1]"));
        actions.moveToElement(element).perform();
        WebElement element1 = driver.findElement(By.cssSelector("[id=site-menu-wrapper] [class=category-2]"));
        element1.click();
        title = driver.getTitle();
        Assert.assertEquals(title, titleActual);
        driver.quit();
    }
    @Test
    public void duckTest4 (){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
        Actions actions = new Actions(driver);
        driver.get("https://learn.javascript.ru/article/mouse-drag-and-drop/ball4/");
        WebElement element = driver.findElement(By.cssSelector("[id=ball]"));
        WebElement element1 = driver.findElement(By.cssSelector("[id=gate]"));
        actions.dragAndDrop(element,element1).perform();
        driver.quit();
    }
    @Test
    public void duckTest5 (){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
        Actions actions = new Actions(driver);
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement element = driver.findElement(By.cssSelector("[class=\"context-menu-one btn btn-neutral\"]"));
        actions.contextClick(element).perform();
        driver.quit();
    }
    @Test
    public void duckTest6 (){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
        Actions actions = new Actions(driver);
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement element = driver.findElement(By.cssSelector("[ondblclick=\"myFunction()\"]"));
        actions.doubleClick(element).perform();
        driver.quit();
    }
}
