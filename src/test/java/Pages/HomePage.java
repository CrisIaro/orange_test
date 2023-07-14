package Pages;

import common.TestBase;
import org.openqa.selenium.By;

public class HomePage {

    public static By AcceptCookie = By.id("onetrust-accept-btn-handler");
    public static By ScrollDown = By.xpath("/html/body/div[4]/div[4]");
    public static By ClickPersonal = By.xpath("/html/body/div[3]/div[1]/div/div/div[1]/ul/li[1]");

    public static By ClickAntreprenori = By.xpath("/html/body/div[3]/div[1]/div/div/div[1]/ul/li[2]/a");
    public static By ClickCompanii = By.linkText("Companii");
    public static By ClickWholesale = By.linkText("Wholesale");
    public static By ClickOrangeIcon = By.id("Fill-1");
    public static By ClickContact = By.cssSelector("body > div.custom-menu-wrapper.d-print-none > div.top-section.mobile-hide > div > div > div.right-menu > ul > li:nth-child(1) > a > div");
    public static By ClickCautaMag = By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/ul/li[2]/a/div");
    public static By ClickBackOrangeIcon = By.xpath("/html/body/nav/div[2]/div/div/div/nav/div[2]/a/img");
    public static By ClickMagazin = By.id("magazin");
    public static By ClickOferte = By.linkText("Oferte");
    public static By ClickBackOrangeIcon2 = By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div/a/img");
    public static By ClickVoce = By.id("mobile");
    public static By ClickInternetTv = By.id("love");
    public static By ClickOrangeMoney = By.id("money");
    public static By ClickHelp = By.id("help");
    public static By ClickXbtn = By.xpath("/html/body/div[3]/div/div/button");
    public static By ClickCart = By.id("Layer_1");
    public static By ClickMyAccount = By.xpath("//a[@href='https://www.orange.ro/myaccount/']");
    public static By ClickBackOrangeIcon3 = By.cssSelector("#wrapper > header > div.pull-left.logo > a > img");

    public static By ClickMailBar = By.id("EmailFooter");
    public static By CheckBoxGDPR = By.id("gdpr-checkbox");
    public static By MaAbonez = By.cssSelector("#custom_footer > div.footer-top-section.footer-top-section-newsletter > div > div > div > form > ul > li:nth-child(2) > a");
    public static By CheckText = By.xpath("//form[@class='subscribe-footer']/p[2]");






}
