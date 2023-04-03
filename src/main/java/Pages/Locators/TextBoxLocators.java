package Pages.Locators;

import org.openqa.selenium.By;

public class TextBoxLocators {
    // WebElement locators
    public static final By CheckWebsite = By.cssSelector("#userName");
    public static final By FullNameField = By.cssSelector("#userName");
    public static final By EmailField = By.cssSelector("#userEmail");
    public static final By CurrentAddress =By.cssSelector("#currentAddress");
    public static final By PermanentAddress =By.cssSelector("#permanentAddress");
    public static final By SubmitButton = By.cssSelector("#submit");
    public static final By ConfirmResult = By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.text-field-container:nth-child(2) form:nth-child(1) div.mt-4.row:nth-child(6) > div.border.col-md-12.col-sm-12");
}
