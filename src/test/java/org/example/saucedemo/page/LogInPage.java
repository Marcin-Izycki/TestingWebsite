package org.example.saucedemo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    private WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    private WebElement userNameField;
    @FindBy(id = "password")
    private WebElement passwodField;
    @FindBy(id = "login-button")
    private WebElement loginBtn;
    @FindBy(id = "login_button_container")
    private WebElement loginBtnContainer;

    public void setUsername() {
        userNameField.click();
        userNameField.clear();
        userNameField.sendKeys("standard_user");
    }

    public void setPassword() {
        passwodField.sendKeys("secret_sauce");
    }

    public void pressBtnLogIn() {
        loginBtn.click();
    }

    public void checkForm() {
        loginBtnContainer.isEnabled();
    }
}
