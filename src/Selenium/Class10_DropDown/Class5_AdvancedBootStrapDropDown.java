package Selenium.Class10_DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class5_AdvancedBootStrapDropDown {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    //  implicitlyWait works globally


        driver.get("https://www.hdfcbank.com/");
        driver.manage().window().maximize();


        WebElement productType_dropdown = driver.findElement(By.xpath("//div[@class = 'drp1']/div[@class = 'dropdown']"));  // Product-type drop-down
        productType_dropdown.click();
        List<WebElement> allProducts = driver.findElements(By.xpath("//ul[contains(@class, 'dropdown1')]/li"));    // capture all elements in product-type drop-down
        selectDropdown(allProducts,"accounts");


        WebElement selectProduct_dropdown = driver.findElement(By.xpath("//div[@class = 'drp2']/div[@class = 'dropdown']"));
        selectProduct_dropdown.click();
        List<WebElement> allProducts2 = driver.findElements(By.xpath("//div[@class = 'drp2']/div/ul/li"));
        selectDropdown(allProducts2,"savings accounts");


    }

    public static void selectDropdown(List<WebElement> options, String value){
        for (WebElement product : options) {
            String productText = product.getText();
            if (productText.equalsIgnoreCase(value)){
                product.click();
            }
        }

    }
}
