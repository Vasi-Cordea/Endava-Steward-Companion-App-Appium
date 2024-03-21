package com.qa.stepdef;

import com.qa.pages.FillInSurveyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class FillInSurveyStepDef {
    FillInSurveyPage fillInSurveyPage = new FillInSurveyPage();

    @And("the user presses the Fill in survey button")
    public void theUserPressesFillInSurveyBtn() {
        fillInSurveyPage.pressFillInSurveyBtn();
    }

    @And("the user pressed the Accept button for the Informed Consent")
    public void theUserPressesAcceptBtnForInformedConsent() {
        fillInSurveyPage.pressConsentAcceptBtn();
    }

    @And("the user provides the signature and agrees the consent")
    public void theUserProvidesSignatureAndAgreesTheConsent() {
        fillInSurveyPage.addSignatureAndAccept();
    }

    @Then("the user sees the Screening Survey")
    public void userSeesScreeningSurvey() {
        String actualResult = fillInSurveyPage.surveyMessage();
        String expectedResult = "Screening survey" +
                "The following questions apply for symptoms you’ve experienced in the last 2 weeks.";
        assertEquals(actualResult, expectedResult);
    }

    @And("the user completes the survey")
    public void userCompletesTheSurvey() {
        fillInSurveyPage.submitSurvey();
    }
}
