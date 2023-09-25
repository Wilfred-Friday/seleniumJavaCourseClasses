package ScreenTestElements;


import BaseClass.Base;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class InputScreen extends Base {

    private WebDriver driver;
    public InputScreen(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Page Elements
    //fullName Element
    @FindBy(xpath = "//input[@id='fullName']")
    private WebElement fullName;
    //Clear Element
    @FindBy(xpath = "//input[@id='clearMe']")
    private WebElement clearMe;
    //No edit Element
    @FindBy(xpath = "//input[@id='noEdit']")
    private WebElement noEdit;
    //Dont Write Element
    @FindBy(xpath = "//input[@id='dontwrite']")
    private WebElement dontwrite;
    //Join Element
    @FindBy(xpath = "//input[@id='join']")
    private WebElement join;
    //Get Me Element
    @FindBy(xpath = "//input[@id='getMe']")
    private WebElement getMe;

    //---------------------------------------------------------------
    //Screen Test methods
    //User Name Test
    public void sendUserNameTest(String name){
        sendKeysText(fullName,name);
        explicitWait(fullName);
        Assert.assertEquals("User is not correct","Test user",getAttributeElement(fullName));
        printLog(getAttributeElement(fullName));
    }

    //Append text Test
    public void appendTextTest(String append){
        join.sendKeys(append);
        Assert.assertEquals("I am good as an apple",getAttributeElement(join));
        printLog(getAttributeElement(join));
        actionTab(join);
    }

    //Get attribute Test
    public void textBoxAttributeTest(){
        printLog(getAttributeElement(getMe));
    }

    //Clear Test
    public void clearTextTest(){
        clearElement(clearMe);
        Assert.assertEquals(true,validateElementValue(clearMe));
        printLog("It's cleared");
    }

    //Disable test
    public void disableTest(){
        Assert.assertEquals(false,isDisableMethod(noEdit));
        printLog("It's disable");
    }


}
