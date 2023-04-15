package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class cartSteps{
    @Steps
    starter.fakeStore.cart cart;
    @Given("I am on the frakeStore carts page")
    public void onThefrakeStoreCartsPage(){
        cart.onThefrakeStoreCartsPage();
    }
    @When("I enter get user carts")
    public void GetUserCarts(){
        cart.GetUserCarts();
    }
    @And("I click search button")
    public void clickSearchButton(){
        cart.clickSearchButton();
    }
    @And("I enter write to search data user")
    public void enterWritetoSearchDataUser(){
        cart.enterWritetoSearchDataUser();
    }
    @Then("I see user cart on frakeStore")
    public void seeUserCartonfrakeStore(){
        cart.seeUserCartonfrakeStore();
    }
    @When("I enter delete a cart")
    public void enterDeleteaCart(){
        cart.enterDeleteaCart();
    }
    @And("I click to search whoam delete a cart")
    public void clicktoSearchWhoamDeleteaCart(){
        cart.clicktoSearchWhoamDeleteaCart();
    }
    @And("I enter to ceklis a cart")
    public void entertoCeklisaCart(){
        cart.entertoCeklisaCart();
    }
    @And("I click on the delete button")
    public void clickonTheDeleteButton(){
        cart.clickonTheDeleteButton();
    }
    @Then("I should see a delete text on carts page")
    public void seeaDeleteTextonCartsPage(){
        cart.seeaDeleteTextonCartsPage();
    }
}
