package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyProvider {
    private Properties properties;


    public PropertyProvider(String fileName) {
        this.properties = setPropertiesFile(fileName);
    }

    public Properties setPropertiesFile(String fileName){
        Properties result = new Properties();
        try (InputStream stream = new FileInputStream(fileName)){
            result.load(stream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    public String getProperty (String propertyName){

        return properties.getProperty(propertyName);
    }
}
