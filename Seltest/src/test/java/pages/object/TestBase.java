package pages.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.object.enums.Browser;
import static pages.object.helpers.Locators.getLocator;
import java.time.Duration;


public class TestBase {
    protected WebDriver driver;
    Browser browser = Browser.valueOf(System.getProperty("browser", "chrome"));
    @BeforeMethod
    public void methodSetup() {
        driver = switch (browser){
            case chrome -> {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--ignore-certificate-errors");
                yield new ChromeDriver(options);
            }
            case firefox -> {
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--ignore-certificate-errors");
                yield new FirefoxDriver(options);
            }
        };
        driver.get(String.valueOf(getLocator("Test.url")));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void methodTeardown() {
        driver.quit();
    }
}
