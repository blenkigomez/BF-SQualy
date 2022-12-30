package steps;

import io.cucumber.java.en.*;
import pages.ProductStorePage;

public class LogOutSteps {

    ProductStorePage productStore = new ProductStorePage();

    @Given("^I am on the product store page$")
    public void navigateToProductStore() {
        productStore.navigateToProductStore();
    }

    @When("^I click on Logout$")
    public void clickLogOut() {
        productStore.clickLogOut();
    }

    @Then("^the result is that a user is logout$")
    public void validateResults() {
    }

}
