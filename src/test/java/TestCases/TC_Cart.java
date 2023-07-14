package TestCases;

import Pages.Accesorii;
import Pages.AddItemsToCart;
import Pages.Cart;
import Pages.Magazin;
import Utils.Utils;
import com.aventstack.extentreports.Status;
import common.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Cart extends TestBase {

    @Test
    public void cart() throws InterruptedException {
        test = extent.createTest("Cart", "Case 4:Add product to Cart and complete order")
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

        Utils.waitForElementToBeClickable(AddItemsToCart.ClickMagazinOnline);
        Utils.clickOnButton(AddItemsToCart.ClickMagazinOnline);
        test.log(Status.INFO, "Click Magazin button");
        logger.info("Click Magazin button");

        Utils.clickOnButton(AddItemsToCart.ClickSmartphones);
        test.log(Status.INFO, "Click smartphones");
        logger.info("Click smartphones");

        Utils.waitForElementLocated(AddItemsToCart.SelectFirstPhone);
        Utils.clickOnButton(AddItemsToCart.SelectFirstPhone);
        test.log(Status.INFO, "Click on first phone");
        logger.info("Click on first phone");

        Utils.waitForElementLocated(AddItemsToCart.FaraAbon);
        Utils.clickOnButton(AddItemsToCart.FaraAbon);
        test.log(Status.INFO, "Click fara abonament");
        logger.info("Click fara abonament");

        Utils.waitForElementVisible(AddItemsToCart.AddToCart);
        Utils.clickOnButton(AddItemsToCart.AddToCart);
        test.log(Status.INFO, "Click add to cart");
        logger.info("Click add to cart");

        Utils.waitForElementToBeClickable(AddItemsToCart.GoToDetails);
        Utils.clickOnButton(AddItemsToCart.GoToDetails);
        test.log(Status.INFO, "Click go to delivery details");
        logger.info("Click go to delivery details");

        Utils.waitForElementVisible(AddItemsToCart.WithoutAccount);
        Utils.clickOnButton(AddItemsToCart.WithoutAccount);
        test.log(Status.INFO, "Click buy without account");
        logger.info("Click buy without account");

        Utils.clickOnButton(Cart.SelectCity);
        Utils.enterText(Cart.SelectCity, "Bucuresti");
        test.log(Status.INFO, "Insert city name");
        logger.info("Insert city name");

        Utils.waitForElementToBeClickable(Cart.SelectSector);
        Utils.clickOnButton(Cart.SelectSector);
        Utils.enterText(Cart.SelectSector, "Sector 6");
        Utils.clickOnButton(Cart.ClickSector);
        test.log(Status.INFO, "Insert district no");
        logger.info("Insert district no");

        Utils.waitForElementToBeClickable(Cart.StreetName);
        Utils.clickOnButton(Cart.StreetName);
        Utils.enterText(Cart.StreetName, "Strada Valea Oltului");
        Utils.clickOnButton(Cart.ClickStreet);
        test.log(Status.INFO, "Insert street name");
        logger.info("Insert street name");

        Utils.waitForElementToBeClickable(Cart.StreetNo);
        Utils.clickOnButton(Cart.StreetNo);
        Utils.enterText(Cart.StreetNo, "112");
        test.log(Status.INFO, "Insert street number");
        logger.info("Insert street number");

        Utils.waitForElementToBeClickable(Cart.InsertName);
        Utils.clickButtonJS(Cart.InsertName);
        Utils.enterText(Cart.InsertName, "Ion Maria");
        test.log(Status.INFO, "Insert full name");
        logger.info("Insert full name");

        Utils.waitForElementToBeClickable(Cart.InsertPhoneNo);
        Utils.clickButtonJS(Cart.InsertPhoneNo);
        Utils.enterText(Cart.InsertPhoneNo, "0755123456");
        test.log(Status.INFO, "Insert phone number");
        logger.info("Insert phone number");

        Utils.waitForElementToBeClickable(Cart.InsertEmail);
        Utils.clickOnButton(Cart.InsertEmail);
        Utils.enterText(Cart.InsertEmail, "ion.maria0188@gmail.com");
        test.log(Status.INFO, "Insert email");
        logger.info("Insert email");


        Utils.waitForElementToBeClickable(Cart.InsertNameInvoice);
        Utils.clickOnButton(Cart.InsertNameInvoice);
        Utils.enterText(Cart.InsertNameInvoice, "Ion Maria");
        test.log(Status.INFO, "Insert name for invoice");
        logger.info("Insert name for invoice");


        Utils.waitForElementToBeClickable(Cart.InsertCNP);
        Utils.clickOnButton(Cart.InsertCNP);
        Utils.enterText(Cart.InsertCNP, "6130101015398");
        test.log(Status.INFO, "Insert personal numerical number");
        logger.info("Insert personal numerical number");

        Utils.waitForElementToBeClickable(Cart.InsertCity);
        Utils.clickOnButton(Cart.InsertCity);
        Utils.enterText(Cart.InsertCity, "Bucuresti");
        test.log(Status.INFO, "Insert city");
        logger.info("Insert city");

        Utils.waitForElementToBeClickable(Cart.InsertDistrict);
        Utils.clickOnButton(Cart.InsertDistrict);
        Utils.enterText(Cart.InsertDistrict, "Sector 6");
        Utils.clickOnButton(Cart.ClickDistrict);
        test.log(Status.INFO, "Insert district no");
        logger.info("Insert district no");

        Utils.waitForElementToBeClickable(Cart.InsertStreet);
        Utils.clickOnButton(Cart.InsertStreet);
        Utils.enterText(Cart.InsertStreet, "Strada Valea Oltului");
        Utils.clickOnButton(Cart.SubmitStreet);
        test.log(Status.INFO, "Insert street name");
        logger.info("Insert street name");

        Utils.waitForElementToBeClickable(Cart.SubmitStreetNo);
        Utils.clickOnButton(Cart.SubmitStreetNo);
        Utils.enterText(Cart.SubmitStreetNo, "112");
        test.log(Status.INFO, "Insert street number");
        logger.info("Insert street number");

        Utils.clickButtonJS(Cart.VerifyAge);
        test.log(Status.INFO, "Click age and conditions button");
        logger.info("Verify age and conditions button");

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.orange.ro/magazin-online/adaugat-la-cos/transport-si-plata");










    }
}

