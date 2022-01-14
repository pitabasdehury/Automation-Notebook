package PageFactory.Class1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login {

    @FindBy(id="email") WebElement username;                    // should not be declared inside method, should be declared globally
    @FindBy(how = How.ID,using = "pass") WebElement password;   /*  HOW : It is a separate class in selenium
                                                                    ID  : It is a static variable in How
                                                                  using : It is a String variable where you specify the attribute value
                                                                */
    @FindBy(how=How.NAME, using = "login") WebElement logIn_button;


    public static void main(String[] args) throws Exception {

        //  launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);

        //  launch url
        driver.get("https://www.facebook.com");

        /*  initElements()  : It is used to instantiate the page object(web element)
                              Syntax --> PageFactory.initElements(Driver_object_reference_name, object_page_name.class)
                              This Syntax will return object_page object of the .class file
                              After that webElements can be accessed through object_reference of the object_page
        */

        Facebook_login facebook_login = PageFactory.initElements(driver,Facebook_login.class);
        facebook_login.username.sendKeys("9668510418");
        facebook_login.password.sendKeys("Kala@1234");
        facebook_login.logIn_button.click();

    }
}
