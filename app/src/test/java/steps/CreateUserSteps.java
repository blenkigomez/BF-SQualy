package steps;
import io.cucumber.java.en.*;
import pages.ProductStorePage;

public class CreateUserSteps {
    
    ProductStorePage productStore = new ProductStorePage();

    @Given("^I am on the product store page$")
    public void navigateToProductStore(){
    productStore.navigateToProductStore();

    }

    @When("^I click on sign up$")
    public void clickSignUp(){
        productStore.clickSignUp();
    }

    @And("^I fill in the registration data and click on sign up$")
    public void enterSignUsername(){
        productStore.enterSignUsername("blenkitest2");
        productStore.enterSignPassword("test123");
        productStore.clickSignUpButton();
        productStore.aceptAlert();
    }

    @Then("^the result is that a user is created$")
    public void validateResults(){

    }

}
