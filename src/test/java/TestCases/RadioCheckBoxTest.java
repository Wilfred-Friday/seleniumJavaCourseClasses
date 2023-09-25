package TestCases;

import BaseClass.Base;
import ScreenTestElements.FindElementsScreenElements;
import ScreenTestElements.LandPageElements;
import ScreenTestElements.WorkScreenElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class RadioCheckBoxTest {
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

    @Test
    //Radio click test code
    public void radioClickTest(){
        radioButton1 = element.findRadioCheckboxElements(driver,1);
        radioButton1.click();
        Assert.assertTrue(radioButton1.isSelected(), "Radio button selection");
        System.out.println("Radio button test 1 pass");
    }

    @Test (priority = 1)
    //Radio multiple selecctions click test code
    public void radioMultipleClickTest(){
        radioButton1 = element.findRadioCheckboxElements(driver,3);
        radioButton2 = element.findRadioCheckboxElements(driver,4);
        for(int i =0; i <=1; i++){
            if(i == 0){
                radioButton1.click();
                Assert.assertFalse(radioButton2.isSelected(), "Radio button selection");
                System.out.println("Yes can only be selected");
            }else{
                radioButton2.click();
                Assert.assertFalse(radioButton1.isSelected(), "Radio button selection");
                System.out.println("No can only be selected");
            }
        }
    }

    @Test (priority = 2)
    //Radio Bug verification click test code
    public void radiobUGClickTest(){
        radioButton1 = element.findRadioCheckboxElements(driver,5);
        radioButton2 = element.findRadioCheckboxElements(driver,6);

        // Verify that both radio buttons are initially not selected
        Assert.assertFalse(radioButton1.isSelected(), "Radio button 1 is unexpectedly selected");
        Assert.assertFalse(radioButton2.isSelected(), "Radio button 2 is unexpectedly selected");

        // Click the first radio button and verify its selection
        radioButton1.click();
        Assert.assertTrue(radioButton1.isSelected(), "Radio button 1 is not selected after click");
        Assert.assertFalse(radioButton2.isSelected(), "Radio button 2 is unexpectedly selected after click");

        // Click the second radio button and verify its selection
        radioButton2.click();
        Assert.assertFalse(radioButton1.isSelected(), "Radio button 1 is unexpectedly selected after second click");
        Assert.assertTrue(radioButton2.isSelected(), "Radio button 2 is not selected after click");

        // Click the first radio button again and verify its selection
        radioButton1.click();
        Assert.assertTrue(radioButton1.isSelected(), "Radio button 1 is not selected after second click");
        Assert.assertFalse(radioButton2.isSelected(), "Radio button 2 is unexpectedly selected after second click");
    }

    @Test (priority = 3)
    //Find the Radio button selected by default
    public void findRadioSelectedTest(){
        radioButton1 = element.findRadioCheckboxElements(driver,7);
        radioButton2 = element.findRadioCheckboxElements(driver,8);
        Assert.assertTrue(radioButton1.isSelected(),"Radio1 is not selected");
        Assert.assertTrue(radioButton2.isSelected(),"Radio2 is not selected");
    }

    @Test (priority = 4)
    //Find the Radio button disabled by default
    public void findRadioDisableTest(){
        radioButton1 = element.findRadioCheckboxElements(driver,9);
        Assert.assertFalse(radioButton1.isEnabled(),"Radio button should be disabled");
    }

    @Test (priority = 5)
    //Find the CheckBox  Selected by default
    public void findCheckBoxSelectedTest(){
        WebElement checkBox = element.findRadioCheckboxElements(driver,13);
        Assert.assertTrue(element.findRadioCheckboxElements(driver,12).isSelected(),"CheckBox not selected");
        checkBox.click();
        Assert.assertTrue(checkBox.isSelected(),"CheckBox not selected");
    }


    



}
