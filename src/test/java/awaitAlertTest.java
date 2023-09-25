import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class awaitAlertTest {
    WebDriver driver;
    BrowserSetUp browser = new BrowserSetUp();
    PageElements element = new PageElements();
    Duration time = Duration.ofSeconds(20);




    @BeforeTest
    public void chromeSetUp(){
        driver = browser.chromeDriver();
        driver.get("https://letcode.in/");
        element.workSpaceScreen(driver).click();
        element.alertButtonScreen(driver).click();
    }

    @Test
    public void awaitAlertTest(){
        element.findAlertButton(driver).click();
        element.awaitMethod(driver,time);
    }




}
