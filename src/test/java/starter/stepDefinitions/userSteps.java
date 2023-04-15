package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class userSteps{
    @Steps
    starter.fakeStore.user user;
    @Given("I am on the profile user page")
    public void onTheProfileUserPage(){
        user.onTheProfileUserPage();
    }
    @When("I enter change a data user")
    public void changeaDataUser(){
        user.changeaDataUser();
    }
    @And("I click add a new user button")
    public void clickAddAnewUserButton(){
        user.clickAddAnewUserButton();
    }
    @And("I enter valid profile user")
    public void enterValidProfileUser(){
        user.enterValidProfileUser();
    }
    @And("I click submit button")
    public void clickSubmitButton(){
        user.clickSubmitButton();
    }
    @Then("see a new profile user on frakeStore")
    public void seeaNewProfileUser(){
        user.seeaNewProfileUser();
    }
    @When("I enter to ceklis a data user")
    public void entertoCeklisaDataUser(){
        user.entertoCeklisaDataUser();
    }
    @And("I click the delete user button")
    public void clickThedeleteUserButton(){
        user.clickThedeleteUserButton();
    }
    @Then("see a message delete on page")
    public void seeaMessageDelete(){
        user.seeaMessageDelete();
    }
}
