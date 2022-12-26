package Rozetka.Test;

import Rozetka.Base;
import Rozetka.Pages.Cart;
import Rozetka.Pages.ItemPage;
import Rozetka.Pages.MainPage;
import Rozetka.Pages.SearchResultPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TestAddToCart extends Base {
    private static MainPage mainPage;
    private static SearchResultPage searchResultPage;
    private static ItemPage itemPage;
    private static Cart cart;

    @Before
    public void setUpPage() {
        driver.get("https://rozetka.com.ua");
        driver.manage().window().maximize();

        mainPage = new MainPage(driver);
        searchResultPage = new SearchResultPage(driver);
        itemPage = new ItemPage(driver);
        cart = new Cart(driver);
    }

    @Test
    public void checkTitle() {
        String expTitle = "Інтернет-магазин ROZETKA™: офіційний сайт найпопулярнішого онлайн-гіпермаркету в Україні";
        Assert.assertEquals(mainPage.getTitle(), expTitle);
    }

    @Test
    public void checkSearchField() {
        mainPage.searchField("samsung");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        mainPage.clickOnSearchBtn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        searchResultPage.clickOnCart();
        mainPage.clickOnCartButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
    }

//    @Test
//    public void checkItemInCart() {
//        ;
//    }
}