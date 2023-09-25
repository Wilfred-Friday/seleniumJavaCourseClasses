import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class dragAndDropTest {
    WebDriver driver;
    BrowserSetUp browser = new BrowserSetUp();
    PageElements element = new PageElements();
    Duration time = Duration.ofSeconds(20);




    @BeforeTest
    public void chromeSetUp(){
        driver = browser.chromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://letcode.in/");
        element.workSpaceScreen(driver).click();
        element.dragAndDropScreenFinder(driver,1).click();
    }

    @Test
    public void dragTest(){
        WebElement drag = element.dragElement(driver);
        Actions actions = new Actions(driver);
        System.out.println(drag.getLocation());
        WebElement viewPort = driver.findElement(By.xpath("//body/app-root[1]/app-draggable[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        System.out.println(viewPort.getSize());
        System.out.println(viewPort.getLocation());
        int xValue = drag.getLocation().getX();
        int yValue = drag.getLocation().getY();
        actions.moveToElement(drag).perform();
        actions.dragAndDropBy(drag,xValue + 10,yValue).perform();
        System.out.println(drag.getLocation());
    }

    @Test (priority = 1)
    public void dropTest(){
        driver.navigate().back();
        element.dragAndDropScreenFinder(driver,2).click();
        WebElement drop = element.elementDragAndDropFinder(driver,1);
        WebElement dropTo = element.elementDragAndDropFinder(driver,2);
        Actions actions = new Actions(driver);
        Assert.assertEquals(dropTo.getText(),"Drop here","box dropped");
        actions.dragAndDrop(drop,dropTo).perform();
        Assert.assertEquals(dropTo.getText(),"Dropped!","box not dropped");

    }
}
