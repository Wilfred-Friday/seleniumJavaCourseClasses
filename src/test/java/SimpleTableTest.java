import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTableTest {
    //Class objects tp run browser and finding elements base clase
    BrowserSetUp browser = new BrowserSetUp();
    PageElements element = new PageElements();
    WebElement asistance;
    WebDriver driver;
    int  tableShoppingAddSumTotal;
    int tableShoopingTotal;



    //Run the browser and the page where the testing would be perform
    @BeforeTest
    public void chromeSetUp() {
        driver = browser.chromeDriver(); //set chrome browser
        driver.get("https://letcode.in/"); //lunch url
        element.workSpaceScreen(driver).click(); //lunch screen prior to test
        element.simpleTableButton(driver).click(); // lunch test screen
    }

    @Test
    public void simpleTableTest(){
        tableShoppingAddSumTotal = element.simpleTableHandelerSum(driver);
        tableShoopingTotal = element.simpleTableHandelerSumTotal(driver);
        System.out.println(tableShoppingAddSumTotal);
        Assert.assertEquals(tableShoppingAddSumTotal,tableShoopingTotal,"Sum of total of Shopping list is not correct");
        System.out.println("The Sum of all the shipping list prices is: " + tableShoppingAddSumTotal + " " + "Wich is the same as the expected total of: " + tableShoopingTotal);
    }

    @Test (priority = 1)
    public void rajTablePresentTest(){
        element.rajTable(driver);
    }

    @Test (priority = 2)
    public void sortingTableTest() throws InterruptedException {
        element.sortingTable(driver);
    }
}
