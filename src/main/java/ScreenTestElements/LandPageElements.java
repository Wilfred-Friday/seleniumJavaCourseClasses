package ScreenTestElements;

import BaseClass.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandPageElements extends Base {

    private WebDriver driver;

    public LandPageElements(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Elements

    //WorkSpace button Element
    @FindBy(xpath = "//a[@id='testing']")
    private WebElement workSpace;

    //Actions for Elements Methods

    //Click on Workspace Button Action
    public void workSpaceClickMethid(){
        pClick(workSpace);
    }



}
