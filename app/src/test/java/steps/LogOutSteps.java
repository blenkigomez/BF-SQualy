package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.ProductStorePage;

public class LogOutSteps {

    ProductStorePage productStore = new ProductStorePage();

    @Given("^I click on Logout$")
    public void clickLogOut() {
        productStore.clickLogOut();
    }

    @Then("^the result is that a user is logout$")
    public void validateResults() {
    }

}
