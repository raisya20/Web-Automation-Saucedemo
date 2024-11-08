package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extenTest;
    }

    // TC1 - Possitive case
    @Given("on the login page")
    public void on_the_login_page(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"User on the login page");
    }

    @When("user input username {string} and password {string}")
    public void user_input_username_and_password(String username, String password) {
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        extentTest.log(LogStatus.PASS,"User input username and password");
    }

    @And("user click on login button")
    public void user_click_on_login_button(){
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS,"User click on login button");
    }

    @Then("system go to inventory page")
    public void system_go_to_inventory_page(){
        Assert.assertEquals(loginPage.getInventoryText(),"Products");
        extentTest.log(LogStatus.PASS,"System go to inventory page");
    }

    // TC2 - Negative Case

    @Then("system shows error message {string}")
    public void system_shows_error_message(String errorMessage){
        Assert.assertEquals(loginPage.getLoginErrorMessage(), errorMessage, "Message error not match!");
        extentTest.log(LogStatus.PASS, "System shows error message: " + errorMessage);
    }
}
