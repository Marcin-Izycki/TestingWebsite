package org.example.saucedemo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "checkout")
    private WebElement checkoutBtn;
    @FindBy(id = "first-name")
    private WebElement firstNameField;
    @FindBy(id = "last-name")
    private WebElement lastNameField;
    @FindBy(id = "postal-code")
    private WebElement postalCodeField;
    @FindBy(id = "continue")
    private WebElement continueBtn;

    public void checkIn() {
        checkoutBtn.click();
    }

    public void setValidData() {
        firstNameField.sendKeys("Name");
        lastNameField.sendKeys("Surname");
        postalCodeField.sendKeys("22-222");
    }
    public void setContinueBtn() {
        continueBtn.click();
    }
}
