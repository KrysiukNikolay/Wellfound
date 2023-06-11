package ui.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static final String CONFIG_FILE_PATH = "src/test/resources/config.properties";
    private Properties properties;

    public ConfigReader() {
        properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream(CONFIG_FILE_PATH)) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getuserEmail() {
        return properties.getProperty("email");
    }

    public String getUserPassword() {
        return properties.getProperty("password");
    }
    public String getStar() {
        return properties.getProperty("star");
    }
}
