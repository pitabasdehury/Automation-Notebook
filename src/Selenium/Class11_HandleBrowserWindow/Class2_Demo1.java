package Selenium.Class11_HandleBrowserWindow;

// handle multiple browser windows in different windows

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Class2_Demo1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get("https://www.naukri.com");
        driver.manage().window().maximize();


        String parentWindow = driver.getWindowHandle();         // capturing parent window id
        System.out.println("Parent window id is : "+parentWindow);
        System.out.println();


        Set<String> allWindows = driver.getWindowHandles();     // capturing all windows id
        System.out.println("No of windows are : "+allWindows.size());
        System.out.println("All windows id are : "+allWindows);
        System.out.println();


        for(String childWindow : allWindows){                                    // getting all windows id one-by-one
            System.out.println("Current child window id is : "+childWindow);        // capturing child window id

            if (!parentWindow.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);          // switching to child window
                driver.close();
                System.out.println("Closing the window");
                System.out.println();
            }
        }


    }
}
