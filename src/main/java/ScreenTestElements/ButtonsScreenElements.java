package ScreenTestElements;

import BaseClass.Base;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsScreenElements extends Base {
    private WebElement driver;

    public ButtonsScreenElements(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    //Page elements
    @FindBy(xpath = "//button[@id='home']")
    private WebElement pHomeButton;

    @FindBy(xpath = "//button[@id='position']")
    private WebElement pPosition;

    @FindBy(xpath = "//button[@id='color']")
    private WebElement pColor;

    @FindBy(xpath = "//button[@id='property']")
    private WebElement pProperty;

    @FindBy(xpath = "//button[contains(text(),'Disabled')]")
    private WebElement pDisable;

    @FindBy(xpath = "//h2[contains(text(),'Button Hold!')]")
    private WebElement pHold;


    //<---------------------------------------------------------------------------->
    //Test cases Methods
    public void TestcaseHomeButton(){
        String currentUrl;
        pClick(pHomeButton);
        currentUrl = pGetUrl();
        Assert.assertEquals("URL is not the same","https://letcode.in/",currentUrl);
        pNavigateBack();
    }

    public void TestcaseLocationButton(){
        int locationX = getX(pPosition);
        int locationY = getY(pPosition);
        Assert.assertEquals("Location not equal", 79, locationX);
        printLog("Valid location " + locationX);
        Assert.assertEquals("Location not equal", 338, locationY);
        printLog("Valid location " + locationY);
    }

    public void TestcaseButtonColor(){
        Assert.assertEquals("Color not Correct", "rgba(138, 77, 118, 1)", getColor(pColor));
        printLog("Valid color " + getColor(pColor));
    }

    public void TestcaseButtonSize(){
        int width = getSizeW(pProperty);
        int height = getSizeH(pProperty);
        Assert.assertEquals("Location not equal", 176, width);
        printLog("Valid size " + width);
        Assert.assertEquals("Location not equal", 40, height);
        printLog("Valid size " + height);
    }

    public void TestcaseButtonDisable(){
        Boolean disable = isDisableMethod(pDisable);
        Assert.assertEquals("Location not equal", disable, false);
        printLog("It's disable ");
    }

    public void TestcaseButtonHold(){
        pHoldElement(pHold);
    }







}
