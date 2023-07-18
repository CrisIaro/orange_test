package TestCase;

import Pages.HomePage;
import Pages.LogIn;
import Utils.Utils;
import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Test extends TestBase {

    @Test()

    public void login() throws InterruptedException {
        test = extent.createTest("Login account", "Case 6: Login Orange account")
                .assignCategory("Functional_testcase")
                .assignAuthor("Cristina Iarosevici");
        logger.info("Verify URL");

        openURL(properties.getProperty("URL"));
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        Utils.waitForElementVisible(HomePage.AcceptCookie);
        Utils.clickOnButton(HomePage.AcceptCookie);
        test.log(Status.INFO, "Accept cookies");
        logger.info("Accept cookies");

        Utils.clickButtonJS(HomePage.ClickMyAccount);
        test.log(Status.INFO,"Click MyAccount");
        logger.info("Click MyAccount");

        Utils.clickOnButton(LogIn.Email);
        Utils.enterText(LogIn.Email, "ion.maria0188@gmail.com");
        test.log(Status.INFO,"Click login and enter email");
        logger.info("Click Apple");

        Utils.clickOnButton(LogIn.Password);
        Utils.enterText(LogIn.Password, "Ionmaria0188@");
        test.log(Status.INFO,"Click password and enter password");
        logger.info("Click Apple");

        Utils.clickOnButton(LogIn.LoginBtn);
        test.log(Status.INFO,"Click login button");
        logger.info("Click login button");
        Utils.waitForUrlToBe("https://www.orange.ro/myaccount/reshape/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.orange.ro/myaccount/reshape/");




    }
}