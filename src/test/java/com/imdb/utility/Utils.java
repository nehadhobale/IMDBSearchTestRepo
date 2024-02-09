package com.imdb.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {
    public static Properties getProperties(String name){
        try {
            File f1 = new File("src//test/resources//"+name+"Data.properties");
            FileInputStream fs = new FileInputStream(f1);

            Properties properties = new Properties();
            properties.load(fs);
            return properties;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
