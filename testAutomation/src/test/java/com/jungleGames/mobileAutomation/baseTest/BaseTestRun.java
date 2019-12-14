package com.jungleGames.mobileAutomation.baseTest;

import com.jungleGames.mobileAutomation.driverInit.TestInitializer;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTestRun extends TestInitializer {

    @BeforeClass
    public static void setUp() throws Exception{
        TestInitializer testInit = new TestInitializer();
        testInit.beforeClass();

    }

    @AfterClass
    public static void tearDown(){
        TestInitializer testInit = new TestInitializer();
        testInit.afterClass();
    }
}
