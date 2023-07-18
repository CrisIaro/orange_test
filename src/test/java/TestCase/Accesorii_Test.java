package TestCase;

import Pages.Accesorii;
import Pages.Magazin;
import Utils.Utils;
import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.annotations.Test;

public class Accesorii_Test extends TestBase {

    @Test()

    public void magazin() throws InterruptedException {
        test = extent.createTest("Accesorii", "Case 4: Selecting and adding phone accessories to cart")
                .assignCategory("Functional_testcase")
                .assignAuthor("Cristina Iarosevici");
        logger.info("Verify URL");

        openURL(properties.getProperty("URL"));
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        Utils.waitForElementVisible(Accesorii.AcceptCookie);
        Utils.clickOnButton(Magazin.AcceptCookie);
        test.log(Status.INFO, "Accept cookies");
        logger.info("Accept cookies");

        Utils.waitForElementVisible(Accesorii.Magazin);
        Utils.clickOnButton(Accesorii.Magazin);
        test.log(Status.INFO, "Click Magazin button");
        logger.info("Click Magazin button");

        Utils.clickOnButton(Accesorii.AccesoriiPage);
        test.log(Status.INFO, "Click Accesorii button");
        logger.info("Click Accesorii button");

        if (!Utils.checkIfItsClicked(Accesorii.InStoc)) {
        Utils.clickOnButton(Accesorii.InStoc);}
        test.log(Status.INFO, "If it's not already selected, select In stoc");
        logger.info("If it's not already selected, select In stoc");

        Utils.clickButtonJS(Accesorii.FilterApple);
        test.log(Status.INFO, "Click Apple");
        logger.info("Filter by brand Apple");

        Utils.clickButtonJS(Accesorii.ShowAllTypes);
        test.log(Status.INFO, "Click show all types");
        logger.info("Click show all types");

        Utils.waitForElementToBeClickable(Accesorii.ClickIncarcatoare);
        Utils.clickButtonJS(Accesorii.ClickIncarcatoare);
        test.log(Status.INFO, "Click Incarcatoare from list");
        logger.info("Click Incarcatoare from list");

        Utils.waitForElementValue(Accesorii.WaitIncarcator, "20W USB C Power Adapter");
        test.log(Status.INFO, "Wait for power adapter to show");
        logger.info("Wait for power adapter to show");

        Utils.waitForElementLocated(Accesorii.SelectPowerAdapter);
        Utils.waitForElementToBeClickable(Accesorii.SelectPowerAdapter);
        Utils.clickOnButton(Accesorii.SelectPowerAdapter);
        test.log(Status.INFO, "Locate and click power adapter");
        logger.info("Locate and click power adapter");

        Utils.waitForElementLocated(Accesorii.AddToCartAdapter);
        Utils.waitForElementToBeClickable(Accesorii.AddToCartAdapter);
        Utils.clickOnButton(Accesorii.AddToCartAdapter);
        test.log(Status.INFO, "Locate and add power adapter to cart");
        logger.info("Locate and add power adapter to cart");





    }
}
