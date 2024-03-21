package com.qa.stepdef;

import com.qa.pages.MyProfilePage;
import io.cucumber.java.en.And;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyProfileStepDef {
    MyProfilePage myProfilePage = new MyProfilePage("John", "Doe", "jdoe@gmail.com", "April/19/1976", "Male", "USA", "Caucasian");

    @And("the user sees the following personal information: Name, Last Name, Email, Password, Date of Birth, Gender, Country and Ethnicity")
    public void userSeesPersonalInfo() {
        List<String> expectedMyProfileFields = myProfilePage.getMyProfileFieldsAsList();
        List<String> actualMyProfileFields = myProfilePage.getMyProfileAllFieldsTexts();
        String typeOfMismatch;
        for (int index = 0; index < expectedMyProfileFields.size(); index++) {
            typeOfMismatch = "Value mismatch ::";
            if (index % 2 == 0)
                typeOfMismatch = "Field text mismatch ::";
            assertEquals(typeOfMismatch, expectedMyProfileFields.get(index), actualMyProfileFields.get(index));
        }
    }

    @And("the user sees the {string} button")
    public void userSeesButton(String button) {
        assertTrue(myProfilePage.myProfileButtonDisplayed(button));
    }
}
