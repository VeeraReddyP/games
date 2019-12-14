package com.jungleGames.mobileAutomation.pages;

import com.jungleGames.mobileAutomation.common.AppiumActions;
import com.jungleGames.mobileAutomation.driverInit.DriverManager;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends AppiumActions {

    private By registerNow = By.xpath("//*[text()='Register Now']");
    private By emailRmobileText = By.xpath("//input[@formcontrolname='primaryKey']");
    private By passowrd = By.xpath("//input[@formcontrolname='password']");
    private By registerFreeBtn = By.xpath("//span[contains(text(),'Register for')]");


    @Step
    public void clickRegisterNow(){
        tap(registerNow);
    }

    @Step
    public void enterEmailRMobileData(String data){
        type(emailRmobileText,data);
    }

    @Step
    public void enterPassword(String data){
        type(passowrd,data);
    }

    @Step
    public void clickRegisterFreeBtn(){
        tap(registerFreeBtn);
    }
}
