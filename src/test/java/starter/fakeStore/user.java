package starter.fakeStore;

import net.thucydides.core.annotations.Step;

public class user{
    @Step("I am on the profile user page")
    public void onTheProfileUserPage(){
        System.out.println("I am on the profile user page");
    }
    @Step("I enter change a data user")
    public void changeaDataUser(){
        System.out.println("I enter change a data user");
    }
    @Step("I click add a new user button")
    public void clickAddAnewUserButton(){
        System.out.println("I click add a new user button");
    }
    @Step("I enter valid profile user")
    public void enterValidProfileUser(){
        System.out.println("I enter valid profile user");
    }
    @Step("I click submit button")
    public void clickSubmitButton(){
        System.out.println("I click submit button");
    }
    @Step("see a new profile user on frakeStore")
    public void seeaNewProfileUser(){
        System.out.println("see a new profile user on frakeStore");
    }
    @Step("I enter to ceklis a data user")
    public void entertoCeklisaDataUser(){
        System.out.println("I enter to ceklis a data user");
    }
    @Step("I click the delete user button")
    public void clickThedeleteUserButton(){
        System.out.println("I click the delete user button");
    }
    @Step("see a message delete on page")
    public void seeaMessageDelete(){
        System.out.println("see a message delete on page");
    }
}
