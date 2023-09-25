package ScreenTestElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FormElements {

    private  WebDriver driver;
    public FormElements (WebDriver driver){
        this.driver = driver;
    }

    /*find page
    @FindBy(linkText = "All in One")
    public WebElement form;

     */

    //First name input element
    @FindBy(id= "username")
    private WebElement firstName;

    //Last name input element
    @FindBy(id= "lasttname")
    private WebElement lastName;

    //Email input element
    @FindBy(id= "email")
    private WebElement email;

    //country code dropdown element
    @FindBy(xpath= "//body[1]/app-root[1]/app-forms[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]")
    private WebElement countryCodeDropdown;

    //Phone Number input element
    @FindBy(id= "Phno")
    private WebElement phoneNumber;

    //Address Line 1 input element
    @FindBy(id= "Addl1")
    private WebElement addressLn1;

    //Address Line 2 input element
    @FindBy(id= "Addl2")
    private WebElement addressLn2;

    //State input element
    @FindBy(id= "state")
    private WebElement state;

    //Postal-code input element
    @FindBy(id= "postalcode")
    private WebElement postalCode;

    //Country dropdown element
    @FindBy(xpath= "//body[1]/app-root[1]/app-forms[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[2]/div[1]/div[1]/div[1]/select[1]")
    private WebElement country;

    //Date of Birth input element
    @FindBy(id= "Date")
    private WebElement dateOfBirth;

    //Gender radio male button element
    @FindBy(id= "male")
    private WebElement male;

    //Gender radio female button element
    @FindBy(id= "female")
    private WebElement female;

    //Gender radio trans button element
    @FindBy(id= "trans")
    private WebElement trans;

    //checkbox term and conditions element
    @FindBy(xpath= "//body/app-root[1]/app-forms[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/label[1]/input[1]")
    private WebElement checkBox;

    //Submit button element
    @FindBy(xpath= "//body/app-root[1]/app-forms[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/input[1]")
    private WebElement submitButton;


    //First name input method
    public void submitFirstNameMethod(String name){

        this.firstName.sendKeys(name);
    }

    //Last name input method
    public void submitlastNameMethod(String name){
        lastName.sendKeys(name);
    }

    //Email input method
    public void submitEmailMethod(String name){
        email.sendKeys(name);
    }

    //Country code dropdown select method
    public void selectCountryCodeDropdownMethod(String country){
        Select userCountryCodeDropdown = new Select(countryCodeDropdown.findElement(By.tagName("option")));
        userCountryCodeDropdown.selectByValue(country);
    }

    //Address line #1 input method
    public void addressLn1Method(String address){
        addressLn1.sendKeys(address);
    }

    //Address line #2 input method
    public void addressLn2Method(String address){
        addressLn2.sendKeys(address);
    }

    //State input method
    public void stateMethod(String name){
        state.sendKeys(name);
    }

    //Postal code input method
    public void postalCodeMethod(String code){
        postalCode.sendKeys(code);
    }

    //Country dropdown select method
    public void selectCountryDropdownMethod(int code){
        Select userCountryDropdown = new Select(country.findElement(By.tagName("option")));
        userCountryDropdown.selectByIndex(code);
    }

    //Date of Birth input method
    public void dateOfBirthMethod(String name){
        dateOfBirth.sendKeys(name);
    }

    //Gender radio select method
    public void genderMethod(String name){
        male.click();
    }

    //Check box terms and conditions method
    public void checkboxTermsMethod(String name){
        checkBox.click();
    }

    //Submit button method
    public void submitButtonMethod(String name){
        submitButton.click();
    }

    /*form page method
    public void formPageMethod(WebDriver driver){
        System.out.println(form.getText());
        form.click();
    }

     */

}
