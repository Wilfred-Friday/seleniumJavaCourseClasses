import ScreenTestElements.FormElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FormularyTest {
    BrowserSetUp browser = new BrowserSetUp();
    PageElements elements = new PageElements();
    WebDriver driver;



    @BeforeTest
    public void chromeSetUp(){
         driver = browser.chromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://letcode.in/");
        elements.workSpaceScreen(driver).click();
        elements.formButton(driver).click();

    }

    @Test
    public void formValidationTestValidInformation(){
        FormElements formElements = new FormElements(driver);
        formElements.submitFirstNameMethod("Test user");
        formElements.submitlastNameMethod("Test user last name");
        formElements.submitEmailMethod("test@email.com");
        formElements.selectCountryCodeDropdownMethod("El Salvador");

    }
}
