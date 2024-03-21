package com.qa.stepdef;

import com.qa.pages.LoginPage;
import com.qa.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

import static org.apache.commons.lang3.RandomUtils.nextInt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;


public class RegisterStepDef {
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();


    @When("the user fills {string} field with {string} value")
    public void theUserFillsFieldWithValue(String field, String value) {
        registerPage.enterValueForField(field, value);
    }

    @And("the user ticks the checkbox with Terms and Conditions")
    public void theUserTicksTheCheckboxWithTermsAndConditions() throws InterruptedException {
        registerPage.tickTermsAndConditionsCheckbox();
    }

    @Then("the user sees Register button is enabled")
    public void theUserSeesButtonIsEnabled() {
        assertTrue(registerPage.registerBtnEnabled());

    }

    @Then("the user sees Welcome message")
    public void userSeesWelcomeMessage() {
        String actualResult = registerPage.welcomeMessage();
        String expectedResult = "Hello, John!" +
                "Thank you for your interest in our clinical trial." + "At first, we will need you to fill in a short questionnaire in order to determine your eligibility.";
        assertEquals(actualResult, expectedResult);
    }

    @And("all the fields were filled with valid data")
    public void allTheFieldsWereFilledWithValidData() {
        registerPage.enterValueForField("First name", "Test");
        registerPage.enterValueForField("Last name", "Test");
        registerPage.enterValueForField("Email", "test.test@email.com");
        registerPage.enterValueForField("Password", "Password0#");
        registerPage.enterValueForField("Confirm password", "Password0#");
    }

    @When("the user fills First name and Last name fields with numeric characters")
    public void firstNameAndLastNameFieldsInvalid() {
        registerPage.enterValueForField("First name", RandomStringUtils.randomNumeric(1, 10000));
        registerPage.enterValueForField("Last name", RandomStringUtils.randomNumeric(100));
    }

    @Then("the user sees error messages {string} and {string}")
    public void errorMessagesForInvalidFirstAndLastName(String expectedFirstNameMsg, String expectedLastNameMsg) {
        assertEquals(expectedFirstNameMsg, registerPage.invalidFirstNameMsg());
        assertEquals(expectedLastNameMsg, registerPage.invalidLastNameMsg());
    }

    @And("the user sees {string}")
    public void visibilityOfTheElements(String element) {
        assertTrue(registerPage.visibilityOfTheElements(element));
    }
}
