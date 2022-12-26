package Cucumber.Amazon.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='a-fixed-left-grid-col sc-product-details a-col-right']/ul/li/span/a/span/span/span")
    WebElement itemName;

    public String getItemName() {
        String name = itemName.getText();
        return name;
    }

    public void goToCart() {
        driver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
    }
}
