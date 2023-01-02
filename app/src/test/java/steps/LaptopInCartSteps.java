package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cucumber.api.java.en.And;
import pages.ProductStorePage;

public class LaptopInCartSteps {

    ProductStorePage productStore = new ProductStorePage();

    @Given("^I click on laptop$")
    public void clickInLaptop() {
        productStore.clickInLaptop();
    }

    @And("^I click to add to cart and acept popup$")
    public void enterSignUsername() {
        productStore.addToCartButton();
        productStore.aceptAlert();
    }

    @Then("^the result is that a laptop is added on my cart$")
    public void validateResults(String textToValidate, String locator) {
        productStore.validateText("Sony vaio i5", locator);
    }
}
