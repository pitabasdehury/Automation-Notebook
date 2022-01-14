package PropertyFile.Class2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class OpenBrowser {
    public static void main(String[] args) throws Exception {

        WebDriver driver = null;

        //  loading property file
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("src/PropertyFile/Class2/openBrowser.property");
        properties.load(fis);

        //  launch browser
        String browserName = properties.getProperty("browser");
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        //  launch url
        String url = properties.getProperty("url");
        driver.get(url);

        //  facebook login
        String userName = properties.getProperty("username");
        driver.findElement(By.id("email")).sendKeys(userName);

        driver.findElement(By.id("pass")).sendKeys(properties.getProperty("password"));

        driver.findElement(By.name("login")).click();

    }
}
