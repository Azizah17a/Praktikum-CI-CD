package starter.fakeStore;

import net.thucydides.core.annotations.Step;

public class product{
    @Step("I am on the page to get data product")
    public void getDataProduct(){
        System.out.println("I am on the page to get data product");
    }
    @Step("I enter change data product")
    public void enterChangeDataProduct(){
        System.out.println("I enter change data product");
    }
    @Step("I click new product button")
    public void clickNewProductButton(){
        System.out.println("I click new product button");
    }
    @Step("I enter to post new product")
    public void enterPostNewProduct(){
        System.out.println("I enter to post new product");
    }
    @Step("see new product on page")
    public void seeNewProduct(){
        System.out.println("see new product on page");
    }
    @Step("I enter to ceklis data product")
    public void enterCeklisDataProduct(){
        System.out.println("I enter to ceklis data product");
    }
    @Step("I click delete button")
    public void clickDeleteButton(){
        System.out.println("I click delete button");
    }
    @Step("I should see a delete text on page")
    public void seeDeleteTextonPage(){
        System.out.println("I should see a delete text on page");
    }
}
