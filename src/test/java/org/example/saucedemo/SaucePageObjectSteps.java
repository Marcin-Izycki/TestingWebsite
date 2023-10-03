package org.example.saucedemo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Main;
import org.example.saucedemo.page.CartPage;
import org.example.saucedemo.page.LogInPage;
import org.example.saucedemo.page.MainPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SaucePageObjectSteps {
    private WebDriver driver;

    @Given("an open browser with saucedemo.com")
    public void openMainPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://saucedemo.com/");
    }

    @When("^I enter a valid username$")
    public void enterValidUsername() {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.setUsername();
    }

    @And("I enter a valid password")
    public void enterValidPassword() {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.setPassword();
    }

    @And("I click the login button")
    public void clickLoginButton() {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.pressBtnLogIn();
    }

    @Then("I should be logged in and see product page")
    public void loggedInAndSeeProductPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.checkIn();
    }

    // Sorting Products
    @When("I sort products by price ascending")
    public void sortProductByPriceAscending() {
        MainPage mainPage = new MainPage(driver);
        mainPage.sortingAsc();
    }

    @Then("I should see products sorted correctly")
    public void seeProductsSordedCorrectly() {
        MainPage mainPage = new MainPage(driver);
        mainPage.checkSortingAsc();
    }

    //LogOut
    @When("I click the logout button")
    public void clickTheLogoutButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.logOut();
    }

    @Then("I should be logged out and see the login page")
    public void shouldBeLoggedOutAndSeeTheLoginPage() {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.checkForm();
    }

    //add products to cart
    @When("I select a product to add to the cart")
    public void selectProductToAddToTheCart() {
        MainPage mainPage = new MainPage(driver);
        mainPage.setAddCartBtn();
    }
    @And("I click the cart button")
    public void clickTheCartButton() {
        CartPage cartPage = new CartPage(driver);
        cartPage.openCart();
    }
    @Then("the product should be added to the cart")
    public void productShouldBeAddedToTheCart() {
        CartPage cartPage = new CartPage(driver);
        cartPage.checkCartItemDisplay();
    }
    //delate products to cart
    @And("I remove the product from the cart")
    public void removeTheProductFromTheCart() {
        CartPage cartPage = new CartPage(driver);
        cartPage.removeItemCart();
    }
    @Then("the product should be removed from the cart")
    public void productShouldBeRemovedFromTheCart() {
        CartPage cartPage = new CartPage(driver);
        cartPage.checkCartEmpty();
    }
    //order products
    @Then("I checkout")
    public void iCheckout() {

    }
}
