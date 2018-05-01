package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ElementState {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception{
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(baseUrl);
    }

    @Test
    public void test(){
        WebElement e1 = driver.findElement(By.id("lst-ib"));
        System.out.println("Is E1 Enabled?: " + e1.isEnabled());
        e1.sendKeys("life in Copenhagen");

    }

    @After
    public void tearDown() throws Exception{
        Thread.sleep(3000);
        driver.quit();
    }

}
