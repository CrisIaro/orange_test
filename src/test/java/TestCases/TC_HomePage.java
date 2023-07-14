package TestCases;

import Pages.HomePage;
import Utils.Utils;
import com.aventstack.extentreports.Status;
import common.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TC_HomePage extends TestBase {

    public void TestSetUp(String Descriere) {
        test = extent.createTest("Homepage", "Homepage buttons test")
                .assignCategory("Functional_testcase")
                .assignAuthor("Cristina Iarosevici");
        logger.info("Verify URL");

        openURL(properties.getProperty("URL"));
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        if (driver.findElements(HomePage.AcceptCookie).size()==1) {
            Utils.waitForElementVisible(HomePage.AcceptCookie);
            Utils.clickOnButton(HomePage.AcceptCookie);
            test.log(Status.INFO, "Accept cookies");
            logger.info("Accept cookies");
        }
    }

    @Test(priority = 0)

    public void navigateToPersonal() throws InterruptedException {
        TestSetUp("Navigate to Personal");

        Utils.waitForElementVisible(HomePage.ClickPersonal);
        Utils.clickOnButton(HomePage.ClickPersonal);
        test.log(Status.INFO, "Click Personal Button");
        logger.info("Click Personal Button");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.orange.ro/");
    }

    @Test()

    public void navigateToAntreprenori() throws InterruptedException {
        TestSetUp("Navigate to Antreprenori");

        Utils.clickOnButton(HomePage.ClickAntreprenori);
        test.log(Status.INFO, "Click Antreprenori Button");
        logger.info("Click Antreprenori Button");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.orange.ro/antreprenori/");
    }

    @Test()
    public void navigateToCompanii() throws InterruptedException {
        TestSetUp("Navigate to Companii");

        Utils.clickOnButton(HomePage.ClickCompanii);
        test.log(Status.INFO, "Click Companii Button");
        logger.info("Click Companii Button");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.orange.ro/business/");
    }

    @Test(priority = 0)
    public void navigateToWholesale() throws InterruptedException {
        TestSetUp("Navigate to Wholesale");

        Utils.clickOnButton(HomePage.ClickWholesale);
        test.log(Status.INFO, "Click Wholesale Button");
        logger.info("Click Wholesale Button");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.orange.ro/wholesale/");
    }

    @Test(priority = 0)
    public void navigateToContact() throws InterruptedException {
        TestSetUp("Navigate to Contact");

        Utils.waitForElementVisible(HomePage.ClickContact);
        Utils.clickOnButton(HomePage.ClickContact);
        test.log(Status.INFO, "Click Contact Button");
        logger.info("Click Contact Button");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.orange.ro/contact/" );
    }

    @Test()
    public void navigateToCautaMagazin() throws InterruptedException {
        TestSetUp("Navigate to Cauta Magazin");

        Utils.clickOnButton(HomePage.ClickMagazin);
        test.log(Status.INFO, "Click Magazin Button");
        logger.info("Click Magazin Button");

        Utils.clickOnButton(HomePage.ClickOferte);
        test.log(Status.INFO, "Click Oferte Button");
        logger.info("Click Oferte Button");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.orange.ro/oferte-speciale/" );
    }

    @Test(priority = 2)
    public void navigateToEverythingElse() throws InterruptedException {
        TestSetUp("Navigate to Cauta Magazin");


        Utils.clickOnButton(HomePage.ClickMagazin);
        test.log(Status.INFO, "Click Magazin Button");
        logger.info("Click Magazin Button");

        Utils.clickOnButton(HomePage.ClickOferte);
        test.log(Status.INFO, "Click Oferte Button");
        logger.info("Click Oferte Button");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.orange.ro/oferte-speciale/" );

        Utils.clickOnButton(HomePage.ClickBackOrangeIcon2);
        test.log(Status.INFO,"Click Orange Icon to get to homepage");
        logger.info("Click Orange Icon to get to homepage");

        Utils.clickOnButton(HomePage.ClickVoce);
        test.log(Status.INFO, "Click Voce Button");
        logger.info("Click Voce Button");

        Utils.clickOnButton(HomePage.ClickInternetTv);
        test.log(Status.INFO, "Click Internet+TV Button");
        logger.info("Click Internet+TV Button");

        Utils.clickOnButton(HomePage.ClickOrangeMoney);
        test.log(Status.INFO, "Click Orange Money Button");
        logger.info("Click Orange Money Button");

        Utils.clickOnButton(HomePage.ClickHelp);
        test.log(Status.INFO, "Click Help Button");
        logger.info("Click Help Button");

        Utils.clickOnButton(HomePage.ClickCart);
        test.log(Status.INFO, "Click Cart Button");
        logger.info("Click Cart Button");

        Utils.clickOnButton(HomePage.ClickOrangeIcon);
        test.log(Status.INFO,"Click Orange Icon to get to homepage");
        logger.info("Click Orange Icon to get to homepage");

        Utils.clickButtonJS(HomePage.ClickMyAccount);
        test.log(Status.INFO, "Click MyAccount Button");
        logger.info("Click MyAccount Button");
        Assert.assertTrue(driver.getCurrentUrl().contains("orange.ro/accounts/login-user"));

        Utils.clickOnButton(HomePage.ClickBackOrangeIcon3);
        test.log(Status.INFO,"Click Orange Icon to get to homepage");
        logger.info("Click Orange Icon to get to homepage");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.orange.ro/");


        Utils.scrollDownPage(HomePage.ScrollDown);
        test.log(Status.INFO, "Verify scroll page");
        logger.info("Verify scroll page");
        Assert.assertTrue(driver.findElement(HomePage.ClickMailBar).isDisplayed());

        Utils.waitForElementVisible(HomePage.ClickMailBar);
        Utils.clickOnButton(HomePage.ClickMailBar);
        Utils.enterText(HomePage.ClickMailBar, "cristina.iarosevici@gmail.com");
        Utils.clickOnButton(HomePage.CheckBoxGDPR);
        Utils.clickOnButton(HomePage.MaAbonez);
        Utils.waitForElementToBeDisplayed(HomePage.CheckText);
        Assert.assertEquals(driver.findElement(By.xpath("//form[@class='subscribe-footer']/p[2]")).getText(), "Mulțumim. Ai inscris adresa ta de email la newsletterul Orange.\n" +
                "Daca te-ai inscris pentru prima oara la newsletterul Orange, pentru validare, vei primi la adresa de email \"cristina.iarosevici@gmail.com\" un link pe care te rugam sa dai click. Dupa validare, vei fi inregistrat cu succes. Daca te-ai mai inscris in trecut la newsletterul nostru, nu vei mai primi acest link.");





    }

}
