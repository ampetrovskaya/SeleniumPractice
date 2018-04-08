package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;

public class IdXPATHDemo {
    public static void main(String[] args) {
        String baseURL = "http://www.google.com";
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "/Users/eduenv/Documents/Selenium/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

        WebElement searchField = driver.findElement(By.id("lst-ib"));
        searchField.sendKeys("letskodeit");
        searchField.sendKeys(Keys.RETURN);

    }
}
