package Rozetka.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    WebDriver driver;
    String expTitle = "Інтернет-магазин ROZETKA™: офіційний сайт найпопулярнішого онлайн-гіпермаркету в Україні";
    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "search")
    WebElement searchField;
    @FindBy(xpath = "//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']")
    WebElement submitSearchBtn;
    @FindBy(xpath = "//li[@class='header-actions__item header-actions__item--cart']")
    WebElement cartButton;

    public String getTitle() {
        return driver.getTitle();
    }

    public void searchField(String value) {
        searchField.sendKeys(value);
    }
    public void clickOnSearchBtn() {
        submitSearchBtn.click();
    }

    public void clickOnCartButton() {
        cartButton.click();
    }
}
