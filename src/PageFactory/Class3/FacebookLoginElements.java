package PageFactory.Class3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookLoginElements {

    @CacheLookup
    @FindBy(id="email") WebElement username;                    // should not be declared inside method, should be declared globally

    @FindBy(how = How.ID,using = "pass") WebElement password;   /*  HOW : It is a separate class in selenium
                                                                    ID  : It is a static variable in How
                                                                  using : It is a String variable where you specify the attribute value
                                                                */

    @FindBy(how=How.NAME, using = "login") WebElement logIn_button;

    public void execute(String UserName, String Password){
        username.sendKeys(UserName);
        password.sendKeys(Password);
        logIn_button.click();
    }
}
