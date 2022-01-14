package PropertyFile.Class1;
/*       Property file / Object Repository / Configuration file
    * object repository is a file where all the web objects' keys and values are stored.
*/

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) throws Exception {
        Properties configPorperty = new Properties();   //  To read property file, importing Properties.class file from java.util package by creating object
        FileInputStream fis = new FileInputStream("src/PropertyFile/Class1_SingleKeyword/config.property");   //  giving property file path to FileInputStream
        configPorperty.load(fis);                       //  loading FileInputStream

        //  getProperty()   :   return value of key
        String name = configPorperty.getProperty("Name");      //   Storing in String variable
        System.out.println("My name is "+name);

        System.out.println("mobile no is "+configPorperty.getProperty("Mobile"));
        System.out.println("My email id is "+configPorperty.getProperty("email"));
    }
}
