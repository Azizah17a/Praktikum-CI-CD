package starter.fakeStore;

import net.thucydides.core.annotations.Step;

public class login {
    @Step("I am on the Fakestoreapi.com login page")
    public void onTheloginPage(){
        System.out.println("I am on the Fakestoreapi.com login page");
    }
    @Step("I enter my valid username and password")
    public void enterValidUsernameandPassword(){
        System.out.println("I enter my valid username and password");
    }
    @Step("I click on the login button")
    public void clickOntheLoginButton(){
        System.out.println("I click on the login button");
    }
    @Step("see a message welcome to Fakestore")
    public void welcomeToFakestore(){
        System.out.println("see a message welcome to Fakestore");
    }
    @Step("I enter my invalid username")
    public void enterInvalidUsername(){
        System.out.println("I enter my invalid username");
    }
    @Step("I enter my valid password")
    public void enterValidPassword(){
        System.out.println("I enter my valid password");
    }
    @Step("I should see an error message invalid username")
    public void errorMessageInvalidUsername(){
        System.out.println("I should see an error message invalid username");
    }
    @Step("I click on the forgot password button")
    public void clickForgotPasswordButton(){
        System.out.println("I click on the forgot password button");
    }
    @Step("I enter my registered email address")
    public void enterRegisteredEmail(){
        System.out.println("I enter my registered email address");
    }
    @Step("I click on the reset password button")
    public void clickResetPassword(){
        System.out.println("I click on the reset password button");
    }
    @Step("I should receive an email with instructions on resetting my password")
    public void receiveEmailResettingPassword(){
        System.out.println("I should receive an email with instructions on resetting my password");
    }
}
