package Utils;

import Pages.Magazin;
import common.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.time.Duration;

public  class Utils extends TestBase {

    public static void waitForElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static void clickOnButton(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public static boolean checkIfExists(By locator) {
        try{
            return driver.findElement(locator).isDisplayed();
        } catch (Exception e){
            return false;
        }
    }

    public static void clickButtonJS(By locator){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(locator);
        jse.executeScript("arguments[0].click()", element);
    }

    public static void clickButtonJS(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", element);
    }

    public static void scrollDownPage(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void enterText (By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }

    public static void selectValueOnDropDown(By locator, String Text) {

        Select selectValue = new Select(driver.findElement(locator));
        selectValue.selectByVisibleText(Text);
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForElementLocated(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void fluentWait(By locator) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void clickElementInList(By locator, Integer i) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(locator).get(i)));
        clickButtonJS(driver.findElements(locator).get(i));
        }

        public static void waitForElementToBeDisplayed (By locator){

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public static void waitForUrlToBe (String URL){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.urlMatches(URL));

    }
    }

