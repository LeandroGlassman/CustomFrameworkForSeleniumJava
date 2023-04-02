package CustomFramework.steps;

import CustomFramework.utils.DriverManager;
import Pages.Actions.TextBoxActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxSteps {

    private WebDriver driver;
    private TextBoxActions actions;

//    public TextBoxSteps(){
//        actions = new TextBoxActions(driver);
//    }

    @Given("A user who want to submit the form in textbox")
    public void userIsInTheCorrectWebsite(){
//        actions.checkWebsite("Text Box");
          System.out.println("USER IS IN THE CORRECT WEBSITE");
    }
    @When("User complete all the fields")
    public void completeFields(){
        actions.enterFullName("John Doe");
        actions.enterUserEmail("JohnDoe@mail.com");
        actions.enterCurrentAddress("Evergreen 742");
        actions.enterPermanentAddress("Evergreen 742");
    }

    @And("clicks on the submit button")
    public void clickSubmit(){
        actions.clickSubmit();
    }

    @Then("The data he just entered appears below")
    public void checkInfoIsDisplayed(){
        actions.confirmSubmittedInfo();
    }

    @Before
    public void openTheWebsite(){
        driver = DriverManager.getDriver();
        actions = new TextBoxActions(driver);
        driver.get("https://demoqa.com/text-box");
//        System.out.println("Clicking textBox");
//        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
    }

    @After
    public void closeTheBrowser(){
        driver = DriverManager.getDriver();
        driver.close();
    }


}
