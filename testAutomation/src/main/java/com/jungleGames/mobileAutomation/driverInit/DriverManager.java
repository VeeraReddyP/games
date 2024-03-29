package com.jungleGames.mobileAutomation.driverInit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;

public class DriverManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(DriverManager.class);
    private static ThreadLocal<AppiumDriver<MobileElement>> appiumDriver = new ThreadLocal();
    private static ThreadLocal<IOSDriver<MobileElement>> iOSDriver = new ThreadLocal();
    private static ThreadLocal<AndroidDriver<MobileElement>> androidDriver = new ThreadLocal();

    public DriverManager() {
    }

    public static void setAppiumDriver(AppiumDriver<MobileElement> driver) {
        appiumDriver.set(driver);
    }

    public static void setAndroidDriver(AndroidDriver<MobileElement> driver) {
        androidDriver.set(driver);
    }

    public static void setIOSDriver(IOSDriver<MobileElement> driver) {
        iOSDriver.set(driver);
    }

    public static AppiumDriver<MobileElement> getAppiumDriver() {
        return (AppiumDriver)appiumDriver.get();
    }

    public static AndroidDriver<MobileElement> getAndroidDriver() {
        return (AndroidDriver)androidDriver.get();
    }

    public static IOSDriver<MobileElement> getIOSDriver() {
        return (IOSDriver)iOSDriver.get();
    }


    public static void createDriverInstances(String hubUrl, DesiredCapabilities capabilities) throws Exception {
        if(System.getProperty("executeOn").equalsIgnoreCase("android")){
            AppiumDriver<MobileElement> appDriver = new AndroidDriver(new URL(hubUrl), capabilities);
            setAppiumDriver(appDriver);
            setAndroidDriver((AndroidDriver)appDriver);
        } else {
            AppiumDriver<MobileElement> appDriver = new IOSDriver(new URL(hubUrl), capabilities);
            setAppiumDriver(appDriver);
            setIOSDriver((IOSDriver)appDriver);
        }

    }
    public static void stopDriverInstances() {
        if (getAppiumDriver() != null && getAppiumDriver().getSessionId() != null) {
            try {
                getAppiumDriver().quit();
                LOGGER.info("Appium driver quit successfully.");
            } catch (Exception var1) {
                LOGGER.info("Appium driver failed to quit.");
                var1.printStackTrace();
            }
        }

    }
}
