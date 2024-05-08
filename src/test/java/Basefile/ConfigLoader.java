package Basefile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private final Properties properties;

    /**
     * Constructor that loads the properties file.
     */
    public ConfigLoader() {
        properties = new Properties();
        try (FileInputStream input = new FileInputStream("src/test/resources/config.properties")) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Retrieves a property value by key.
     *
     * @param key The key for the property.
     * @return The value of the specified property, null if not found.
     */
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
