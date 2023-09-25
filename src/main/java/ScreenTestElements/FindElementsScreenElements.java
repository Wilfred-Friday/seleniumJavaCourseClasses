package ScreenTestElements;

import BaseClass.Base;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindElementsScreenElements extends Base {

    private WebDriver driver;

    public FindElementsScreenElements(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    //Elements locators
    @FindBy(name = "username")
    WebElement pUserNameInput;

    @FindBy(xpath = "//body/app-root[1]/app-githome[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-usercard[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/img[1]")
    WebElement pGitImage;

    @FindBy(xpath = "//p[contains(text(),'Koushik Chatterjee')]")
    WebElement puserTitle;

    @FindBy(xpath = "//p[contains(text(),'Chennai, Tn, India')]")
    WebElement puserSubTitle;

    @FindBy(xpath = "//span[contains(text(),'Youtuber')]")
    WebElement pSpanUser;


    @FindBys({
            @FindBy(xpath = "//body/app-root[1]/app-githome[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-gitrepos[1]/div[1]/div[1]"),
            @FindBy(tagName = "li")
    })
    private List <WebElement> pGitUserLinks;

    @FindBy(css = "section.section.has-background-white-ter:nth-child(2) div.container div.columns.is-multiline div.column.is-7-desktop.is-8-tablet:nth-child(1) div.card div.card-content div.block div.block.mt-4 div.content div.content div.field.is-grouped.is-grouped-multiline div.control:nth-child(1) div.tags.has-addons > span.tag.is-info:nth-child(2)")
    WebElement repoPublic;

    //----------------------------------------------------------------------------------------------------------------->
    //Methods

    public void sendInputInfo(){
        sendKeysTextEnter(pUserNameInput,"ortonikc");
    }

    public void imageTest(){
        explicitWait(pGitImage);
        Assert.assertTrue(pIsDisplayed(pGitImage));
    }

    public void gitUserPrintInfo(){
        printLog(getTextElement(puserTitle));
        printLog(getTextElement(puserSubTitle));
        printLog(getTextElement(pSpanUser));
    }

    public void validateGitLinks(){
        Assert.assertEquals("Links displayed are not equal to the Public repo",convertStringToInt(getTextElement(repoPublic)),pListSize(pGitUserLinks));
    }




}
