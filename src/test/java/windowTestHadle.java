import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class windowTestHadle {
    //Class objects tp run browser and finding elements base clase
    BrowserSetUp browser = new BrowserSetUp();
    PageElements element = new PageElements();
    WebDriver driver;
    WebElement button;
    String mainWindow;



    //Run the browser and the page where the testing would be perform
    @BeforeTest
    public void chromeSetUp() {
        driver = browser.chromeDriver(); //set chrome browser
        driver.get("https://letcode.in/"); //lunch url
        element.workSpaceScreen(driver).click(); //lunch screen prior to test
        element.windowButtonScreen(driver).click(); // lunch test screen
        mainWindow = driver.getWindowHandle();
    }

    @Test
    public void windowNewTest(){
        element.findWindowButtonsScreen(driver,1).click(); //Click on the home page button
        element.multipleWindowId(driver,1); // handle multiple tabs
        System.out.println(driver.getTitle()); // print the name of the child tab
        driver.close(); // close the child tab
        driver.switchTo().window(mainWindow);
        element.findWindowButtonsScreen(driver,2).click(); // click on the multiple page button
        element.multipleWindowId(driver); //Print all tab titles
        driver.switchTo().window(mainWindow).close(); //close parent tab
        Assert.assertEquals(driver.getWindowHandles().size(), 2,"Parent tab not closed");
        System.out.println("Parent tab is closed");
        driver.quit(); // Close all tabs
    }




}
