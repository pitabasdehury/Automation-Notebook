package TestNG;
/*  DataProvider :
 * It is a method that provides data to other method
 * It is a way of parameterizing test case
 * returns a 2-d Object type array
 */
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class7_dataProvider_insideSameClass {

    @DataProvider(name = "loginDataProvider")
    public Object[][] getData(){    // Making 2-D Object array
        Object[][] data = new Object[3][4];

        data[0][0] = "Pitabas";
        data[0][1] = "password1";
        data[0][2] = 966851041;
        data[0][3] = "Mozila";

        data[1][0] = "Kalia";
        data[1][1] = "password2";
        data[1][2] = 966851042;
        data[1][3] = "FireFox";

        data[2][0] = "Manoj";
        data[2][1] = "password3";
        data[2][2] = 966851043;
        data[2][3] = "Opera";
        return data;
    }

    // case 1: in same class
    @Test(dataProvider = "loginDataProvider")       // Meaning is --> the name of the data provider
    public void dataMatrix1(String userName, String password, int mobile, String browser){
        System.out.println(userName+", "+password+" , "+mobile+" , "+browser);
    }

    /* case 2: If your dataprovider method is present in other class
               In that case one more parameter has to be passed --> dataProviderClass = .class file name
     */
    @Test(dataProvider = "loginDataProvider", dataProviderClass = Class7_dataProvider_inOtherClass.class)
    public void dataMatrix2(String userName, String password, int mobile, String browser){
        System.out.println(userName+", "+password+" , "+mobile+" , "+browser);
    }
}
