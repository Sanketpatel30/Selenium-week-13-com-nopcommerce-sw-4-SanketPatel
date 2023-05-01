package com.nopcommerce.demo.www.testsuite;

import com.nopcommerce.demo.www.pages.HomePage;
import com.nopcommerce.demo.www.pages.RegisterPage;
import com.nopcommerce.demo.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTabTest extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        String expectedMessage = "Register";
        String actualMessage = registerPage.getRegisterTab();
        Assert.assertEquals(expectedMessage, actualMessage, "error");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){

        homePage.clickOnRegisterLink();
        registerPage.enterfirstName("Sanket");
        registerPage.enterlastName("Patel");
        registerPage.enteremail("Asd123@gmail.com");
        registerPage.enterpassword("Asd@123");
        registerPage.enterConfirmPassword("Asd@123");
        registerPage.clickRegisterButton();
        String expectedMessage = "Your registration completed";
        String actualMessage = registerPage.getRegisterCompletionMessage();
        Assert.assertEquals(expectedMessage,actualMessage,"Register not completed");

    }
}