package PageFactory.Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FacebookLoginPage {

    @Test
    public void facebookLoginTest(){

       WebDriver driver = BrowserFactory.LaunchBrowser("chrome","https://www.facebook.com");   //  launch browser and url

       FacebookLoginElements facebookLoginElements =  PageFactory.initElements(driver,FacebookLoginElements.class);

       facebookLoginElements.username.sendKeys("9668510418");
       facebookLoginElements.password.sendKeys("Kala@1234");
       facebookLoginElements.logIn_button.click();
    }
}
