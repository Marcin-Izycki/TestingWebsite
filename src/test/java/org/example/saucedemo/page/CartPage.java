package org.example.saucedemo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".shopping_cart_link")
    private WebElement cartIconBtn;
    @FindBy(css = ".cart_item")
    private WebElement cartItem;

    public void openCart() {
        cartIconBtn.click();
    }
    public void checkCartItemDisplay() {
        cartItem.isDisplayed();
    }
}
