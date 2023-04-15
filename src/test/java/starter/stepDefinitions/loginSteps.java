package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginSteps {
    @Steps
    starter.fakeStore.login login;
    @Given("I am on the Fakestoreapi.com login page")
    public void onTheLoginPage(){
        login.onTheloginPage();
    }
    @When("I enter my valid username and password")
    public void enterValidUsernameandPassword(){
        login.enterValidUsernameandPassword();
    }
    @And("I click on the login button")
    public void clickOntheLoginButton(){
        login.clickOntheLoginButton();
    }
    @Then("see a message welcome to Fakestore")
    public void welcomeToFakestore(){
        login.welcomeToFakestore();
    }
    @When("I enter my invalid username")
    public void enterInvalidUsername(){
        login.enterInvalidUsername();
    }
    @And("I enter my valid password")
    public void enterValidPassword(){
        login.enterValidPassword();
    }
    @Then("I should see an error message invalid username")
    public void errorMessageInvalidUsername(){
        login.errorMessageInvalidUsername();
    }
    @When("I click on the forgot password button")
    public void clickForgotPasswordButton(){
        login.clickForgotPasswordButton();
    }
    @And("I enter my registered email address")
    public void enterRegisteredEmail(){
        login.enterRegisteredEmail();
    }
    @And("I click on the reset password button")
    public void clickResetPassword(){
        login.clickResetPassword();
    }
    @Then("I should receive an email with instructions on resetting my password")
    public void receiveEmailResettingPassword(){
        login.receiveEmailResettingPassword();
    }
}
