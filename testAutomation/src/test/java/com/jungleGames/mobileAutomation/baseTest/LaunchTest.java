package com.jungleGames.mobileAutomation.baseTest;

import com.jungleGames.mobileAutomation.driverInit.DriverManager;
import com.jungleGames.mobileAutomation.pages.DownloadPage;
import com.jungleGames.mobileAutomation.pages.LoginPage;
import com.jungleGames.mobileAutomation.pages.RegisterPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class LaunchTest extends BaseTestRun {

    @Steps
    RegisterPage registerPage;
    @Steps
    LoginPage loginPage;
    @Steps
    DownloadPage downloadPage;
    public static String email = "testUser" + System.currentTimeMillis() + "@mail.com";
    private String password = "test@1234";

  

    @Test
    public void Test1_Register() {
        DriverManager.getAppiumDriver().get("https://www.howzat.com/");
        registerPage.clickRegisterNow();
        registerPage.enterEmailRMobileData(email);
        registerPage.enterPassword(password);
        registerPage.clickRegisterFreeBtn();
    }

    @Test
    public void Test2_Login() {
        DriverManager.getAppiumDriver().get("https://www.howzat.com/");
        loginPage.clickLoginBtn();
        loginPage.enterEmailRMobileData(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginSubmit();
    }

  

    @Test
    public void Test3_Download() {
        downloadPage.clickDownloadBtn();
        downloadPage.clickOKbtn();
    }

}
