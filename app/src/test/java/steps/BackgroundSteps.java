package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ProductStorePage;

public class BackgroundSteps {

    ProductStorePage productStore = new ProductStorePage();

    @Given("^I am on the product store page$")
    public void navigateToProductStore() {
        productStore.navigateToProductStore();

    }

    @When("^I click on sign up$")
    public void clickSignUp() {
        productStore.clickSignUp();
    }

    @And("^I fill in the registration data and click on sign up$")
    public void enterSignUsername() {
        productStore.enterSignUsername("blenkitest2");
        productStore.enterSignPassword("test123");
        productStore.clickSignUpButton();
        productStore.aceptAlert();
    }

    @When("^I click on Log in$")
    public void clickLogIn() {
        productStore.clickLogIn();
    }

    @And("^I fill in the log in data and click on log in$")
    public void logIn() {
        productStore.enterLogInUsername("blenkitest2");
        productStore.enterLogInPassword("test123");
        productStore.clickLogInButton();
        productStore.aceptAlert();
    }

    @Then("^the result is that a user is created$")
    public void validateResults() {
        Assert.assertEquals("expected", productStore.firstResult());
    }
}
