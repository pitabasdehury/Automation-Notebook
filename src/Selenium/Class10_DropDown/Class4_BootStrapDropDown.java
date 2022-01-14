package Selenium.Class10_DropDown;

//

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class4_BootStrapDropDown {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");      // disable notification pop-up


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    //  implicitlyWait works globally


        driver.get("https://www.hdfcbank.com/");
        driver.manage().window().maximize();


        WebElement productType_dropdown = driver.findElement(By.xpath("//div[@class = 'drp1']/div[@class = 'dropdown']"));  // Product-type drop-down
        productType_dropdown.click();

        List<WebElement> allProducts = driver.findElements(By.xpath("//ul[contains(@class, 'dropdown1')]/li"));    // capture all elements in product-type drop-down

        for (WebElement product : allProducts) {                                                                // getting each element by for-each loop
            String productText = product.getText();
            if (productText.equalsIgnoreCase("Accounts")){                                           // checking the element is equals to the option in the select tag or not
                product.click();                                                                                // click on the element
            }
        }

        WebElement selectProduct_dropdown = driver.findElement(By.xpath("//div[@class = 'drp2']/div[@class = 'dropdown']"));
        selectProduct_dropdown.click();

        List<WebElement> allProducts2 = driver.findElements(By.xpath("//div[@class = 'drp2']/div/ul/li"));
        for (WebElement product : allProducts2) {
            String productText = product.getText();
            if (productText.equalsIgnoreCase("savings accounts")){
                product.click();
            }
        }

    }
}
