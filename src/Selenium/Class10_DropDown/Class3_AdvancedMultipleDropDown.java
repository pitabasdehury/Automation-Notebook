package Selenium.Class10_DropDown;

// If there are multiple drop-downs then create an user-defined method

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Class3_AdvancedMultipleDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/contact-sales/");
        driver.manage().window().maximize();

        WebElement employeeDropDown = driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
        selectDropDown(employeeDropDown,"16 - 20");

        WebElement countryDropDown = driver.findElement(By.id("Form_submitForm_Country"));
        selectDropDown(countryDropDown, "india");

        driver.close();
    }

// User-defined method
    public static void selectDropDown(WebElement element, String value){    // user-defined method taking parameters WebElement and a Stting
        Select dropDown = new Select(element);                              // passing drop-down WebElement in Select class object
        List<WebElement> allOptions =  dropDown.getOptions();               // capturing all the elements by getOptions() method
        for(WebElement option : allOptions){                                // getting each element by for-each loop
            if (option.getText().equalsIgnoreCase(value)){                  // checking the element is equals to the option in the select tag or not
                option.click();                                             // click on the element
            }
        }
    }
}
