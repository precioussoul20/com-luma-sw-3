package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class WomenTest extends Utility {
    static String baseUrl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void sortByProductNameFilter() throws InterruptedException {
        // 1.1Mouse Hover on Women Menu
        mouseHoverToElement(By.id("ui-id-4"));
        //1.2 Mouse Hover on Tops
        mouseHoverToElement(By.id("ui-id-9"));
        //1.3 Click on Jackets
        clickOnElement(By.id("ui-id-11"));
        //1.4 Select Sort By filter “Product Name”
        selectByVisibleTextByDropDown(By.id("sorter"), "Product Name");
        //1.5 Verify the products name display in alphabetical order
        List<WebElement> Names = driver.findElements(By.className("product-item-link"));
        int number = Names.size();
        System.out.println("Number of Products Displayed : " + number);
        for (WebElement productNames : Names) {
            System.out.println(productNames.getText());

        }
    }


    @Test
    public void verifyTheSortByPriceFilter() {

        // 2.1Mouse Hover on Women Menu
        mouseHoverToElement(By.id("ui-id-4"));
        // 2.2 Mouse Hover on Tops
        mouseHoverToElement(By.id("ui-id-9"));
        // 2.3 Click on Jackets
        clickOnElement(By.id("ui-id-11"));
        // 2.4 Select Sort By Filter "Price
        selectByVisibleTextByDropDown(By.id("sorter"),"Price");
        // 2.5 verify the products prices display in Low to High
        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='price-box price-final_price']"));
        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i).getText());


        }
    }





    @After
    public void tearDown()
    {
        closeBrowser();
    }
}




