package com.qa.pages;

import com.qa.locators.AndroidLocatorsPage;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MyProfilePage extends BasePage {
    private final LinkedHashMap<String, String> myProfileFields = new LinkedHashMap<>();

    public MyProfilePage() {
    }

    public MyProfilePage(String name, String lastName, String email, String dateOfBirth, String sex, String country, String ethnicity) {
        this.myProfileFields.put("Name", name);
        this.myProfileFields.put("Last name", lastName);
        this.myProfileFields.put("Email", email);
        this.myProfileFields.put("Date of birth", dateOfBirth);
        this.myProfileFields.put("Sex", sex);
        this.myProfileFields.put("Country", country);
        this.myProfileFields.put("Ethnicity", ethnicity);
    }

    public List<String> getMyProfileFieldsAsList() {
        List<String> values = new ArrayList<>();
        for (Map.Entry<String, String> entry : myProfileFields.entrySet()) {
            values.add(entry.getKey());
            values.add(entry.getValue());
        }
        return values;
    }

    @AndroidFindBy(uiAutomator = AndroidLocatorsPage.MyProfileClass.myProfileTitle_ByUIAutomator)
    @iOSXCUITFindBy(id = "")
    private WebElement myProfileTitle;
    @AndroidFindBy(xpath = AndroidLocatorsPage.MyProfileClass.myProfileAllFields_ByXpath)
    @iOSXCUITFindBy(id = "")
    private List<WebElement> myProfileAllFields;

    @AndroidFindBy(xpath = AndroidLocatorsPage.MyProfileClass.myProfileChangePasswordBtn_ByXpath)
    @iOSXCUITFindBy(id = "")
    private WebElement myProfileChangePasswordBtn;

    @AndroidFindBy(xpath = AndroidLocatorsPage.MyProfileClass.myProfileLogOutBtn_ByXpath)
    @iOSXCUITFindBy(id = "")
    private WebElement myProfileLogOutBtn;

    public boolean myProfileTabDisplayed() {
        waitForVisibility(myProfileTitle);
        return myProfileTitle.isDisplayed();
    }

    public boolean myProfileButtonDisplayed(String button) {
        switch (button) {
            case "Change password" -> {
                waitForVisibility(myProfileChangePasswordBtn);
                return myProfileChangePasswordBtn.isDisplayed();
            }
            case "Log out" -> {
                waitForVisibility(myProfileLogOutBtn);
                return myProfileLogOutBtn.isDisplayed();
            }
        }
        return false;
    }

    public List<String> getMyProfileAllFieldsTexts() {
        List<String> textValues = new ArrayList<>();
        for (WebElement field : myProfileAllFields) {
            textValues.add(field.getText());
            swipe(550, 1000, 550, 900, 500);
        }
        return textValues;
    }
}
