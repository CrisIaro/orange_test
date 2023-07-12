package TestCases;

import Pages.HomePage;
import Pages.Magazin;
import Utils.Utils;
import com.aventstack.extentreports.Status;
import common.TestBase;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Magazin extends TestBase {

    @Test()

    public void magazin() throws InterruptedException {
        test = extent.createTest("Test Magazin", "Case 2: Test magazin")
                .assignCategory("Functional_testcase")
                .assignAuthor("Cristina Iarosevici");
        logger.info("Verify URL");

        openURL(properties.getProperty("URL"));
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        Utils.waitForElementVisible(Magazin.AcceptCookie);
        Utils.clickOnButton(Magazin.AcceptCookie);
        test.log(Status.INFO, "Accept cookies");
        logger.info("Accept cookies");

        Utils.waitForElementVisible(Magazin.Magazin);
        Utils.clickOnButton(Magazin.Magazin);
        test.log(Status.INFO, "Click Magazin button");
        logger.info("Click Magazin button");

        Utils.clickOnButton(Magazin.AbonFaraTel);
        test.log(Status.INFO, "Click abonamente fara telefon");
        logger.info("Click abonamente fara telefon");

        if(!Utils.checkIfExists(Magazin.AbonFun9)){
            Utils.clickOnButton(Magazin.CarouselBack);
        }
        Utils.clickButtonJS(Magazin.AbonFun9);

        Utils.clickOnButton(Magazin.AbonamentNou);
        test.log(Status.INFO, "Click abonament nou");
        logger.info("Click abonament nou");
        Utils.waitForUrlToBe("https://www.orange.ro/magazin-online/adaugat-la-cos");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.orange.ro/magazin-online/adaugat-la-cos");















    }
}