package com.juaracoding;

import com.juaracoding.pages.CheckoutPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static CheckoutPage checkoutPage = new CheckoutPage();

    public CheckoutTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extenTest;
    }


    @When("user go to cart page")
    public void user_go_to_cart_page () {
        checkoutPage.setToCartPage();
        extentTest.log(LogStatus.PASS,"user on the cart page");
    }

    @When("user click on the checkout button")
    public void user_click_on_the_checkout_button () {
        checkoutPage.setCheckoutButton();
        extentTest.log(LogStatus.PASS,"user click on the checkout button");
    }

    @And("user inputs first name {string}, last name {string}, and postal code {string}")
    public void user_inputs_fist_name_last_name_and_postal_code (String firstName, String lastName, String postalCode) {
        checkoutPage.setFirstName(firstName);
        checkoutPage.setLastName(lastName);
        checkoutPage.setPostalCode(postalCode);
        extentTest.log(LogStatus.PASS,"user inputs first name, last name, and postal code");
    }

    @And("user click on the continue button")
    public void user_click_on_the_continue_button() {
        checkoutPage.setContinueButton();
        extentTest.log(LogStatus.PASS, "user click on the continue button");
    }

    @Then("system navigates to the {string} page")
    public void system_navigates_to_the_page(String overviewMessage) {
        Assert.assertEquals(checkoutPage.setOverviewPage(), overviewMessage, "Checkout: Overview");
        extentTest.log(LogStatus.PASS, "System navigate to the overview page: " + overviewMessage);
    }

    @When("user click on finish button")
    public void user_click_on_finish_button() {
        checkoutPage.setFinishButton();
        extentTest.log(LogStatus.PASS, "user click on finish button");
    }

    @Then("system shows a success message {string}")
    public void system_shows_a_success_message(String successMessage) {
        Assert.assertEquals(checkoutPage.setSuccessMessage(), successMessage, "Thank you for your order!");
        extentTest.log(LogStatus.PASS, "system shows a success message" +successMessage);
    }

    //@Given("user is on inventory page")
    //public void user_is_on_inventory_page () {
      //  checkoutPage.setBackHomeButton();
        //extentTest.log(LogStatus.PASS, "user is on inventory page");
    //}

    @When("user leaves the first name, last name, or postal code empty")
    public void user_leaves_the_first_name_last_name_or_postal_code_empty () {
        extentTest.log(LogStatus.PASS, "user leaves the first name, last name, or postal code empty");
    }

    @Then("system shows error checkout message {string}")
    public void system_shows_error_checkout_message (String errorMessages) {
        Assert.assertEquals(checkoutPage.setErrorMessages(), errorMessages, "Error: First Name is required");
        extentTest.log(LogStatus.PASS, "System shows error checkout message" +errorMessages);
    }



}