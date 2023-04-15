package starter.fakeStore;

import net.thucydides.core.annotations.Step;

public class cart{
    @Step("I am on the frakeStore carts page")
    public void onThefrakeStoreCartsPage(){
        System.out.println("I am on the frakeStore carts page");
    }
    @Step("I enter get user carts")
    public void GetUserCarts(){
        System.out.println("I enter get user carts");
    }
    @Step("I click search button")
    public void clickSearchButton(){
        System.out.println("I click search button");
    }
    @Step("I enter write to search data user")
    public void enterWritetoSearchDataUser(){
        System.out.println("I enter write to search data user");
    }
    @Step("I see user cart on frakeStore")
    public void seeUserCartonfrakeStore(){
        System.out.println("I see user cart on frakeStore");
    }
    @Step("I enter delete a cart")
    public void enterDeleteaCart(){
        System.out.println("I enter delete a cart");
    }
    @Step("I click to search whoam delete a cart")
    public void clicktoSearchWhoamDeleteaCart(){
        System.out.println("I click to search whoam delete a cart");
    }
    @Step("I enter to ceklis a cart")
    public void entertoCeklisaCart(){
        System.out.println("I enter to ceklis a cart");
    }
    @Step("I click on the delete button")
    public void clickonTheDeleteButton(){
        System.out.println("I click on the delete button");
    }
    @Step("I should see a delete text on carts page")
    public void seeaDeleteTextonCartsPage(){
        System.out.println("I should see a delete text on carts page");
    }
}
