package Rozetka.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage {

    public ItemPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[@class='product__title']")
    WebElement itemName;

    public String getItemName() {
        String getName = itemName.getText();
        return getName.toLowerCase();
    }
}
