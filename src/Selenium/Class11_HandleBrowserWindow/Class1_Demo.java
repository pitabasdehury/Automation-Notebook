package Selenium.Class11_HandleBrowserWindow;

// handle multiple tab-windows in a single browser window

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Class1_Demo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();


        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();


        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();    // To handle all new opened window.


        Iterator<String> i1 = allWindows.iterator();
        while (i1.hasNext()) {
            String childWindow = i1.next();
            if (!mainWindow.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);

                WebElement emailBox = driver.findElement(By.name("emailid"));
                emailBox.sendKeys("pitabasdehury@gmail.com");

                WebElement submitButton = driver.findElement(By.name("btnLogin"));
                submitButton.click();

                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
    }
}
