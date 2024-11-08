package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement btnLogin;

    @FindBy(xpath = "//h3[@data-test=\"error\"]")
    private WebElement loginMessageError;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement inventoryText;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement burgerMenu;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement logoutButton;


    // Setter untuk username
    public void setUsername(String username) {
        this.username.sendKeys(username);
    }

    // Setter untuk password
    public void setPassword(String password) {
        this.password.sendKeys(password);
    }


    public void setBtnLogin() {
        btnLogin.click();
    }


    public String getInventoryText() {
        return inventoryText.getText();
    }

    public String getLoginErrorMessage(){
        Utils.delay(2);
        return loginMessageError.getText();
    }

    public void setBurgerMenu() {
        burgerMenu.click();
    }

    public void setLogoutButton() {
        logoutButton.click();
    }

}
