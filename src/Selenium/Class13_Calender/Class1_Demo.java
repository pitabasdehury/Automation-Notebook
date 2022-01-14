package Selenium.Class13_Calender;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class1_Demo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get("https://www.redbus.in");
        driver.manage().window().maximize();


        WebElement calender = driver.findElement(By.id("onward_cal"));
        calender.click();


        String mon = "july";
        String yr = "2023";
        String dt = "26";

        while (true) {
            WebElement monthyearElement = driver.findElement(By.className("monthTitle"));     // capture month and year element
            String month_year = monthyearElement.getText();                                 // capture month and year text
            String[] arr = month_year.split(" ");                 // split month-year into two string and store in array
                                                                        // inside split() method, specify some spaces
            String month = arr[0];
            String year = arr[1];

            if (month.equalsIgnoreCase(mon) && year.equals(yr)){            // verifying month and year
                break;
            }
            else {
                WebElement nextButton = driver.findElement(By.xpath("//td[@class = 'next']/button"));
                nextButton.click();                                 // If month and year is not match, then click >
            }
        }

        // Date Selection
        List<WebElement> allDates = driver.findElements(By.xpath("//table[contains(@class, 'rb-monthTable first')]//td[contains(@class, 'day')]"));
        for(WebElement dateElement:allDates){                              // If month and year verify, capture all dates in list and check each date
            String date = dateElement.getText();
            if (date.equals(dt)){
                dateElement.click();
            }
        }




    }
}
