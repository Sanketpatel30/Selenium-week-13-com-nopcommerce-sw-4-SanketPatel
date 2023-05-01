package com.nopcommerce.demo.www.pages;

import com.nopcommerce.demo.www.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmpasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registerCompletionText = By.xpath("//div[contains(text(),'Your registration completed')]");

    public String getRegisterTab() {
        return getTextFromElement(registerText);
    }

    public void enterfirstName(String firstname) {
        sendTextToElement(firstNameField, firstname);
    }

    public void enterlastName(String lastname) {
        sendTextToElement(lastNameField, lastname);
    }

    public void enteremail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterpassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmpassword) {
        sendTextToElement(confirmpasswordField, confirmpassword);
    }

    public void clickRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getRegisterCompletionMessage() {
        return getTextFromElement(registerCompletionText);
    }
}
