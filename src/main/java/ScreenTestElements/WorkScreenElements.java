package ScreenTestElements;


import BaseClass.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkScreenElements extends Base {

    private WebDriver driver;
    public WorkScreenElements(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Elements
    //Input button Screen Element
    @FindBy(xpath = "//a[contains(text(),'Edit')]")
    private WebElement input;
    @FindBy(xpath = "//a[contains(text(),'Click')]")
    private WebElement button;
    @FindBy(xpath = "//a[contains(text(),'Drop-Down')]")
    private WebElement dropDown;
    @FindBy(xpath = "//a[contains(text(),'Find Elements')]")
    private WebElement findElements;
    @FindBy(xpath = "//a[contains(text(),'Find Elements')]")
    private WebElement pRadioScreen;

    //----------------------------------------------->

    //Actions Methods

    //Input button selection Method
    public void inputClickMethod(){
        pClick(input);
    }

    //Button test Screen Method
    public void buttonClickMethod(){pClick(button);}

    //DropDown test Screen Method
    public void dropDownClickMethod(){pClick(dropDown);}

    //Find elements test Screen Method
    public void findElementsClickMethod(){pClick(findElements);}

    //Radio Screen test Method
    public void RadioElementsClickMethod(){pClick();}



}
