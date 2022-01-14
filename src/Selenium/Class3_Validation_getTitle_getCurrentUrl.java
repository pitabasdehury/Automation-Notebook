package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class validation{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Software\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.gmail.com");

        // Validating title
        String ExpectedTitle = "Gmail";
        System.out.println("Expected title is : "+ExpectedTitle);
        String ActualTitle = driver.getTitle();     // Returns title of the page
        System.out.println("Actual title is : "+ActualTitle);
        boolean d1 = ExpectedTitle.equals(ActualTitle);
        Check.conditional(d1);

        System.out.println();

        // Validating currentURL
        String ExpectedUrl = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
        System.out.println("Expected Url is : "+ExpectedUrl);
        String ActualUrl = driver.getCurrentUrl();      //  Returns current url of the page
        System.out.println("Actual Url is : "+ExpectedUrl);
        boolean d2 = ExpectedUrl.equals(ActualUrl);
        Check.conditional(d2);

        driver.close();
    }
}

class Check {

    static void conditional(boolean d){
            if (d){
                System.out.println("Test case pass.");
            }else {
                System.out.println("Test case fail.");
            }
    }
}