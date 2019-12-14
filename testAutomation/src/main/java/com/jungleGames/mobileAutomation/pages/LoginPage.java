package com.jungleGames.mobileAutomation.pages;

import com.jungleGames.mobileAutomation.common.AppiumActions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends AppiumActions {

    private By login = By.xpath("//*[text()='Login']");
    private By emailRmobileText = By.xpath("//input[@formcontrolname='primaryKey']");
    private By passowrd = By.xpath("//input[@formcontrolname='password']");
    private By loginConfirmBtn = By.xpath("//span[text()='Login']");


    @Step
    public void clickLoginBtn(){
        tap(login);
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
    public void clickLoginSubmit(){
        tap(loginConfirmBtn);
    }
}
