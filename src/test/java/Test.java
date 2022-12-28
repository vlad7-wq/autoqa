import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    WebDriver driver;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }
    @org.junit.Test
    public void test() {
        String title = driver.getTitle();
        boolean testResult = title.contains("Google");
        Assert.assertTrue(testResult);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}