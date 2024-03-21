package com.qa.stepdef;

import com.qa.pages.AuthenticationPage;
import com.qa.pages.LoginPage;
import com.qa.pages.RegisterPage;
import com.qa.pages.WelcomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class AuthenticationStepDef {

    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    WelcomePage welcomePage = new WelcomePage();
    AuthenticationPage authenticationPage = new AuthenticationPage();

    @And("the user is on the {string} page")
    public void userOnPage(String page) throws InterruptedException {
        switch (page) {
            case "Welcome":
                welcomePage.welcomePageDisplayed();
                break;
            case "Authentication":
                welcomePage.clickNewAccountBtn();
                authenticationPage.authenticationPageDisplayed();
                break;
            case "Register your account":
                welcomePage.clickNewAccountBtn();
                authenticationPage.enterAuthenticationCode(123456);
                registerPage.registerPageDisplayed();
                break;
            case "Login":
                loginPage.loginTitleDisplayed();
                break;
            case "Login after registration":
                welcomePage.clickNewAccountBtn();
                authenticationPage.enterAuthenticationCode(123456);
                registerPage.enterValueForField("First name", "Test");
                registerPage.enterValueForField("Last name", "Test");
                registerPage.enterValueForField("Email", "test.test@email.com");
                registerPage.enterValueForField("Password", "Password0#");
                registerPage.enterValueForField("Confirm password", "Password0#");
                registerPage.tickTermsAndConditionsCheckbox();
                registerPage.pressRegisterBtn();
                loginPage.loginTitleDisplayed();
                break;
        }
    }

    @When("the user enters {int} code")
    public void theUserEntersTheCorrectCode(int code) {
        authenticationPage.enterAuthenticationCode(code);
    }

    @When("the user presses the {string} button")
    public void theUserPressesTheButton(String button) {
        switch (button) {
            case "New Account":
                welcomePage.clickNewAccountBtn();
                break;
            case "Register":
                registerPage.pressRegisterBtn();
                break;
            case "Login":
                loginPage.pressLoginBtn();
                break;
            case "Returning user":
                loginPage.pressReturningUserBtn();
                break;
            case "Authentication code":
                authenticationPage.clickOnAuthenticationCodeBtn();
                break;
        }
    }

    @Then("a digit only keyboard is made available for typing in the code")
    public void aDigitOnlyKeyboardIsMadeAvailableForTypingInTheCode() {
       assertTrue(authenticationPage.keyboardShown());
    }
}
