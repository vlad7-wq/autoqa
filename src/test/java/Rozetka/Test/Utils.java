package Rozetka.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {
    WebDriver driver;

    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    public void setWait(String route) {
    WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(3))
            .until(driver -> driver.findElement(By.xpath(route)));
    }
}
