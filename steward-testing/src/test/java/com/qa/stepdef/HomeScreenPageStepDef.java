package com.qa.stepdef;

import com.qa.pages.HomeScreenPage;
import com.qa.pages.MyProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class HomeScreenPageStepDef {
    HomeScreenPage homeScreenPage = new HomeScreenPage();
    MyProfilePage myProfilePage = new MyProfilePage();

    @Given("the user is on the {string} tab from the Home page")
    public void userOnTab(String tab) {
        switch (tab) {
            case "Home":
                assertTrue(homeScreenPage.homeScreenTabDisplayed());
                break;
            case "Trials":
                break;
            case "My profile":
                assertTrue(myProfilePage.myProfileTabDisplayed());
                break;
        }
    }

    @When("the user clicks on the {string} button")
    public void userClicksOnTab(String tab) {
        homeScreenPage.clickOnTab(tab);
    }
}
