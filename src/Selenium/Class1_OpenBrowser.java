package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1_OpenBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Software\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // dynamic dispatch concept
        driver.get("https://www.google.com");   // giving url to open
        driver.manage().window().maximize();    // to maximize window
        driver.quit();

    }
}
