package Rozetka.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
    @FindBy(xpath = "//ul[@class='catalog-grid ng-star-inserted']/li")
    WebElement searchResultGrid;
    @FindBy(xpath = "//button[@class='buy-button goods-tile__buy-button ng-star-inserted']")
    WebElement addToCart;
    public SearchResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnFirstItem() {
        searchResultGrid.click();
    }
    public void clickOnCart() {
        addToCart.click();
    }
}
