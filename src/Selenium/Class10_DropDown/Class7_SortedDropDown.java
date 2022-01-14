package Selenium.Class10_DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class7_SortedDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.twoplugs.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text() = 'Live Posting']")).click();    // click on Live Posting

        WebElement searchService_dropdown = driver.findElement(By.name("category_id"));   // identify dropdown
        Select searchServiceList = new Select(searchService_dropdown);                  // pass the dropdown in select class object


        ArrayList originalList = new ArrayList<>();
        ArrayList tempList = new ArrayList<>();

        List<WebElement> allOptions = searchServiceList.getOptions();                   // capture all the elements from the dropdown
        for(WebElement option : allOptions){
            String optionText = option.getText();
            originalList.add(optionText);                                               // adding all the elements text to arrayList
            tempList.add(optionText);

            if (optionText.equalsIgnoreCase("automobile")){
                option.click();
            }
        }

        Collections.sort(tempList);                                                     // sorting arrayList

        System.out.println("The original list is : "+originalList);
        System.out.println("The sorted list is : "+tempList);

        if (tempList.equals(originalList)){
            System.out.println("The list is sorted.");
        }
        else {
            System.out.println("The list is not sorted.");
        }





    }
}
