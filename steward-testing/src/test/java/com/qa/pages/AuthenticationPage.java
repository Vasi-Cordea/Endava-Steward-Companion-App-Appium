package com.qa.pages;

import com.qa.locators.AndroidLocatorsPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class AuthenticationPage extends BasePage {

    @AndroidFindBy(className = AndroidLocatorsPage.AuthenticationClass.authenticationCode_ByClassName)
    @iOSXCUITFindBy(id = "")
    private WebElement authenticationCodeBtn;

    @AndroidFindBy(accessibility = AndroidLocatorsPage.AuthenticationClass.authenticationTitle_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement authenticationTitle;

    public void clickOnAuthenticationCodeBtn() {
        click(authenticationCodeBtn);
    }

    public void enterAuthenticationCode(int code) {
        click(authenticationCodeBtn);
        sendKeys(authenticationCodeBtn, String.valueOf(code));
        clickDoneBtnFromAndroidKeyboard();
    }

    public void authenticationPageDisplayed() {
        waitForVisibility(authenticationCodeBtn);
        authenticationCodeBtn.isDisplayed();
    }
}
