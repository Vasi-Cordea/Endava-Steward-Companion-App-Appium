package com.qa.pages;

import com.qa.locators.AndroidLocatorsPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreenPage extends BasePage {
    @AndroidFindBy(uiAutomator = AndroidLocatorsPage.HomeScreenClass.homeScreenPlaceholder_ByUIAutomator)
    @iOSXCUITFindBy(id = "")
    private WebElement homeScreenPlaceholder;

    @AndroidFindBy(uiAutomator = AndroidLocatorsPage.HomeScreenClass.homeTabBtn_ByUIAutomator)
    @iOSXCUITFindBy(id = "")
    private WebElement homeTabBtn;
    @AndroidFindBy(uiAutomator = AndroidLocatorsPage.HomeScreenClass.trialsTabBtn_ByUIAutomator)
    @iOSXCUITFindBy(id = "")
    private WebElement trialsTabBtn;
    @AndroidFindBy(uiAutomator = AndroidLocatorsPage.HomeScreenClass.myProfileTabBtn_ByUIAutomator)
    @iOSXCUITFindBy(id = "")
    private WebElement myProfileTabBtn;


    public boolean homeScreenTabDisplayed() {
        waitForVisibility(homeScreenPlaceholder);
        return homeScreenPlaceholder.isDisplayed();
    }

    public void clickOnTab(String tab) {
        switch (tab) {
            case "Home" -> click(homeTabBtn);
            case "Trials" -> click(trialsTabBtn);
            case "Profile" -> click(myProfileTabBtn);
        }
    }
}
