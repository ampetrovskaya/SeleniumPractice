package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class IdNameDemo {
    public static void main(String[] args) throws InterruptedException {
        String baseURL = "https://www.google.com.ua";
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "/Users/eduenv/Documents/Selenium/geckodriver");
        driver = new FirefoxDriver();
        driver.get(baseURL);

        WebElement searchField = driver.findElement(By.id("lst-ib"));
        searchField.sendKeys("letskodeit");
        searchField.sendKeys(Keys.RETURN);

        Thread.sleep(3000);
        WebElement searchField1 = driver.findElement(By.id("lst-ib"));
        searchField1.clear();
        searchField1.sendKeys("Happy Easter");
        driver.findElement(By.name("btnG")).click();

    }
}

