package com.nopcommerce.demo.www.testsuite;

import com.nopcommerce.demo.www.pages.HomePage;
import com.nopcommerce.demo.www.pages.LoginPage;
import com.nopcommerce.demo.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("Asd123@gmail.com");
        loginPage.enterPassword("Asd@123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = loginPage.getLogOutText();
        String actualErrorMessage = loginPage.getLogOutText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
    }
}