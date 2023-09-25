package TestCases;


import BaseClass.Base;
import ScreenTestElements.InputScreen;
import ScreenTestElements.LandPageElements;
import ScreenTestElements.WorkScreenElements;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InputTest {
    WebDriver driver;
    InputScreen testInputs;

    @BeforeTest
    public void getInputPage(){
        Base base = new Base(driver);
        driver = base.chromeDriver();
        WorkScreenElements workScreenElements = new WorkScreenElements(driver);
        LandPageElements landPageElements = new LandPageElements(driver);
        testInputs = new InputScreen(driver);
        driver.get("https://letcode.in/");
        landPageElements.workSpaceClickMethid();
        workScreenElements.inputClickMethod();
    }

    @Test
    public void inputTest(){
        testInputs.sendUserNameTest("Test user");
        testInputs.appendTextTest(" as an apple");
        testInputs.textBoxAttributeTest();
        testInputs.clearTextTest();
        testInputs.disableTest();
    }


    @AfterTest
    public void quitInputPage(){
        driver.quit();
    }


}
