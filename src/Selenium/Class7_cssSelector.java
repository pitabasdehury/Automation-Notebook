package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7_cssSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");

        driver.findElement(By.xpath("//dialog[@id = 'spch-dlg']/following-sibling::form/descendant::input[1]")).sendKeys("biography of Modi");
        driver.findElement(By.xpath("//b[text() = ' in hindi']")).click();
        driver.findElement(By.xpath("//div[@id = 'tophf']/preceding::input[2]")).click();


    }
}
