package Selenium3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Chase_Bank {
    @Test
    public void test(){
        // WebDriver driver = null;
        WebDriver  driver = new ChromeDriver();
        driver.get(" https://www.chase.com/"); // for getting the chase bank homepage
        driver.manage().deleteAllCookies(); // for deleting all the cookies before landing the page

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); // page loading time
        // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize(); // for maximizing the chase home page



    }
}
