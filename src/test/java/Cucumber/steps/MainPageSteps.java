package Cucumber.steps;

import Rozetka.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Rozetka.Pages.MainPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPageSteps {
    MainPage mainPage;
    WebDriver driver;
    String expUrl = "https://www.amazon.com/";

    @Given("i am on the amazon site")
    public void iAmOnTheAmazonSite() {
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        driver.get(expUrl);
    }
    @When("if a ma on the {string} site")
    public void ifAMaOnTheSite(String mainUrl) {
        Assert.assertEquals(expUrl, mainUrl);
    }

    @Then("title is equals to {string}")
    public void titleIsEqualsTo(String expTitle) {
        Assert.assertEquals(mainPage.getTitle(), expTitle);
    }
}
