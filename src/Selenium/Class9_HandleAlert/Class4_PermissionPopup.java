package Selenium.Class9_HandleAlert;

/* Handling Permission Pop-ups
    1. Create object of ChromeOptions class
    2. Through the ChromeOptions class object reference, call addArguements("string-value") method
    3. pass the object reference in the ChromeDriver object
*/


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Class4_PermissionPopup {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();    // creating object of ChromeOptions class
        options.addArguments("disable-notifications");  // this will disable the notifications
//        options.addArguments("disable-geolocation");    --> this will disable location
//        options.addArguments("disable-media-stream");     --> this will disable camera and microphone


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.hdfcbank.com/");
        driver.manage().window().maximize();

        driver.close();
    }
}
