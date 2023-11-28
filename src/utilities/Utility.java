package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {

    // This method will click on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    // This method will send text to element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys();
    }

    //This Method will get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public void clearTextFromElement(By by) {
        driver.findElement(by).clear();
    }

    //*******************************************  Select class Method   *********************************************

    // Select By Value from DropDown
    public void selectByValueFromDropDown(By by, String value) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByValue(value);
    }


    //Select By index from dropDown
    public void selectByIndexFromDown(By by, int index) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByIndex(index);
    }

    //Select by Visible text from DropDown
    public void selectByVisibleTextByDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);

    }
    //********************************************  Action method Mouse Hoover  *******************************************

    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    //This method will verify the text
    public void verifyText(String expectedText, String actualText) {
        Assert.assertEquals(expectedText, actualText);

    }

    /**
     * This method will use to hover mouse on element
     */
    public void mouseHoverOnElement(By by) {
        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    /**
     * This method will mouse hover over any element and click on it
     */
    public void mouseHoverOnElementAndClick(By by) {
        Actions actions = new Actions(driver);
        WebElement text1 = driver.findElement(by);
        actions.moveToElement(text1).click().build().perform();
    }

    /**
     * This method will verify the two text from the elements
     */
    public void verifyTheStringMessage(By by, String actualMessage) {
        String expected = getTextFromElement(by);
        String expectedString = expected.substring(0, actualMessage.length());
        Assert.assertEquals(expectedString, actualMessage);
    }

}
