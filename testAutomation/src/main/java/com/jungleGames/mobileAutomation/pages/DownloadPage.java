package com.jungleGames.mobileAutomation.pages;

import com.jungleGames.mobileAutomation.common.AppiumActions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DownloadPage extends AppiumActions {

    private By downloadBtn = By.xpath("//*[text()='Download App']");
    private By okBtn = By.id("com.android.chrome:id/button_primary");

    @Step
    public void clickDownloadBtn() {
        tap(downloadBtn);
    }

    @Step
    public void clickOKbtn() {
        tap(okBtn);
    }
}
