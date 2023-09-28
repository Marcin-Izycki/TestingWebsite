package org.example.saucedemo.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    @FindBy(css = ".inventory_list")
    private WebElement inventoryList;

    @FindBy(css = ".select_container")
    private WebElement sortingBtn;

    @FindBy(css = "option[value='lohi']")
    private WebElement lohi;

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
}
