package Cucumber.Amazon.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage {
    WebDriver driver;
    public ItemPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "productTitle")
    WebElement itemName;
    @FindBy(id = "add-to-cart-button")
    WebElement addToCartBtn;

    public String getItemName() {
        String name = itemName.getText();
        return name;
    }
    public void clickOnAddToCartBtn() {
        addToCartBtn.click();
    }
}
