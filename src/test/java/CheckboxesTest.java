import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class CheckboxesTest {
    public static final String URLCheckboxes = "http://the-internet.herokuapp.com/checkboxes";
    @Test
    public static void checkboxFirst() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get(URLCheckboxes);
        WebElement checkbox1 = browser.findElements(By.cssSelector("[type=checkbox]")).get(0);
        assertFalse(checkbox1.isSelected());
        checkbox1.click();
        assertTrue(checkbox1.isSelected());
        browser.quit();

    }

    @Test
    public static void checkboxSecond() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get(URLCheckboxes);
        WebElement checkbox2 = browser.findElements(By.cssSelector("[type=checkbox]")).get(1);
        assertTrue(checkbox2.isSelected());
        checkbox2.click();
        assertFalse(checkbox2.isSelected());
        browser.quit();

    }
}

