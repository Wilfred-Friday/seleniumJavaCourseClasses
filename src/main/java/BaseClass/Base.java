package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class Base {
    private WebDriver driver;

    public Base (WebDriver driver){
        this.driver = driver;
    }

    //Google Chrome Browser Method
    public WebDriver chromeDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*", "start-maximized");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
    }

    //print Method on console

    public void printLog(String print){
        System.out.println(print);
    }

    //Get attribute element attribute
    public String getAttributeElement(WebElement element){
        return element.getAttribute("value");
    }

    //Send text
    public void sendKeysText(WebElement element, String text){
        element.sendKeys(text);
    }

    //Send text and Enter
    public void sendKeysTextEnter(WebElement element, String text){
        element.sendKeys(text,Keys.ENTER);
    }

    //Get text element
    public String getTextElement(WebElement element){
        return element.getText();
    }


    //wait method
    public void explicitWait(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Actions tab Method
    public void actionTab(WebElement element){
        Actions actions = new Actions(driver);
        actions.sendKeys(element,Keys.TAB).build().perform();
    }

    //Clear input Method
    public void clearElement(WebElement element){
        element.clear();
    }

    //Validate element value Method
    public Boolean validateElementValue(WebElement element){
        String clear = element.getAttribute("value");
        return clear.isEmpty();
    }

    //Confirm is disable Method
    public Boolean isDisableMethod(WebElement element){
        return element.isEnabled();
    }

    //Click Method
    public void pClick(WebElement element){ element.click();}

    //Get url method
    public String  pGetUrl(){
        return driver.getCurrentUrl();
    }

    //Navigate back method
    public void pNavigateBack(){
        driver.navigate().back();
    }

    //Get Coordinates for X
    public int getX(WebElement element){
        return element.getLocation().getX();
    }

    //Get Coordinates for y
    public int getY(WebElement element){
        return element.getLocation().getY();
    }

    //Get color Method
    public String getColor(WebElement element){
        return element.getCssValue("background-color");
    }

    //Get size Height
    public int getSizeH(WebElement element){
        return element.getSize().getHeight();
    }

    //Get size Width
    public int getSizeW(WebElement element){
        return element.getSize().getWidth();
    }

    //Hold element method
    public void pHoldElement(WebElement element){
        Actions action = new Actions(driver);
        action.clickAndHold(element).build().perform();
    }

    //Select method by visible text dropdown
    public void visibleText(WebElement element,String text){
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(text);
    }
    //Select method by visible text dropdown
    public  Boolean pIsMultiple(WebElement element){
        Select dropdown = new Select(element);
        return dropdown.isMultiple();
    }
    //Select method by index dropdown
    public void pByIndex(WebElement element,int index){
        Select dropdown = new Select(element);
        dropdown.selectByIndex(index);
    }
    //Select method by value dropdown
    public void pByValue(WebElement element,String text){
        Select dropdown = new Select(element);
        dropdown.selectByValue(text);
    }
    //Get all options dropdown
    public void pGetOptions(WebElement element){
        Select dropdown = new Select(element);
        List<WebElement> langOptions = dropdown.getOptions();
        System.out.println(langOptions.size());
        for (WebElement lang : langOptions) {
            System.out.println(lang.getText());
        }
    }

    //Get first selected options method dropdown
    public String pGetFisrtSOption(WebElement element){
        Select dropdown = new Select(element);
        return dropdown.getFirstSelectedOption().getText();
    }

    //Print text of a Web element list
    public void pWebElementListText(List <WebElement> elements){
        for (WebElement element: elements) {
            System.out.println(element.getText());
        }
    }

    //Is displayed method
    public Boolean pIsDisplayed(WebElement element){
        return element.isDisplayed();
    }

    //String to Int method
    public int convertStringToInt(String element){
        return Integer.parseInt(element);
    }

    //List Size
    public int pListSize(List <WebElement> list){
        return list.size();
    }

    //findElements





}
