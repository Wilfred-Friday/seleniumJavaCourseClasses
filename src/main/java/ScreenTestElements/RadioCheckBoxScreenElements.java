package ScreenTestElements;

import BaseClass.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RadioCheckBoxScreenElements extends Base {
    private WebDriver driver;

    public RadioCheckBoxScreenElements (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    //Elements



}
