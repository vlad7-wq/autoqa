package Cucumber.Amazon.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MainPage {
    WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nav-global-location-slot")
    WebElement locationBtn;
    @FindBy(id = "GLUXCountryList_178")
    WebElement poland;
    @FindBy(id = "GLUXCountryList")
    WebElement dropDown;
    @FindBy(id = "//span[@class='a-declarative']")
    WebElement submitBtn;
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchField;

    public void setSearchField(String searchValue) {
        searchField.sendKeys(searchValue + Keys.ENTER);
    }

    public void clickOnLocationBtn() {
        locationBtn.click();
    }

    public void dropDownHandle(String country) {
        Select select = new Select(dropDown);
        select.selectByVisibleText(country);
        //poland.click();
    }

    public void clickSubmit() {
        submitBtn.click();
    }
}
