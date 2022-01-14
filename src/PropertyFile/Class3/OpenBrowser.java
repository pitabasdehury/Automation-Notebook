package PropertyFile.Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
    WebDriver driver;
    ConfigReaderUtility readerUtility;

    @Test(priority = 1)
    public void browserOpenTest(){
        readerUtility = new ConfigReaderUtility();  //  importing reader utility class
        System.setProperty("webdriver.chrome.driver",readerUtility.getChromePath());    //  setting chrome
        driver = new ChromeDriver();
    }

    @Test(priority = 2, dependsOnMethods = "browserOpenTest")
    public void launchURL_Test(){
        driver.get(readerUtility.getURL());
        driver.manage().window().maximize();
    }

    @Test(priority = 3, dependsOnMethods = {"launchURL_Test","browserOpenTest"})
    public void facebookLoginTest(){
        String userName = readerUtility.getUserName();
        driver.findElement(By.id("email")).sendKeys(userName);

        driver.findElement(By.id("pass")).sendKeys(readerUtility.getPassword());

        driver.findElement(By.name("login")).click();

    }


}
