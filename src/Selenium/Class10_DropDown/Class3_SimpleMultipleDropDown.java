package Selenium.Class10_DropDown;

// If there are multiple drop-downs then need to create same no of select class object and pass the drop-down element

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class3_SimpleMultipleDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/contact-sales/");
        driver.manage().window().maximize();

        Select employee_dropdown = new Select(driver.findElement(By.id("Form_submitForm_NoOfEmployees")));
        employee_dropdown.selectByVisibleText("16 - 20");

        Select country_dropdown = new Select(driver.findElement(By.id("Form_submitForm_Country")));
        country_dropdown.selectByVisibleText("India");

        Thread.sleep(5000);
        driver.close();

    }
}
