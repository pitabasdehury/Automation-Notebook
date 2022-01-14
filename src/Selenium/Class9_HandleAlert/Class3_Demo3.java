package Selenium.Class9_HandleAlert;

//  Authentication pop-up --> asking username & password to login

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3_Demo3 {
    public static void main(String [] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");     /* username & password are entered in url
                                                                                        Ex.     https://username:password@url
                                                                                    */
        driver.manage().window().maximize();
        String pageMessage = driver.findElement(By.cssSelector("p")).getText();
        System.out.println(pageMessage);
    }
}
