package com.jungleGames.mobileAutomation.baseTest;

import com.jungleGames.mobileAutomation.driverInit.TestInitializer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class BaseTestRun extends TestInitializer {

    @Before
    public  void setUp() throws Exception{
        TestInitializer testInit = new TestInitializer();
        testInit.beforeClass();

    }

    @After
    public  void tearDown(){
        TestInitializer testInit = new TestInitializer();
        testInit.afterClass();
    }
}
