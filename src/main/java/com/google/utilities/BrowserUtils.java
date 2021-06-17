package com.google.utilities;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    public static void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void sendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(text);
    }

    public static void sendKeys(WebElement element, Keys keys) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(keys);
    }

    public static void assertElementIsDisplayed(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));

        Assert.assertTrue(element.isDisplayed());
    }
    public static void assertElementsAreEqual(WebElement element, String expectedString) {
        wait.until(ExpectedConditions.visibilityOf(element));

        String actualString = element.getText();
        Assert.assertEquals(actualString, expectedString);
    }


        /**
         * Title verification
         */
    public static void titleAssertionEqual(String expectedTitle) {
        wait.until(ExpectedConditions.titleIs(expectedTitle));

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public static void titleAssertionContains(String expectedTitle) {
        //wait.until(ExpectedConditions.titleContains(expectedTitle));

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    public static void getListNames(List<String> names){
        for (String each : names){
           // wait.until(ExpectedConditions.visibilityOfAllElements())
            System.out.println("eachHeader: " + each);
        }
    }

    public static void verifyElementDisplayed(WebElement element) {
        Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        Assert.fail("Element not found: " + element);
    }


    public static List<String> getElementsText(List<WebElement> webElementList) {

        wait.until(ExpectedConditions.visibilityOfAllElements(webElementList));

        List<String> webElementsString = new ArrayList<>();
        for (WebElement each : webElementList) {
            webElementsString.add(each.getText());
        }
        return webElementsString;
    }
}
