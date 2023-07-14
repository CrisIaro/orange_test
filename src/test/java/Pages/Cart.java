package Pages;

import org.openqa.selenium.By;

public class Cart {

    public static By SelectCity = By.id("autocomplete-f1");
    public static By SelectSector = By.id("autocomplete-f2");
    public static By ClickSector = By.xpath("//*[contains(text(),'Sectorul 6')]");
    public static By StreetName = By.id("autocomplete-f3");
    public static By ClickStreet = By.xpath("//*[contains(text(),'Strada Valea Oltului')]");
    public static By StreetNo =  By.id("autocomplete-f4");
    public static By PostalCode = By.xpath("/html/body/oro-store/ng-component/ng-component/main/div/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/div[1]/div/es-cart-v2-address-list/es-cart-v2-delivery-address/form/div/oro-reactive-address-form/div/mat-form-field[1]/div/div[1]/div/input");
    public static By InsertName = By.xpath("/html/body/oro-store/ng-component/ng-component/main/div/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/div[1]/div/es-cart-v2-address-list/es-cart-v2-delivery-address/form/div/div[2]/div/div[1]/mat-form-field/div/div[1]/div/label/input");
    public static By InsertPhoneNo = By.xpath("/html/body/oro-store/ng-component/ng-component/main/div/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/div[1]/div/es-cart-v2-address-list/es-cart-v2-delivery-address/form/div/div[2]/div/div[2]/mat-form-field/div/div[1]/div/input");
    public static By InsertEmail = By.xpath("/html/body/oro-store/ng-component/ng-component/main/div/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/div[1]/div/es-cart-v2-address-list/es-cart-v2-delivery-address/form/div/div[2]/div/div[3]/mat-form-field/div/div[1]/div/input");
    public static By InsertNameInvoice = By.xpath("/html/body/oro-store/ng-component/ng-component/main/div/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/div[2]/div/es-cart-v2-address-list/es-cart-v2-billing-address/form/div/div[1]/div/div/div[1]/mat-form-field/div/div[1]/div/label/input");
    public static By InsertCNP = By.xpath("/html/body/oro-store/ng-component/ng-component/main/div/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/div[2]/div/es-cart-v2-address-list/es-cart-v2-billing-address/form/div/div[1]/div/div/div[2]/mat-form-field/div/div[1]/div/label/input");
    public static By InsertCity = By.xpath("/html/body/oro-store/ng-component/ng-component/main/div/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/div[2]/div/es-cart-v2-address-list/es-cart-v2-billing-address/form/div/oro-reactive-address-form/div/oro-autocomplete-input[1]/oro-mat-form-field/div/div[1]/div/label/input");
    public static By InsertDistrict = By.xpath("/html/body/oro-store/ng-component/ng-component/main/div/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/div[2]/div/es-cart-v2-address-list/es-cart-v2-billing-address/form/div/oro-reactive-address-form/div/oro-autocomplete-input[2]/oro-mat-form-field/div/div[1]/div/label/input");
    public static By ClickDistrict = By.xpath("//*[contains(text(),'Sectorul 6')]");
    public static By InsertStreet = By.xpath("/html/body/oro-store/ng-component/ng-component/main/div/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/div[2]/div/es-cart-v2-address-list/es-cart-v2-billing-address/form/div/oro-reactive-address-form/div/oro-autocomplete-input[3]/oro-mat-form-field/div/div[1]/div/label/input");
    public static By SubmitStreet = By.xpath("//*[contains(text(),'Strada Valea Oltului')]");
    public static By SubmitStreetNo = By.xpath("/html/body/oro-store/ng-component/ng-component/main/div/div/div[1]/mat-tab-group/div/mat-tab-body/div/div/div/div[2]/div/es-cart-v2-address-list/es-cart-v2-billing-address/form/div/oro-reactive-address-form/div/oro-autocomplete-input[4]/oro-mat-form-field/div/div[1]/div/label/input");
    public static By VerifyAge = By.id("isAbove16");
}