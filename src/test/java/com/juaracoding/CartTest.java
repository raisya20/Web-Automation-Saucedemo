package com.juaracoding;

import com.juaracoding.pages.CartPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartTest {
    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static CartPage cartPage = new CartPage();

    public CartTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extenTest;
    }

    @When("user add a product to the cart")
    public void user_add_a_product_to_the_cart() {
        cartPage.clickAddProductButton();
        extentTest.log(LogStatus.PASS, "User add product to the cart");
    }

    @Then("verify the cart contains one product")
    public void verify_the_cart_contains_one_product() {
        cartPage.getValidAddCart();
        Assert.assertEquals(cartPage.getValidAddCart(), "1");
        extentTest.log(LogStatus.PASS, "Cart contains 1 product");
    }

    @And("user remove the product by clicking the remove button")
    public void user_remove_the_product_by_clicking_the_remove_button() {
        cartPage.clickRemoveProductButton();
        extentTest.log(LogStatus.PASS, "User remove the product by clicking the remove button");
    }

    @Then("verify the cart is empty")
    public void verify_the_cart_is_empty() {
        cartPage.getValidRemoveProduct();
        Assert.assertEquals(cartPage.getValidRemoveProduct(), "Add to cart");
        extentTest.log(LogStatus.PASS, "Verify the cart is empty");
    }

    @When("user add two products to the cart")
    public void user_add_two_products_to_the_cart() {
        cartPage.clickAddProductButton();
        cartPage.addSecondProduct();
        extentTest.log(LogStatus.PASS, "User add 2 products to the cart");
    }

    @Then("verify the cart contains two products")
    public void verify_the_cart_contains_two_products() {
        cartPage.getValidAddCart();
        Assert.assertEquals(cartPage.getValidAddCart(), "2");
        extentTest.log(LogStatus.PASS, "Verify the cart contains 2 products");
    }
}