package com.jungleGames.mobileAutomation.driverInit;


import com.jungleGames.mobileAutomation.utils.DesiredCapabilityBuilder;
import com.jungleGames.mobileAutomation.utils.GetScreenshot;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestInitializer.class);


    public AppiumManager appiumManager = new AppiumManager();


    @Rule
    public GetScreenshot getScreenshot = new GetScreenshot();


    public   void beforeClass() throws Exception {
        appiumManager.startAppiumServer();
        DesiredCapabilityBuilder capBuilder = new DesiredCapabilityBuilder();
        capBuilder.buildCapabilities();
        DesiredCapabilities caps = capBuilder.getCapabilities();
        DriverManager.createDriverInstances("http://127.0.0.1:4723/wd/hub",caps);
    }


    public  void afterClass() {
        DriverManager.stopDriverInstances();
        //appiumManager.stopAppiumServer();
        appiumManager.stopAppiumServerFromCmd();
    }
}
