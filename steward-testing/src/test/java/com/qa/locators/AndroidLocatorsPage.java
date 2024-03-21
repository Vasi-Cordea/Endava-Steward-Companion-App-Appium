package com.qa.locators;

public class AndroidLocatorsPage {

    public static class WelcomeClass {
        public static final String newAccountBtn_ByAccessibilityId = "Welcome Register Button";
        public static final String returningUserBtn_ByAccessibilityId = "Welcome Login Button";
        public static final String welcomeTitle_ByAccessibilityId = "Welcome Title";
    }

    public static class AuthenticationClass {
        public static final String authenticationCodeBtn_ByAccessibilityId = "Digit Code Input";
        public static final String authenticationCode_ByClassName = "android.widget.EditText";
        public static final String authenticationTitle_ByAccessibilityId = "Authentication Title";
    }

    public static class RegisterAccountClass {
        public static final String registerTitle_ByAccessibilityId = "Register Title";
        public static final String firstNameField_ByAccessibilityId = "Register First Name Input";
        public static final String firstNameField_ByXpath = "//android.widget.EditText[1]";
        public static final String firstNameErrMsg_ByXpath = "//android.widget.TextView[3]";
        public static final String errIconFirstName_ByXpath = "//android.widget.ImageView[@content-desc='checked'][1]";
        public static final String lastNameField_ByAccessibilityId = "Register Last Name Input";
        public static final String lastNameField_ByXpath = "//android.widget.EditText[2]";
        public static final String lastNameErrMsg_ByXpath = "//android.widget.TextView[5]";
        public static final String errIconLastName_ByXpath = "(//android.widget.ImageView[@content-desc='checked'])[2]";
        public static final String emailField_ByAccessibilityId = "Register Email Input";
        public static final String emailField_ByXpath = "//android.widget.EditText[3]";
        public static final String passwordField_ByAccessibilityId = "Password Input";
        public static final String passwordField_ByXpath = "//android.widget.EditText[4]";
        public static final String confirmPasswordField_ByAccessibilityId = "Register Confirm Password Input";
        public static final String confirmNameField_ByXpath = "//android.widget.EditText[5]";
        public static final String termsAndConditionsCheckbox_ByAccessibilityId = "Register CheckBox";
        public static final String registerBtn_ByAccessibilityId = "Register Button";
    }

    public static class LoginClass {
        public static final String loginTitle_ByAccessibilityId = "Login Title";
        public static final String emailLoginField_ByXpath = "//android.widget.EditText[1]";
        public static final String passwordLoginField_ByXpath = "//android.widget.EditText[2]";
        public static final String loginBtn_ByAccessibilityId = "Login Button";
        public static final String greetingTitle_ByAccessibilityId = "Greeting Title";
        public static final String welcomeThankYouMsg_ByAccessibilityId = "Welcome Thank you";
        public static final String welcomeOpenSurveyMsg_ByAccessibilityId = "Welcome Open Survey";
    }

    public static class FillInSurveyClass {
        public static final String fillInSurveyBtn_ByClassName = "android.widget.Button";
        public static final String consentAcceptBtn_ByUiAutomator = "new UiSelector().resourceId(\"hs-eu-confirmation-button\")";
        public static final String consentTapToSign_ByUiAutomator = "new UiSelector().text(\"Tap to sign\")";
        public static final String signatureContainerAcceptBtn_ByAccessibilityId = "Cancel Button";
        public static final String yesIAgreeBtn_ByAccessibilityId = "Yes Button";
        public static final String surveyTitle_ByAccessibilityId = "Survey Title";
        public static final String surveyDescription_ByAccessibilityId = "Survey Description";
        public static final String surveySubmitButton_ByAccessibilityId = "submit button";
        public static final String successOkButton_ByClassName = "android.widget.Button";
    }

    public static class HomeScreenClass {
        public static final String homeScreenPlaceholder_ByUIAutomator = "new UiSelector().text(\"Home screen\")";
        public static final String trialsTabBtn_ByUIAutomator = "new UiSelector().text(\"Trials\")";
        public static final String homeTabBtn_ByUIAutomator = "new UiSelector().text(\"Home\")";
        public static final String myProfileTabBtn_ByUIAutomator = "new UiSelector().text(\"Profile\")";
    }

    public static class MyProfileClass {
        public static final String myProfileTitle_ByUIAutomator = "new UiSelector().text(\"My profile\")";
        public static final String myProfileAllFields_ByXpath = "//android.widget.ScrollView/android.widget.TextView";
        public static final String myProfileChangePasswordBtn_ByXpath = "//android.widget.ScrollView/android.widget.TextView";
        public static final String myProfileLogOutBtn_ByXpath = "//android.widget.ScrollView/android.widget.TextView";
    }

}
