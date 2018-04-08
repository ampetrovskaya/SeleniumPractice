package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BasicActions {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://learn.letskodeit.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test(){
        driver.get(baseUrl);

        driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
        System.out.println("Clicked on Login");

        driver.findElement(By.id("user_email")).clear();
        System.out.println("Clearing email field");

        driver.findElement(By.id("user_email")).sendKeys("test@email.com");
        System.out.println("Sending some keys to email field");

        driver.findElement(By.id("user_password")).sendKeys("test");
        System.out.println("Sending some keys to password field");

        driver.findElement(By.id("user_email")).clear();
        System.out.println("Clearing email field");

    }

    @After
    public void tearDown() throws Exception {
//        driver.quit();
    }

}
