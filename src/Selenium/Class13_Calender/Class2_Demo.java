package Selenium.Class13_Calender;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class2_Demo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().window().maximize();

        WebElement dob_calender = driver.findElement(By.id("dob"));     // clicking D-O-B
        dob_calender.click();


        WebElement year_dropdown = driver.findElement(By.className("ui-datepicker-year"));      // year drop-down
        Select yearSelect = new Select(year_dropdown);
        List<WebElement> allYears = yearSelect.getOptions();
        for (WebElement year : allYears) {
            String yr = year.getText();
            if (yr.equals("1994")) {
                year.click();
                break;
            }
        }


        WebElement month_dropdown = driver.findElement(By.className("ui-datepicker-month"));    // month drop-down
        Select monthSelect = new Select(month_dropdown);
        List<WebElement> allMonths = monthSelect.getOptions();
        for (WebElement month : allMonths) {
            String mnth = month.getText();
            if (mnth.equalsIgnoreCase("may")) {
                month.click();
                break;
            }
        }

        // Clicking date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//td"));
        for(WebElement date : allDates){
            String dt = date.getText();
            if (dt.equals("19")){
                date.click();
                break;
            }
        }

    }
}
