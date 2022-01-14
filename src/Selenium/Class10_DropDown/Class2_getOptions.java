package Selenium.Class10_DropDown;

// If you want to get all the elements inside a drop down list then use getOptions() method & also we can perform some actions

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Class2_getOptions {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");

        WebElement dropdownCountry = driver.findElement(By.id("input-country"));
        Select country = new Select(dropdownCountry);

        List<WebElement> allOptions = country.getOptions();     /* getOptions() methods captures all the elements from the drop down
                                                                   returns list of webelements
                                                                */

        for(WebElement option : allOptions){
            String elementText = option.getText();              // retrieve the text of the element and store in String variable
            if(elementText.equalsIgnoreCase("cuba")){   // putting conditions
                option.click();                                 // clicking the options from drop down
            }
        }

    }
}
