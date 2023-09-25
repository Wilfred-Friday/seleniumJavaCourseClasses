package TestCases;

import BaseClass.Base;
import ScreenTestElements.ButtonsScreenElements;
import ScreenTestElements.InputScreen;
import ScreenTestElements.LandPageElements;
import ScreenTestElements.WorkScreenElements;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ButtonTest {

    WebDriver driver; //Variable for Webdriver
    ButtonsScreenElements element;


    @BeforeTest
    public void chromeSetUp(){
        Base base = new Base(driver);
        driver = base.chromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WorkScreenElements workScreenElements = new WorkScreenElements(driver);
        LandPageElements landPageElements = new LandPageElements(driver);
        element = new ButtonsScreenElements(driver);
        //ButtonsScreenElements  buttonTest = new ButtonsScreenElements(driver);
        driver.get("https://letcode.in/");
        landPageElements.workSpaceClickMethid();
        workScreenElements.buttonClickMethod();
    }

    @Test
    public void pButtonTest(){
        element.TestcaseHomeButton();
        element.TestcaseLocationButton();
        element.TestcaseButtonColor();
        element.TestcaseButtonSize();
        element.TestcaseButtonDisable();
        element.TestcaseButtonHold();
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }
}
