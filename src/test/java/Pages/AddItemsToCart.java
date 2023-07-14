package Pages;

import org.openqa.selenium.By;

public class AddItemsToCart {

    public static By ClickMagazinOnline = By.cssSelector("body > div.custom-menu-wrapper.d-print-none > div.submenu-container.mobile-hide.active > div > div > div > div.submenuNew.magazin.open > a");
    public static By ClickSmartphones = By.xpath("/html/body/oro-store/oro-homepage/oro-category/div/div/div/swiper/div/div[2]/oro-category-item/div/a/picture/img");
    public static By SelectFirstPhone = By.xpath("/html/body/oro-store/ng-component/main/div/div/article/section[4]/div[1]/div/es-product-card/a");
    public static By FaraAbon = By.xpath("//*[contains(text(),'Fără abonament')]");
    public static By AddToCart = By.xpath("//*[contains(text(),'Cumpără')]");
    public static By GoToDetails = By.cssSelector("body > oro-store > ng-component > es-cart-v2-items-list > main > div > div > div.col-xl-4.px-0.px-md-3.ng-star-inserted > es-cart-v2-details-summary > es-cart-v2-summary > div > div.d-flex.flex-column.ng-star-inserted > div.mb-3.px-0.px-lg-3.order-4.order-lg-3 > button > span");
    public static By WithoutAccount = By.xpath("//*[contains(text(),'Continuă fără cont')]");

}
