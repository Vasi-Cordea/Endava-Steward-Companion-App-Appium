package com.qa.stepdef;

import com.qa.pages.LoginPage;
import com.qa.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();

    RegisterPage registerPage = new RegisterPage();


    @And("the user fills {string} field from Login page with {string} value")
    public void theUserFillsEmailFieldWithValue(String field, String value) {
        loginPage.enterLoginCredentials(field, value);
    }

    @Then("the user is redirected to the {string} page")
    public void theUserIsRedirectedToTheLoginPage(String page) {
        switch (page) {
            case "Login":
                assertTrue(loginPage.loginTitleAvailable());
                break;
            case "Register your account":
                assertTrue(registerPage.registerPageAvailable());
                break;
        }

    }
}
