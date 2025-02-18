package pages.object.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.object.LoginMessagePage;
import pages.object.LoginPage;
import pages.object.TestBase;

public class LoginTest extends TestBase {
    private String successExpected = "You are now logged in as %s";
    private String login = "piotr.araya@filesaved.org";
    private String pass = "Test1234";
    private String name = "Test Test.";

    @Test
    public void LoginSuccessTest() {
        LoginPage loginPage = new LoginPage(driver);
        LoginMessagePage loginMessagePage = new LoginMessagePage(driver);
        loginPage.login(login, pass);
        String success = loginMessagePage.getMessageSuccess();
        Assert.assertEquals(success, String.format(successExpected, name));
    }

    @Test
    public void LoginErrorTest1() {
        String noticeErrorExpected = "Wrong password or the account is disabled, or does not exist";
        LoginPage loginPage = new LoginPage(driver);
        LoginMessagePage loginMessagePage = new LoginMessagePage(driver);
        loginPage.login("piotr.awfaf.org", pass);
        String noticeError = loginMessagePage.getMessageError();
        Assert.assertEquals(noticeError, noticeErrorExpected);
    }

    @Test
    public void LoginErrorTest2() {
        String noticeErrorExpected = "You must provide both email address and password.";
        LoginPage loginPage = new LoginPage(driver);
        LoginMessagePage loginMessagePage = new LoginMessagePage(driver);
        loginPage.login(login, "");
        String noticeError = loginMessagePage.getMessageError();
        Assert.assertEquals(noticeError, noticeErrorExpected);
    }
}
