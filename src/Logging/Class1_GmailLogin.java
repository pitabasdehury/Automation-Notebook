package Logging;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Class1_GmailLogin {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("Class1_GmailLogin");
        PropertyConfigurator.configure("log4j.property");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        logger.info("Opening browser");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.opencart.com/index.php?route=account/register");
        logger.info("Opening url");

        driver.findElement(By.cssSelector("input#input-username")).sendKeys("pitabas");
        logger.info("Username entered");
        driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Pitabas");
        logger.info("First name entered");
        driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Dehury");
        logger.info("Last name entered");
        driver.findElement(By.cssSelector("input#input-email")).sendKeys("pitabasdehury@gmail.com");
        logger.info("mail id entered");

        Select country = new Select(driver.findElement(By.id("input-country")));
        country.selectByVisibleText("India");
        logger.info("country selected");

        driver.close();
        logger.info("Page closed");









    }
}
