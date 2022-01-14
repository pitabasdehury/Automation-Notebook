package Selenium.Class10_DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class1_HandleDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");

        WebElement dropdownCountry = driver.findElement(By.id("input-country"));    // identify the drop down element
        Select dropdownCountryElement = new Select(dropdownCountry);                // Then the element we need to pass into Select class object

        dropdownCountryElement.selectByVisibleText("Denmark");  // select Denmark
        dropdownCountryElement.selectByValue("59");             // select Dominica
        dropdownCountryElement.selectByIndex(3);             // select Algeria

        Thread.sleep(5000);
        driver.close();

    }
}
