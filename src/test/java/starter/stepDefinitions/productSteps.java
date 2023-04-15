package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class productSteps{
    @Steps
    starter.fakeStore.product product;
    @Given("I am on the page to get data product")
    public void getDataProduct(){
        product.getDataProduct();
    }
    @When("I enter change data product")
    public void enterChangeDataProduct(){
        product.enterChangeDataProduct();
    }
    @And("I click new product button")
    public void clickNewProductButton(){
        product.clickNewProductButton();
    }
    @And("I enter to post new product")
    public void enterPostNewProduct(){
        product.enterPostNewProduct();
    }
    @Then("see new product on page")
    public void seeNewProduct(){
        product.seeNewProduct();
    }
    @When("I enter to ceklis data product")
    public void enterCeklisDataProduct(){
        product.enterCeklisDataProduct();
    }
    @And("I click delete button")
    public void clickDeleteButton(){
        product.clickDeleteButton();
    }
    @Then("I should see a delete text on page")
    public void seeDeleteTextonPage(){
        product.seeDeleteTextonPage();
    }
}
