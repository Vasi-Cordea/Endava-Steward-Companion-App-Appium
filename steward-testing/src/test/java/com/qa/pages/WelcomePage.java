package com.qa.pages;

import com.qa.locators.AndroidLocatorsPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class WelcomePage extends BasePage {
    @AndroidFindBy(accessibility = AndroidLocatorsPage.WelcomeClass.newAccountBtn_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement newAccountBtn;

    @AndroidFindBy(accessibility = AndroidLocatorsPage.WelcomeClass.returningUserBtn_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement returningUserBtn;

    @AndroidFindBy(accessibility = AndroidLocatorsPage.WelcomeClass.welcomeTitle_ByAccessibilityId)
    @iOSXCUITFindBy(id = "")
    private WebElement welcomeTitle;

    public void clickNewAccountBtn() {
        click(newAccountBtn);
    }

    public void welcomePageDisplayed() {
        waitForVisibility(welcomeTitle);
        welcomeTitle.isDisplayed();
    }
}
