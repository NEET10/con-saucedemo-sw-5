package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.customListeners.CustomListeners;
import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
            @FindBy(id = "user-name")
    WebElement userNameField;
    @CacheLookup
            @FindBy(id = "password")
            WebElement passwordField;
    @CacheLookup
            @FindBy(id = "login-button")
            WebElement loginButton;



    public void enterUserName(String userName){
        CustomListeners.test.log(Status.PASS,"Enter username "+ userName);
        Reporter.log("Enter username "+userName+" to username field "+userNameField.toString());
        sendTextToElement(userNameField, userName );
    }
    public void enterPassword(String password) {
        CustomListeners.test.log(Status.PASS,"Enter password "+password);
        Reporter.log("Enter password "+password+"in to password field "+passwordField.toString());
        sendTextToElement(passwordField, password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"Click on login Button");
        Reporter.log("Click on login Button "+loginButton.toString());


    }

}
