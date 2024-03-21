package com.qa.pages;

import com.qa.locators.AndroidLocatorsPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class FillInSurveyPage extends BasePage {

    private AppiumDriver driver;
    @AndroidFindBy(className = AndroidLocatorsPage.FillInSurveyClass.fillInSurveyBtn_ByClassName)
    @iOSXCUITFindBy(id = "")
    private WebElement fillInSurveyBtn;

    @AndroidFindBy(uiAutomator = AndroidLocatorsPage.FillInSurveyClass.consentAcceptBtn_ByUiAutomator)
    @iOSXCUITFindBy(id = "")
    private WebElement consentAcceptBtn;
    @AndroidFindBy(accessibility = AndroidLocatorsPage.FillInSurveyClass.signatureContainerAcceptBtn_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement signatureContainerAcceptBtn;
    @AndroidFindBy(accessibility = AndroidLocatorsPage.FillInSurveyClass.yesIAgreeBtn_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement yesIAgreeBtn;
    @AndroidFindBy(accessibility = AndroidLocatorsPage.FillInSurveyClass.surveyTitle_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement surveyTitle;
    @AndroidFindBy(accessibility = AndroidLocatorsPage.FillInSurveyClass.surveyDescription_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement surveyDescription;

    @AndroidFindBy(accessibility = AndroidLocatorsPage.FillInSurveyClass.surveySubmitButton_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement surveySubmitButton;
    @AndroidFindBy(className = AndroidLocatorsPage.FillInSurveyClass.successOkButton_ByClassName)
    @iOSXCUITFindBy(id = "")
    private WebElement successOkButton;

    public FillInSurveyPage() {
    }

    public void pressFillInSurveyBtn() {
        click(fillInSurveyBtn);
    }

    public void pressConsentAcceptBtn() {
        click(consentAcceptBtn);
    }

    public void addSignatureAndAccept() {
        findAndReturnElementAtBottomOfPage("text", "Tap to sign", 16).click();
        swipe(550, 1000, 550, 900, 1000);
        click(signatureContainerAcceptBtn);
        click(yesIAgreeBtn);
    }

    public void submitSurvey() {
        scrollToEnd(3);
        click(surveySubmitButton);
        click(successOkButton);
    }

    public String surveyMessage() {
        return surveyTitle.getText() + surveyDescription.getText();
    }

}
