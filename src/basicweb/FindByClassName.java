package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByClassName {
    public static void main(String[] args) {
        String baseURL = "https://letsrecap.com/blog/";
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get(baseURL);

        driver.findElement(By.className("load-more-btn")).click();
    }
}
