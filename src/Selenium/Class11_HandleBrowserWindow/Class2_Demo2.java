package Selenium.Class11_HandleBrowserWindow;

// converting Set collection to ArrayList collection
// handle multiple browser windows in different windows

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Class2_Demo2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get("https://www.naukri.com");
        driver.manage().window().maximize();


        String parentWindow = driver.getWindowHandle();         // capturing parent window id
        System.out.println("Parent window id is : "+parentWindow);


        Set<String> allWindows = driver.getWindowHandles();     // capturing all windows id
        System.out.println("No of windows are : "+allWindows.size());   // Count no of windows
        System.out.println("All windows id are : "+allWindows);


        ArrayList<String> allTabs = new ArrayList<>(allWindows);    // converting Set collection to ArrayList collection

        driver.switchTo().window(allTabs.get(2));                                             // go to third window tab
        System.out.println(driver.getTitle());
        driver.close();

        driver.switchTo().window(allTabs.get(1));                                             // go to second window tab
        System.out.println(driver.getTitle());
        driver.close();

    }
}
