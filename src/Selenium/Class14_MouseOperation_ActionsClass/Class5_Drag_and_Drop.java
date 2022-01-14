package Selenium.Class14_MouseOperation_ActionsClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Class5_Drag_and_Drop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.emicalculator.net");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        Actions mouse = new Actions(driver);

        WebElement homeLoanAmount_Slider = driver.findElement(By.cssSelector("div#loanamountslider>span"));
        WebElement interestRate_Slider = driver.findElement(By.cssSelector(" div#loaninterestslider>span"));
        WebElement loanTenure_Slider = driver.findElement(By.cssSelector("div#loantermslider>span"));

        mouse.dragAndDropBy(homeLoanAmount_Slider,81,0).perform();
        mouse.dragAndDropBy(interestRate_Slider,216,0).perform();
        mouse.dragAndDropBy(loanTenure_Slider,-108,0).perform();

    }
}
