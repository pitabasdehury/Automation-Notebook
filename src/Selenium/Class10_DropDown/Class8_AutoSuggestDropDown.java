package Selenium.Class10_DropDown;

// how to select element from auto suggest drop-down search-box

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class8_AutoSuggestDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchBox = driver.findElement(By.id("sb_form_q"));      // identify searchBox
        searchBox.sendKeys("selenium");

        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class = 'sa_drw']/li"));  // capture all the elements
        for(WebElement option : allOptions){
            String optionText = option.getText();
            if (optionText.equalsIgnoreCase("selenium hq")){
                option.click();
            }
        }

        driver.close();

    }
}
