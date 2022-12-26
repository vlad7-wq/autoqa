package Cucumber.Amazon.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@data-image-index='4']")
    WebElement fourthResultInSearch;
    @FindBy(xpath = "//div[@data-index='3']/div/div/div/div/div/div/div/div/div/h2/a/span")
    WebElement getTextOfFourthItem;

    public void clickOnSearchResult() {
        fourthResultInSearch.click();
    }
    public String getTextOfItem() {
        String itemText = getTextOfFourthItem.getText();
        return itemText.toLowerCase();
    }
}
