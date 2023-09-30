package org.example.saucedemo.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    private WebDriver driver;

    @FindBy(css = ".inventory_list")
    private WebElement inventoryList;

    @FindBy(css = ".select_container")
    private WebElement sortingBtn;

    @FindBy(css = "option[value='lohi']")
    private WebElement lohi;

    @FindBy(css = ".inventory_item_price")
    private WebElement firstPrice;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div")
    private WebElement secondPrice;
    @FindAll(@FindBy(css = ".inventory_item_price"))
    private List<WebElement> inventoryItemPrices;
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuBtn;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutBtn;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addCartBtn;
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement removeCartBtn;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkIn() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
        Assert.assertTrue(inventoryList.isDisplayed());
    }

    public void sortingAsc() {
        sortingBtn.click();
        lohi.click();
    }

    public void checkSortingAsc() {

        for (int i = 0; i < inventoryItemPrices.size() - 1; i++) {
            WebElement firstElement = inventoryItemPrices.get(i);
            WebElement secondElement = inventoryItemPrices.get(i+1);

            String firstPriceText = firstPrice.getText();
            firstPriceText = firstPriceText.replace("$", "");
            double firstValue = Double.parseDouble(firstPriceText);

            String secondPriceText = secondPrice.getText();
            secondPriceText = secondPriceText.replace("$", "");
            double secondValue = Double.parseDouble(secondPriceText);

            Assert.assertTrue(firstValue <= secondValue);
            //System.out.println("el" + i + " " + firstValue + " el" + (i + 1) + " " + secondValue);
        }
    }

    public void logOut() {
        menuBtn.click();
        logoutBtn.click();
    }

    public void setAddCartBtn() {
        addCartBtn.click();
        Assert.assertEquals(removeCartBtn.getText(), "Remove");
    }
}