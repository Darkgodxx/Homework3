package pages.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DuckPage {
    private WebDriver driver;
    private By myStorePageButton = By.cssSelector("[id=site-menu-wrapper] [class=general-0]");
    private By rubberDucksCategoryButton = By.xpath("//li[@class=\"category-1\"]");
    private By rubberDucksCategoryButton2 = By.cssSelector("[id=site-menu-wrapper] [class=category-2]");
    private By titlePage = By.xpath("//div[@id=\"box-category\"]/h1[@class=\"title\"]");
    private By ball = By.cssSelector("[id=ball]");
    private By gate = By.cssSelector("[id=gate]");
    private By contextMenu = By.cssSelector("[class=\"context-menu-one btn btn-neutral\"]");
    private By dubleclick = By.cssSelector("[ondblclick=\"myFunction()\"]");

    public DuckPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickmyStorePageButton() {
        driver.findElement(myStorePageButton).click();
    }

    public String getTitlePage() {
        return driver.getTitle();
    }

    public void clickRubberDucksCategoryButton() {
        driver.findElement(rubberDucksCategoryButton).click();
    }

    public String getTitlePageOther() {
        return driver.findElement(titlePage).getText();
    }

    public void FindMyStorePageButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(rubberDucksCategoryButton)).perform();

    }

    public void clickRubberDucksCategoryButton2() {
        driver.findElement(rubberDucksCategoryButton2).click();
    }

    public void FindGateAndBall() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(ball), driver.findElement(gate)).perform();
    }

    public void contextMenuClick() {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(contextMenu)).perform();
    }

    public void dubleClick() {
        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(dubleclick)).perform();
    }
}
