package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByTagName {
    public static void main(String[] args) {
        String baseUrl = "http://demostore.x-cart.com";
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get(baseUrl);

        driver.findElement(By.tagName("a")).click();
    }
}
