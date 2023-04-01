package CustomFramework.steps;

import CustomFramework.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class checkboxSteps {

    private WebDriver driver;

    @Given("a user inside checkbox section")
    public void userInsideCheckbox(){
        System.out.println("navigate to checkbox");
    }

    @Then("user clicks on home checkbox")
    public void clickHomeCheckbox(){
        System.out.println("click home checkbox");
    }

    @Then("all the checkbox of the path are now selected")
    public void checkIfAllOptionsWereSelected(){
        System.out.println("Check if all options were selected");
    }

    @Before
    public void openTheWebsite(){
        driver = DriverManager.getDriver();
        driver.get("https://demoqa.com/elements");
    }

    @After
    public void closeTheBrowser(){
        driver = DriverManager.getDriver();
        driver.close();
    }


}
