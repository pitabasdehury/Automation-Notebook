package TestNG;
//  invocationCount : If you want to run a particular test for multiple times

import org.testng.annotations.Test;

public class Class16_InvocationCount {

    @Test(invocationCount = 5)      // 10 times this method will be invocated and this test will run 5 times
    public void sum(){
        int a = 2;
        int b = 5;
        int result = a + b;
        System.out.println("Sum is : "+result);
    }
}
