package Selenium.Practice;

/* Navigation commands :
                get() -->   launch url
      navigate().to() -->   launch url
    navigate().back() -->   go to back page
    navigate().forward() --> go to forward page
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Navigation {
    public static void main(String [] args){
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com");
        driver.navigate().to("https://www.amazon.com"); // launch url

        driver.navigate().back();       // go to back page
        driver.navigate().forward();    // go to forward page
        driver.navigate().refresh();    // refresh / reload  the current page
    }
}
