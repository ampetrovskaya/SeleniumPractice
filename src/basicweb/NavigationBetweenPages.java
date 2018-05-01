package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class NavigationBetweenPages {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://learn.letskodeit.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(baseUrl);
        String currentTitle = driver.getTitle();
        System.out.println("Current title is: " + currentTitle);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl);

        String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
        driver.navigate().to(urlToNavigate);

        String currentUrl1 = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl1);


        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navigate Back");
        String currentUrl2 = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl2);

        Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println("Navigate Forward");
        String currentUrl3 = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl3);

        Thread.sleep(2000);
        System.out.println("Navigate Back");
        String currentUrl4 = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl4);

        driver.navigate().refresh();
        System.out.println("Refresh");
        driver.get(currentUrl4);
        System.out.println("Refresh");

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
