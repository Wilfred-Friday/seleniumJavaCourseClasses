import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class iFrameTest {

    //Class objects tp run browser and finding elements base clase
    BrowserSetUp browser = new BrowserSetUp();
    PageElements element = new PageElements();
    WebDriver driver;
    WebElement iframeInput;

    //Run the browser and the page where the testing would be perform
    @BeforeTest
    public void chromeSetUp(){
        driver = browser.chromeDriver();
        driver.get("https://letcode.in/");
        element.workSpaceScreen(driver).click();
        element.iframeScreenButton(driver).click();
        driver.switchTo().frame("firstFr");
    }

    @Test
    public void iframTestKeys(){
        element.findIframeElements(driver,1).sendKeys("Wilfredo");
        driver.switchTo().frame(0);
        element.findIframeElements(driver).sendKeys("wtestemail@email.com");
        driver.switchTo().parentFrame();
        element.findIframeElements(driver,2).sendKeys("Alfaro Tobar");
        driver.switchTo().defaultContent();
        Assert.assertEquals(element.iframeH1Name(driver).getText(),"Frame");
        System.out.println("Default content selected");
    }


}
