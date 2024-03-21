package com.qa.stepdef;

import com.qa.pages.*;
import io.cucumber.java.en.Given;

public class CommonStepDef {
    WelcomePage welcomePage = new WelcomePage();
    LoginPage loginPage = new LoginPage();
    RegisterStepDef registerStepDef = new RegisterStepDef();
    FillInSurveyPage fillInSurveyPage = new FillInSurveyPage();
    FillInSurveyStepDef fillInSurveyStepDef = new FillInSurveyStepDef();

    @Given("the user is on the Home page")
    public void userIsOnHomePage() {
        welcomePage.welcomePageDisplayed();
        loginPage.pressReturningUserBtn();
        loginPage.loginTitleAvailable();
        loginPage.enterLoginCredentials("Email", "test.test@email.com");
        loginPage.enterLoginCredentials("Password", "Password0#");
        loginPage.pressLoginBtn();
        registerStepDef.userSeesWelcomeMessage();
        fillInSurveyPage.pressFillInSurveyBtn();
        fillInSurveyPage.pressConsentAcceptBtn();
        fillInSurveyPage.addSignatureAndAccept();
        fillInSurveyStepDef.userSeesScreeningSurvey();
        fillInSurveyPage.submitSurvey();
    }
}