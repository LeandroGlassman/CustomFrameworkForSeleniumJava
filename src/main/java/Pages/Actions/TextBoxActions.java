package Pages.Actions;

import Pages.Locators.TextBoxLocators;
import org.openqa.selenium.WebDriver;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;


public class TextBoxActions {
    private WebDriver driver;

    // constructor
    public TextBoxActions(WebDriver driver){
        this.driver = driver;
    }

    // Page methods
    public void checkWebsite(){
        driver.findElement(TextBoxLocators.CheckWebsite).isDisplayed();
    }

    public void enterFullName(String fullName){
        driver.findElement(TextBoxLocators.FullNameField).sendKeys(fullName);
    }

    public void enterUserEmail(String userEmail){
        driver.findElement(TextBoxLocators.EmailField).sendKeys(userEmail);
    }

    public void enterCurrentAddress(String currentAddress){
        driver.findElement(TextBoxLocators.CurrentAddress).sendKeys(currentAddress);
    }

    public void enterPermanentAddress(String permanentAddress){
        driver.findElement(TextBoxLocators.PermanentAddress).sendKeys(permanentAddress);
    }

    public void clickSubmit(){
        driver.findElement(TextBoxLocators.SubmitButton).click();
    }

    public void confirmSubmittedInfo(){
        driver.findElement(TextBoxLocators.ConfirmResult).isDisplayed();
    }
}
