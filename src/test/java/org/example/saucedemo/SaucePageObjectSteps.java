package org.example.saucedemo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        MainPage mainPage = new MainPage(driver);
        mainPage.setUsername();
        System.out.println("test");
    }

    @And("I enter a valid password")
    public void enterValidPassword() {
        MainPage mainPage = new MainPage(driver);
        mainPage.setPassword();
    }

    @And("I click the login button")
    public void clickLoginButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.pressBtnLogIn();
    }

    @Then("I should be logged in and see product page")
    public void loggedInAndSeeProductPage() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }

}
