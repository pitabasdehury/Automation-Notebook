package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6_AbsoluteXpath_locator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rediff.com/");
        driver.findElement(By.xpath("//*[text() = 'Shopping']")).click();
        driver.findElement(By.xpath("//div[@id = 'prodrelquries']/a[2]")).click();
        driver.findElement(By.xpath("//div[@id = 'catdiv2']/following-sibling::div[1]/div[2]/input[@id = 'lowprice']")).sendKeys("300");
        driver.findElement(By.xpath("//div[@id = 'catdiv2']/following-sibling::div[1]/div[2]/input[@id = 'highprice']")).sendKeys("570");
        driver.findElement(By.xpath("//div[@id = 'catdiv2']/following-sibling::div[1]/div[2]/input[@class = 'pr_rangebtn']")).click();
        driver.findElement(By.xpath("//div[@id = 'topcart' and @class = 'toplinks']/preceding::a")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@id = 'OAS_subsection']/following::div[6]/a[1]")).click();
        driver.findElement(By.linkText("Create a new account")).click();

        driver.findElement(By.xpath("//div[@id = 'wrapper']/descendant::input[1]")).sendKeys("Pitabas Dehury");
        driver.findElement(By.xpath("//div[@id = 'wrapper']/descendant::input[2]")).sendKeys("pitabasdehury");
        driver.findElement(By.xpath("//div[@id = 'wrapper']/descendant::input[3]")).click();
        driver.findElement(By.xpath("//div[@id = 'wrapper']/descendant::input[4]")).sendKeys("Kala@1234");
        driver.findElement(By.xpath("//div[@id = 'wrapper']/descendant::input[5]")).sendKeys("Kala@1234");
        driver.findElement(By.id("mobno")).sendKeys("9668510418");

        driver.findElement(By.xpath("//*[text() = 'Home']")).click();

        Thread.sleep(5000);
        driver.close();






    }
}
