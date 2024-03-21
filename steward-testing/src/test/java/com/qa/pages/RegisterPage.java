package com.qa.pages;

import com.qa.locators.AndroidLocatorsPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;


public class RegisterPage extends BasePage {
    @AndroidFindBy(xpath = AndroidLocatorsPage.RegisterAccountClass.firstNameField_ByXpath)
    @iOSXCUITFindBy(id = "")
    private WebElement firstNameField;

    @AndroidFindBy(xpath = AndroidLocatorsPage.RegisterAccountClass.firstNameErrMsg_ByXpath)
    @iOSXCUITFindBy(id = "")
    private WebElement firstNameErrMsg;

    @AndroidFindBy(xpath = AndroidLocatorsPage.RegisterAccountClass.errIconFirstName_ByXpath)
    @iOSXCUITFindBy(id = "")
    private WebElement errIconFirstName;

    @AndroidFindBy(xpath = AndroidLocatorsPage.RegisterAccountClass.lastNameField_ByXpath)
    @iOSXCUITFindBy(id = "")
    private WebElement lastNameField;

    @AndroidFindBy(xpath = AndroidLocatorsPage.RegisterAccountClass.lastNameErrMsg_ByXpath)
    @iOSXCUITFindBy(id = "")
    private WebElement lastNameErrMsg;

    @AndroidFindBy(xpath = AndroidLocatorsPage.RegisterAccountClass.errIconLastName_ByXpath)
    @iOSXCUITFindBy(id = "")
    private WebElement errIconLastName;

    @AndroidFindBy(xpath = AndroidLocatorsPage.RegisterAccountClass.emailField_ByXpath)
    @iOSXCUITFindBy(id = "")
    private WebElement emailField;

    @AndroidFindBy(xpath = AndroidLocatorsPage.RegisterAccountClass.passwordField_ByXpath)
    @iOSXCUITFindBy(id = "")
    private WebElement passwordField;

    @AndroidFindBy(xpath = AndroidLocatorsPage.RegisterAccountClass.confirmNameField_ByXpath)
    @iOSXCUITFindBy(id = "")
    private WebElement confirmPasswordField;

    @AndroidFindBy(accessibility = AndroidLocatorsPage.RegisterAccountClass.termsAndConditionsCheckbox_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement termsAndConditionsCheckbox;

    @AndroidFindBy(accessibility = AndroidLocatorsPage.RegisterAccountClass.registerBtn_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement registerBtn;

    @AndroidFindBy(accessibility = AndroidLocatorsPage.LoginClass.greetingTitle_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement greetingTitle;

    @AndroidFindBy(accessibility = AndroidLocatorsPage.LoginClass.welcomeThankYouMsg_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement welcomeThankYouMsg;

    @AndroidFindBy(accessibility = AndroidLocatorsPage.LoginClass.welcomeOpenSurveyMsg_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement welcomeOpenSurveyMsg;

    @AndroidFindBy(accessibility = AndroidLocatorsPage.RegisterAccountClass.registerTitle_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement registerTitle;


    public void enterValueForField(String field, String value) {
        switch (field) {
            case "First name":
                sendKeys(firstNameField, value);
                break;
            case "Last name":
                sendKeys(lastNameField, value);
                break;
            case "Email":
                sendKeys(emailField, value);
                break;
            case "Password":
                sendKeys(passwordField, value);
                break;
            case "Confirm password":
                sendKeys(confirmPasswordField, value);
                break;
        }
    }

    public void tickTermsAndConditionsCheckbox() throws InterruptedException {
        swipe(550, 1700, 550, 800, 1000);
        click(termsAndConditionsCheckbox);
    }

    public void pressRegisterBtn() {
        click(registerBtn);
    }

    public String welcomeMessage() {
        return greetingTitle.getText() + welcomeThankYouMsg.getText() + welcomeOpenSurveyMsg.getText();
    }

    public boolean registerBtnEnabled() {
        return registerBtn.isEnabled();
    }

    public void registerPageDisplayed() {
        waitForVisibility(firstNameField);
        firstNameField.isDisplayed();
    }

    public boolean registerPageAvailable() {
        waitForVisibility(firstNameField);
        return firstNameField.isDisplayed();
    }

    public String invalidFirstNameMsg() {
        click(firstNameField);
        errIconFirstName.isDisplayed();
        return firstNameErrMsg.getText();
    }

    public String invalidLastNameMsg() {
        click(lastNameField);
        errIconLastName.isDisplayed();
        return lastNameErrMsg.getText();
    }

    public boolean visibilityOfTheElements(String element) {
        switch (element) {
            case "First name field" -> {
                waitForVisibility(firstNameField);
                return firstNameField.isDisplayed();
            }
            case "Last name field" -> {
                waitForVisibility(lastNameField);
                return lastNameField.isDisplayed();
            }
            case "Email field" -> {
                waitForVisibility(emailField);
                return emailField.isDisplayed();
            }
            case "Password field" -> {
                waitForVisibility(passwordField);
                return passwordField.isDisplayed();
            }
            case "Confirm password field" -> {
                waitForVisibility(confirmPasswordField);
                return confirmPasswordField.isDisplayed();
            }
            case "Terms and Conditions checkbox" -> {
                swipe(550, 1700, 550, 800, 1000);
                waitForVisibility(termsAndConditionsCheckbox);
                return termsAndConditionsCheckbox.isDisplayed();
            }
            case "Register button" -> {
                waitForVisibility(registerBtn);
                return registerBtn.isDisplayed();
            }
        }
        return false;
    }

}
