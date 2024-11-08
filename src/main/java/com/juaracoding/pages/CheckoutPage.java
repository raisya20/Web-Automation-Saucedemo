package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    private WebDriver driver;

    public CheckoutPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement toCartPage;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement overviewPage;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement successMessage;

    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement backHomeButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement errorMessages;


    public void setToCartPage(){
        Utils.delay(2);
        toCartPage.click();
    }

    public void setCheckoutButton(){
        Utils.delay(2);
        checkoutButton.click();
    }

    public void setFirstName(String username) {
        this.firstName.sendKeys(username);
    }

    public void setLastName(String username) {
        this.lastName.sendKeys(username);
    }

    public void setPostalCode(String username) {
        this.postalCode.sendKeys(username);
    }

    public void setContinueButton() {
        continueButton.click();
    }

    public String setOverviewPage() {
        Utils.delay(2);
        return overviewPage.getText();
    }

    public void setFinishButton () {
        finishButton.click();
    }

    public String setSuccessMessage() {
        Utils.delay(2);
        return successMessage.getText();
    }

    public void setBackHomeButton(){
        Utils.delay(2);
        backHomeButton.click();
    }

    public String setErrorMessages () {
        Utils.delay(2);
        return errorMessages.getText();
    }

}
