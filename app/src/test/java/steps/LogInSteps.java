package steps;

import io.cucumber.java.en.*;
import pages.ProductStorePage;

public class LogInSteps {

    ProductStorePage productStore = new ProductStorePage();

    @Given("^I am on the product store page$")
    public void navigateToProductStore() {
        productStore.navigateToProductStore();

    }

    @When("^I click on Log in$")
    public void clickLogIn() {
        productStore.clickLogIn();
    }

    @And("^I fill in the log in data and click on log in$")
    public void logIn() {
        productStore.enterLogInUsername("blenki");
        productStore.enterLogInPassword("test123");
        productStore.clickLogInButton();
        productStore.aceptAlert();
    }

    @Then("^the result is that a user is created$")
    public void validateResults() {

    }
}
