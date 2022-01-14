package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Class4_Validation_isDisplayed_isEnabled_isSelected {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Software\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com");

 // isDisplayed --> checks whether a webelement is present / visible or not in a particular webpage and returns a boolean value
        boolean rediff_logo = driver.findElement(By.xpath("//div[@class= 'cell']/child::span[1]")).isDisplayed(); // checking rediff logo
        if (rediff_logo == true){
            System.out.println("Rediff logo is present");
        }else {
            System.out.println("Rediff logo is not present");
        }

 // isEnabled --> check whether a link is enabled or disabled and returns a boolean value
        boolean signin = driver.findElement(By.className("signin")).isEnabled();
        if (signin == true){
            System.out.println("signin link is enabled");
        }else {
            System.out.println("signin link is not enabled");
        }

 // isSelected --> only applicable for check box, drop down and radio button
        driver.findElement(By.className("signin")).click();
        boolean checkBox = driver.findElement(By.id("remember")).isSelected();
        if (checkBox == true){
            System.out.println("check box is selected");
        }else {
            System.out.println("check box is not selected");
        }

 // de-select check box
        driver.findElement(By.id("remember")).click();
        boolean checkBoxSame = driver.findElement(By.id("remember")).isSelected();
        if (checkBoxSame == true){
            System.out.println("check box is selected");
        }else {
            System.out.println("check box is not selected");
        }

    }
}
