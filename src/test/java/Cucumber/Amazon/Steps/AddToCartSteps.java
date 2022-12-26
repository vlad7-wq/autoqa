package Cucumber.Amazon.Steps;

import Cucumber.Amazon.Pages.CartPage;
import Cucumber.Amazon.Pages.ItemPage;
import Cucumber.Amazon.Pages.SearchPage;
import Rozetka.Pages.Cart;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddToCartSteps {
    WebDriver driver = new ChromeDriver();
    SearchPage searchPage = new SearchPage(driver);
    ItemPage itemPage = new ItemPage(driver);
    CartPage cartPage = new CartPage(driver);
//    @When("I click on item from search page")
//    public void iClickOnItemFromSearchPage() {
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        searchPage.clickOnSearchResult();
//    }

//    @Then("I redirected to an item page")
//    public void iRedirectedToAnItemPage() {
//        Assert.assertEquals(searchPage.getTextOfItem(), itemPage.getItemName());
//    }
//
//    @When("I click on add to cart button")
//    public void iClickOnAddToCartButton() {
//        itemPage.clickOnAddToCartBtn();
//    }
//
//    @Then("item displaying in cart")
//    public void itemDisplayingInCart() {
//        cartPage.goToCart();
//        Assert.assertEquals(cartPage.getItemName(), itemPage.getItemName());
//    }
}
