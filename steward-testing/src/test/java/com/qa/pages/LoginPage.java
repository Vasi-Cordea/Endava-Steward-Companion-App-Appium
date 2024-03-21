package com.qa.pages;

import com.qa.locators.AndroidLocatorsPage;
import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    TestUtils utils = new TestUtils();

    @AndroidFindBy(accessibility = AndroidLocatorsPage.LoginClass.loginTitle_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement loginTitle;

    @AndroidFindBy(accessibility = AndroidLocatorsPage.RegisterAccountClass.registerTitle_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement registerTitle;

    @AndroidFindBy(xpath = AndroidLocatorsPage.LoginClass.emailLoginField_ByXpath)
    @iOSXCUITFindBy(id = "")
    private WebElement emailLoginField;

    @AndroidFindBy(xpath = AndroidLocatorsPage.LoginClass.passwordLoginField_ByXpath)
    @iOSXCUITFindBy(id = "")
    private WebElement passwordLoginField;

    @AndroidFindBy(accessibility = AndroidLocatorsPage.LoginClass.loginBtn_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement loginBtn;

    @AndroidFindBy(accessibility = AndroidLocatorsPage.WelcomeClass.returningUserBtn_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement returningUserBtn;


    public LoginPage() {
    }

    public LoginPage enterLoginCredentials(String field, String value) {
        switch (field) {
            case "Email":
                sendKeys(emailLoginField, value, "login with " + value);
                break;
            case "Password":
                sendKeys(passwordLoginField, value, "login with " + value);
                break;
        }
        return this;
    }

    public void loginTitleDisplayed() {
        waitForVisibility(emailLoginField);
        emailLoginField.isDisplayed();
    }

    public boolean loginTitleAvailable() {
        return emailLoginField.isDisplayed();
    }

    public void pressLoginBtn() {
        click(loginBtn);
    }

    public void pressReturningUserBtn() {
        click(returningUserBtn);
    }

}
