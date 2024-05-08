package Basefile;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BaseDriver {

    static ConfigLoader configLoader = new ConfigLoader();

    static String platformName = configLoader.getProperty("platformName");
    static String hostURL = configLoader.getProperty("localHost");


    private static AppiumDriver driver = null;

    /**
     * Private constructor to prevent instantiation.
     */
    private BaseDriver()  {}


    public static  AppiumDriver  getDriver() {
        if (driver == null) {
            try {
                DesiredCapabilities capabilities = FetchJsonObject.getCapabilitiesFromFile();
                if (platformName.equalsIgnoreCase("android")) {
                    driver = new AndroidDriver(new URL(hostURL), capabilities);
                } else if (platformName.equalsIgnoreCase("iOS")) {
                    driver = new IOSDriver(new URL(hostURL), capabilities);
                } else {
                    throw new RuntimeException("Unsupported platform: " + capabilities.getCapability("platformName"));
                }
//                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return driver;
    }
}