package ScreenTestElements;

import BaseClass.Base;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownScreenElements extends Base {

    private WebDriver driver;

    public DropDownScreenElements (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    //Elements
    @FindBy(xpath = "//select[@id='fruits']")
    WebElement pFruits;

    @FindBy(xpath = "//select[@id='superheros']")
    WebElement pHeroes;

    @FindBy(xpath = "//select[@id='lang']")
    WebElement pLang;

    @FindBy(xpath = " //select[@id='country']")
    WebElement pCountry;

    @FindBy(xpath = "//p[contains(text(),'You have selected Mango')]")
    WebElement fruitNotification;

    //------------------------------------------------->

    //Methods

    public void fruitsDropdown(){
        visibleText(pFruits,"Mango");
        Assert.assertEquals("Messages is not equal","You have selected Mango",getTextElement(fruitNotification));
    }

    public void heroesDropdown(){
        Assert.assertEquals("Messages is not Multiple",true,pIsMultiple(pHeroes));
        pByIndex(pHeroes,5);
        pByValue(pHeroes,"ca");
    }

    public void langDropdown(){
        pGetOptions(pLang);
        pByIndex(pLang,2);
    }

    public void countryDropdown(){
        visibleText(pCountry,"Venezuela");
        printLog(pGetFisrtSOption(pCountry));
    }








}
