package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {
    public static void main(String[] args) {
        String baseURL = "http://www.google.com";
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/eduenv/Documents/Selenium/chromedriver");

        driver = new ChromeDriver();

        driver.get(baseURL);




    }
}
