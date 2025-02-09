package pages.object;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    private String successExpected = "You are now logged in as %s";
    private String login = "piotr.araya@filesaved.org";
    private String pass = "Test1234";
    private String name = "Test Test.";

    @Test
    public void LoginTest1() {
        driver.get("https://litecart.stqa.ru/en/");
        LoginPage loginPage = new LoginPage(driver);
        LoginMessagePage loginMessagePage = new LoginMessagePage(driver);
        loginPage.login(login, pass);
        String success = loginMessagePage.getMessageSuccess();
        Assert.assertEquals(success, String.format(successExpected, name));
    }

    @Test
    public void LoginTest2() {
        String noticeErrorExpected = "Wrong password or the account is disabled, or does not exist";
        driver.get("https://litecart.stqa.ru/en/");
        LoginPage loginPage = new LoginPage(driver);
        LoginMessagePage loginMessagePage = new LoginMessagePage(driver);
        loginPage.login("piotr.awfaf.org", pass);
        String noticeError = loginMessagePage.getMessageError();
        Assert.assertEquals(noticeError, noticeErrorExpected);
    }

    @Test
    public void LoginTest3() {
        String noticeErrorExpected = "You must provide both email address and password.";
        driver.get("https://litecart.stqa.ru/en/");
        LoginPage loginPage = new LoginPage(driver);
        LoginMessagePage loginMessagePage = new LoginMessagePage(driver);
        loginPage.login(login, "");
        String noticeError = loginMessagePage.getMessageError();
        Assert.assertEquals(noticeError, noticeErrorExpected);
    }
}
