import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NotificationTest {
    WebDriver driver;
    BrowserSetUp browser = new BrowserSetUp();
    PageElements element = new PageElements();
    Alert alert;


    @BeforeTest
    public void chromeSetUp(){
        driver = browser.chromeDriver();
        driver.get("https://letcode.in/");
        element.workSpaceScreen(driver).click();
        element.alertScreenButton(driver).click();
    }

    @Test (priority = 0)
    public void simpleAlertTest(){
        element.findAlertButtons(driver,1).click();
        alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"Hey! Welcome to LetCode");
        alert.accept();
    }
    @Test (priority = 1)
    public void confirmAlertTest(){
        element.findAlertButtons(driver,2).click();
        alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"Are you happy with LetCode?");
        System.out.println(alert.getText());
        alert.dismiss();

    }

    @Test (priority = 2)
    public void typeNameAlertTest(){
        element.findAlertButtons(driver,3).click();
        alert = driver.switchTo().alert();
        alert.sendKeys("Wilfredo Tobar");
        alert.accept();
        Assert.assertEquals(element.alertNameNotitification(driver).getText(),"Your name is: Wilfredo Tobar");
        System.out.println(element.alertNameNotitification(driver).getText());

    }
    @Test (priority = 3)
    public void alertSweetTest(){
        element.findAlertButtons(driver,4).click();
        Assert.assertEquals(element.findSweetAlert(driver,1).getText(),"Modern Alert - Some people address me as sweet alert as well","Compare alert text");
        element.findSweetAlert(driver,2).click();
    }


}
