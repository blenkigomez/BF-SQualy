package steps;

import io.cucumber.java.en.*;
import pages.ProductStorePage;

public class LaptopInCartSteps {
   
    ProductStorePage productStore = new ProductStorePage();

    @Given("^I am on the product store page$")
    public void navigateToProductStore(){
    productStore.navigateToProductStore();

    }

    @And("^I logged in with my username and password$")
   /*  public void logIn(){
        productStore.enterLogInUsername("blenki1");
        productStore.enterLogInPassword("test123");
        productStore.clickLogInButton();
        productStore.aceptAlert();
   }*/

    @When("^I click on laptop$")
    public void clickInLaptop(){
        productStore.clickInLaptop();
    }

    @And("^I click to add to cart and acept popup$")
    public void enterSignUsername(){
        productStore.addToCartButton();
        productStore.aceptAlert();
    }

    @Then("^the result is that a laptop is added on my cart$")
    public void validateResults(){

    }
    }
    


