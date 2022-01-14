package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Class4_dependsOnMethods {
    public static WebDriver driver;

    @BeforeTest
    public void launchSite(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://mycarhelpline.com");
    }

    @Test(priority = 1, enabled = true)
    public void landingPage(){
        String actualURL = "";
        try {
            actualURL = driver.getTitle();
            System.out.println("Actual URL is : "+actualURL);

        }catch (Exception e){
            System.out.println(e);
        }
        String currentURL = "https://www.mycarhelpline.com/";
        System.out.println("Current URL is : "+currentURL);

        if (currentURL.equals(actualURL)){
            System.out.println("The test case is passed");
        }else {
            System.out.println("The test case is failed");
        }
    }

    @Test(priority = 2, enabled = true, dependsOnMethods = "landingPage")
    public  void calculator(){
        driver.findElement(By.linkText("Calculator")).click();
    }

    @Test(priority = 3, enabled = true, dependsOnMethods = {"landingPage", "calculator"})
    public void Home(){
        driver.findElement(By.linkText("Home")).click();
    }

   // @AfterMethod
  //  public void close(){
   //     driver.close();
   // }
}
