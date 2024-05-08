package Basefile;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

public class FetchJsonObject {

    static ConfigLoader configLoader = new ConfigLoader();

    public static  JsonNode getPlatformNode() {
        try {
            String filePath = configLoader.getProperty("capabilitiesPath");
            String platformName = configLoader.getProperty("platformName");

            File file = new File(filePath);
            ObjectMapper objectMapper = new ObjectMapper();

            // Read the root node of the JSON file
            JsonNode rootNode = objectMapper.readTree(file);

            // Retrieve the node specific to the platform
            return rootNode.path(platformName);

        } catch (IOException e) {
            e.printStackTrace();
            return null; // Return null in case of an error
        }
    }

    public static DesiredCapabilities getCapabilitiesFromFile() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", getPlatformNode().path("platformName").asText());
        capabilities.setCapability("deviceName", getPlatformNode().path("deviceName").asText());
        capabilities.setCapability("appActivity", getPlatformNode().path("appActivity").asText());
        capabilities.setCapability("appPackage", getPlatformNode().path("appPackage").asText());
        capabilities.setCapability("bundleID", getPlatformNode().path("bundleID").asText());
        capabilities.setCapability("automationName", getPlatformNode().path("automationName").asText());
        capabilities.setCapability("platformVersion", getPlatformNode().path("platformVersion").asText());
        capabilities.setCapability("noReset", getPlatformNode().path("noReset").asText("false"));

        return capabilities;
    }
}