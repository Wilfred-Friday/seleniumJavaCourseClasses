package TestCases;

import BaseClass.Base;
import ScreenTestElements.ButtonsScreenElements;
import ScreenTestElements.FindElementsScreenElements;
import ScreenTestElements.LandPageElements;
import ScreenTestElements.WorkScreenElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FindElementsTest {
    //Class objects tp run browser and finding elements base clase
    WebDriver driver; //Variable for Webdriver
    FindElementsScreenElements findElementsScreenElements;


    @BeforeTest
    public void chromeSetUp(){
        Base base = new Base(driver);
        driver = base.chromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WorkScreenElements workScreenElements = new WorkScreenElements(driver);
        LandPageElements landPageElements = new LandPageElements(driver);
        findElementsScreenElements = new FindElementsScreenElements(driver);
        driver.get("https://letcode.in/");
        landPageElements.workSpaceClickMethid();
        workScreenElements.findElementsClickMethod();
    }

//Wilfred-Friday
    @Test(priority = 1)
    public void pFindElementsTest1(){
        findElementsScreenElements.sendInputInfo();
    }
    @Test(priority = 2)
    public void pFindElementsTest2(){
        findElementsScreenElements.imageTest();
    }
    @Test(priority = 3)
    public void pFindElementsTest3(){
        findElementsScreenElements.gitUserPrintInfo();
    }
    @Test(priority = 4)
    public void pFindElementsTest4(){
        findElementsScreenElements.validateGitLinks();
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }

}
