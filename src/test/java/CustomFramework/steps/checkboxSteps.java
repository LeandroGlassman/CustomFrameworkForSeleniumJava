package CustomFramework.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class checkboxSteps {
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
}
