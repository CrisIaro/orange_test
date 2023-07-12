package TestCases;

import Pages.Telefoane;
import Utils.Utils;
import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_SearchPhone extends TestBase {

    @Test()

    public void telefoane() throws InterruptedException {
        test = extent.createTest("Filter", "Case 3: Search phone and add  to cart")
                .assignCategory("Functional_testcase")
                .assignAuthor("Cristina Iarosevici");
        logger.info("Verify URL");

        openURL(properties.getProperty("URL"));
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        Utils.waitForElementVisible(Telefoane.AcceptCookie);
        Utils.clickOnButton(Telefoane.AcceptCookie);
        test.log(Status.INFO, "Accept cookies");
        logger.info("Accept cookies");

        Utils.waitForElementVisible(Telefoane.Magazin);
        Utils.clickOnButton(Telefoane.Magazin);
        test.log(Status.INFO, "Click Magazin");
        logger.info("Click Magazin");

        Utils.waitForElementVisible(Telefoane.Telefoane);
        Utils.clickOnButton(Telefoane.Telefoane);
        test.log(Status.INFO, "Click pagina telefoane");
        logger.info("Click pagina telefoane");

        Utils.scrollDownPage(Telefoane.ViewAll);
        Utils.waitForElementToBeClickable(Telefoane.ViewAll);
        test.log(Status.INFO,"Click view all phones");
        logger.info("Click view all phones");

        Utils.scrollDownPage(Telefoane.ScrollDownPage);
        test.log(Status.INFO,"Scroll down page");
        logger.info("Scroll down page");

        Utils.waitForElementVisible(Telefoane.ScrollTopPage);
        Utils.clickOnButton(Telefoane.ScrollTopPage);
        test.log(Status.INFO,"Scroll top page");
        logger.info("Scroll top page");

        Utils.waitForElementToBeClickable(Telefoane.FilterByPrice);
        Utils.clickButtonJS(Telefoane.FilterByPrice);
        test.log(Status.INFO,"Click Fara Abonament");
        logger.info("Click Fara Abonament");

        Utils.waitForElementToBeClickable(Telefoane.FilterByType);
        Utils.clickButtonJS(Telefoane.FilterByType);
        test.log(Status.INFO,"Click Nou");
        logger.info("Click Nou");

        if(!Utils.checkIfExists(Telefoane.FilterByStock)){
            Utils.waitForElementToBeClickable(Telefoane.FilterByStock);
            Utils.clickButtonJS(Telefoane.FilterByStock);

        }
        else
            Utils.scrollDownPage(Telefoane.FilterByStock);
            Utils.waitForElementToBeClickable(Telefoane.FilterByStock);
            Utils.clickButtonJS(Telefoane.FilterByStock);
        test.log(Status.INFO,"Click In Stoc");
        logger.info("Click In Stoc");

        Utils.clickButtonJS(Telefoane.FilterByBrandAll);
        test.log(Status.INFO,"Click to show all brands");
        logger.info("Click to show all brands");

        Utils.clickButtonJS(Telefoane.FilterByBrandApple);
        test.log(Status.INFO,"Click Apple");
        logger.info("Click Apple");

        Utils.scrollDownPage(Telefoane.FilterByMemory);
        Utils.clickButtonJS(Telefoane.FilterByMemory);
        test.log(Status.INFO,"Click 256GB");
        logger.info("Click 256GB");

        Utils.clickOnButton(Telefoane.ScrollTopPage);
        Utils.clickElementInList(Telefoane.SeeDetails, 1);
        test.log(Status.INFO,"Scroll up and click see details");
        logger.info("Scroll up and click see details");

         Utils.waitForElementVisible(Telefoane.AddPhoneToCart);
         Utils.clickOnButton(Telefoane.AddPhoneToCart);
         test.log(Status.INFO,"Click add to cart");
         logger.info("Click add to cart");
         Utils.waitForUrlToBe("https://www.orange.ro/magazin-online/adaugat-la-cos");
         Assert.assertEquals(driver.getCurrentUrl(), "https://www.orange.ro/magazin-online/adaugat-la-cos");


    }
}