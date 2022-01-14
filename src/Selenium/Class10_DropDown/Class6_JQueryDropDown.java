package Selenium.Class10_DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class6_JQueryDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.manage().window().maximize();

        WebElement multiSelection_DropDown = driver.findElement(By.id("justAnInputBox"));
        multiSelection_DropDown.click();

        List<WebElement> allOptions = driver.findElements(By.xpath("//span[contains(@class, 'comboTreeItemTitle')]"));
        System.out.println(allOptions.size());

        /*for(WebElement item : allOptions){
            if (item.getText().equalsIgnoreCase("choice 2")){
                item.click();
            }
        }
        */

         selectOptions(multiSelection_DropDown, allOptions, "choice 2", "choice 5", "choice 6 2 1");



    }
    /* Create User-defined method
            the main goal is checking the value entered by user is equal to the item element or not.
    */
    public static void selectOptions(WebElement dropdown, List<WebElement> elements, String... value){      /* Parameters
                                                                                                                dropdown : form which dropdown you want to select
                                                                                                                elements : specify the elements list of the dropdown
                                                                                                                value    : specify which option you want to click
                                                                                                                            so creating String array as user can specify multiple options
                                                                                                            */

        if (!value[0].equalsIgnoreCase("all")){         // First : checking user entered one value option or more. If there is one value option then this loop will run
            for(WebElement item : elements){                      // Second : getting each element from the dropdown list elements
                String itemText = item.getText();
                for(String val : value){                          // Third  : getting each value option from the value array
                    if (itemText.equalsIgnoreCase(val)){          // Forth  : checking the item from the elements is equal to value entered by user
                        item.click();
                    }
                }
            }
        }
        else{
            for(WebElement item : elements){
                item.click();
            }
        }

    }
}
