package TestCases;

import BaseClass.Base;
import ScreenTestElements.DropDownScreenElements;
import ScreenTestElements.LandPageElements;
import ScreenTestElements.WorkScreenElements;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectDropDownTest {
    //Variables
    WebDriver driver;
    Base base;
    LandPageElements landPageElements;
    WorkScreenElements workScreenElements;
    DropDownScreenElements dropDownScreenElements;


    @BeforeTest
    public void setDriver(){
        base = new Base(driver);
        driver = base.chromeDriver();
        landPageElements = new LandPageElements(driver);
        workScreenElements = new WorkScreenElements(driver);
        dropDownScreenElements = new DropDownScreenElements(driver);
        driver.get("https://letcode.in/");
        landPageElements.workSpaceClickMethid();
        workScreenElements.dropDownClickMethod();
    }

    @Test
    public void dropDownTest(){
        dropDownScreenElements.fruitsDropdown();
        dropDownScreenElements.heroesDropdown();
        dropDownScreenElements.langDropdown();
        dropDownScreenElements.countryDropdown();
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }





}
