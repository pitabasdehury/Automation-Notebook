package Selenium.Class10_DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class9_AutoCompleteGooglePlaceDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.twoplugs.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement lifePosting_button = driver.findElement(By.xpath("//a[text() = 'Live Posting']"));   // identify Life Posting button
        lifePosting_button.click();

        WebElement placeSearch_button = driver.findElement(By.id("autocomplete"));                  // identify search box
        placeSearch_button.clear();

        placeSearch_button.sendKeys("India");
        String text;

        do {
            placeSearch_button.sendKeys(Keys.ARROW_DOWN);       // Keys.ARROW_DOWN :- press the down arrow key from the keyboard
            text = placeSearch_button.getAttribute("value");        // getting the text of the attribute
            if (text.equals("Indian Wells, CA, USA")){
                placeSearch_button.sendKeys(Keys.ENTER);
                break;
            }
        }while (!text.isEmpty());



    }
}
