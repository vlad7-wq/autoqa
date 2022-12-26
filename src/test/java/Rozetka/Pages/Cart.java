package Rozetka.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

    public Cart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='cart-product__title']")
    WebElement nameCartItem;

    public String getNameCartItem() {
        String getName = nameCartItem.getText();
        return getName.toLowerCase();
    }
}
