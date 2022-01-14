package Selenium.Class15_KeyboardOperation_ActionsClass;

// Performing single key action from keyboard

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Class1_SingleKeyword {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/key_presses");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Actions keyboard = new Actions(driver);
        keyboard.sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);

        keyboard.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);

        keyboard.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(3000);

        keyboard.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(3000);

        keyboard.sendKeys(Keys.SPACE).perform();

    }
}
