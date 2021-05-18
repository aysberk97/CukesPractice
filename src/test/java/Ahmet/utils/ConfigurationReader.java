package Ahmet.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    public static Properties properties = new Properties();
    static {
        String ConfPath = "Configurations.properties";

        try {
            FileInputStream fileInputStream = new FileInputStream(ConfPath);
            properties.load(fileInputStream);
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("Properties file has not found");
        }
    }
    public static String getProperties(String key){
        return properties.getProperty(key);
    }
}






