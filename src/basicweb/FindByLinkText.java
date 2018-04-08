package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FindByLinkText {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://learn.letskodeit.com/";
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "/Users/eduenv/Documents/Selenium/geckodriver");
        driver = new FirefoxDriver();
        driver.get(baseUrl);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("Prac")).click();

    }
}
