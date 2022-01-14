package Selenium.Class9_HandleAlert;

// Alert window with OK button

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1_Demo1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://rediff.com");
        driver.manage().window().maximize();

        driver.findElement(By.className("signin")).click(); // clicking on signin button
        driver.findElement(By.name("proceed")).click();     // clicking on Go button

        Alert alert = driver.switchTo().alert();    /* This will return an Alert class object reference
                                                        switch to alert window
                                                    */
        String message = alert.getText();           // get the text of the alert window
        System.out.println(message);
        alert.accept();                             // close Alert by using OK button
    }
}
