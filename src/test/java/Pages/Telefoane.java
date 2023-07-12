package Pages;

import org.openqa.selenium.By;

public class Telefoane {

    public static By AcceptCookie = By.id("onetrust-accept-btn-handler");
    public static By Magazin = By.id("magazin");
    public static By Telefoane = By.cssSelector("body > div.custom-menu-wrapper.d-print-none > div.submenu-container.mobile-hide.active > div > div > div > div.submenuNew.magazin.open > div > div.childrenWrapper-main > a:nth-child(2)");
    public static By ViewAll = By.cssSelector("body > oro-store > ng-component > main > div > div > article > section.row.products-by-category-product-list.ng-star-inserted > div:nth-child(14) > a");
    public static By ScrollDownPage = By.xpath("/html/body/div[3]/section/div/div[1]/a/h4");
    public static By ScrollTopPage = By.cssSelector("body > oro-store > ng-component > oro-back-to-top > div");
    public static By FilterByPrice = By.cssSelector("#Vezi\\ preturi > li:nth-child(2) > label");
    public static By FilterByType = By.cssSelector("#Tip\\ Produs > li:nth-child(1) > label");
    public static By FilterByStock = By.cssSelector("#Stoc > li:nth-child(1) > label");
    public static By FilterByBrandAll = By.cssSelector("#Brand > li:nth-child(15) > button");
    public static By FilterByBrandApple = By.id("47");
    public static By FilterByMemory = By.id("2071");
    public static By SeeDetails = By.xpath("//*[contains(@class,'btn btn-primary')]");
    public static By AddPhoneToCart = By.cssSelector("#product-prices > div.container.ng-star-inserted > div > div > oro-product-prices > div > oro-product-prices-list > div > div > es-product-selling-option > div > es-product-selling-option-standard > div.mt-3.ng-star-inserted > button");






}
