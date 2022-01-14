package PropertyFile.Class3;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReaderUtility {
    Properties properties;

    public ConfigReaderUtility(){
        try {
            //  loading property file
            properties = new Properties();
            FileInputStream fis = new FileInputStream("src/PropertyFile/Class3/config.property");
            properties.load(fis);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getChromePath(){
        String path = properties.getProperty("chrome");
        return path;
    }

    public String getURL(){
        String path = properties.getProperty("url");
        return path;
    }

    public String getUserName(){
        String path = properties.getProperty("username");
        return path;
    }

    public String getPassword(){
        String path = properties.getProperty("password");
        return path;
    }

}
