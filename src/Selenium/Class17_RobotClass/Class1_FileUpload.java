package Selenium.Class17_RobotClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Class1_FileUpload {
    public static void main(String[] args) throws AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.id("imagesrc")).click();
//        browse.sendKeys("D:\\Jaga\\commandPrompt\\demo2.java");             //----> uploading by sendKeys() method


//        by Robot Class
//        Robot robot = new Robot();
//
//        browse.click();                                             // clicking on browse button
//        robot.setAutoDelay(2000);
//
//        String filePath = "D:\\Jaga\\commandPrompt\\demo2.java";    // Storing file name in a string variable
//        StringSelection stringSelection = new StringSelection(filePath);    /* StringSelection class copies the String file name and convert it to the transferrable plain text format.
//                                                                               Here it is used to transfer the plain text to the new window which we technically call it as clipboard in Java AWT.
//                                                                            */
//
//        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//        clipboard.setContents(stringSelection, null);
//        robot.setAutoDelay(2000);
//
//
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyRelease(KeyEvent.VK_V);
//
//        robot.setAutoDelay(2000);
//
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);





    }
}
