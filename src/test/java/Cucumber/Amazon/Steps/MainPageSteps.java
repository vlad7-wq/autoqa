package Cucumber.Amazon.Steps;

import Cucumber.Amazon.Pages.CartPage;
import Cucumber.Amazon.Pages.ItemPage;
import Cucumber.Amazon.Pages.MainPage;
import Cucumber.Amazon.Pages.SearchPage;
import Cucumber.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainPageSteps {
    WebDriver driver = new ChromeDriver();
    MainPage mainPage = new MainPage(driver);
    SearchPage searchPage = new SearchPage(driver);
    ItemPage itemPage = new ItemPage(driver);
    CartPage cartPage = new CartPage(driver);
    @Given("I am on the {string} site")
    public void iAmOnTheSite(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Given("set location to a {string}")
    public void setLocationToA(String country) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        mainPage.clickOnLocationBtn();
        mainPage.dropDownHandle(country);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("i put {string} value into search field and press enter")
    public void iPutValueIntoSearchField(String searchValue) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        mainPage.setSearchField(searchValue);
    }

//    @Then("search result page is displayed items according to our request \\({string})")
//    public void searchResultPageIsDisplayedItemsAccordingToOurRequest(String expResult) {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        boolean testResult = searchPage.getTextOfItem().contains(expResult);
//        Assert.assertTrue(testResult);}

    @When("I click on item from search page")
    public void iClickOnItemFromSearchPage() {
        searchPage.clickOnSearchResult();
    }
//    @Then("I redirected to an item page")
//    public void iRedirectedToAnItemPage() {
//
//    }

    @When("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        itemPage.clickOnAddToCartBtn();

    }

    @Then("item displaying in cart {string}")
    public void itemDisplayingInCart(String title) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cartPage.goToCart();
//        String expTitle = cartPage.getItemName();
//        System.out.println(expTitle);
        WebElement test = driver.findElement(By.xpath("//div[@class='sc-list-item-content']"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
        //driver.navigate().refresh();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean check = test.isDisplayed();
        Assert.assertTrue(check);
    }
}