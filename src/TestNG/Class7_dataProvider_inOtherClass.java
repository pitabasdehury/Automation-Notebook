package TestNG;

// Parameterization test case

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class7_dataProvider_inOtherClass {

    @DataProvider(name = "loginDataProvider")   // returns a 2-d Object type array
    // Making 2-D Object array
    public Object[][] getData(){
        Object[][] data = new Object[3][4];

        data[0][0] = "Rajesh";
        data[0][1] = "password4";
        data[0][2] = 966851045;
        data[0][3] = "xyz";

        data[1][0] = "Bapuni";
        data[1][1] = "password5";
        data[1][2] = 966851046;
        data[1][3] = "pqr";

        data[2][0] = "Deepak";
        data[2][1] = "password6";
        data[2][2] = 966851047;
        data[2][3] = "str";
        return data;
    }
}
