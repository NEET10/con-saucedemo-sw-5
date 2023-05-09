package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;

public class ProductPageTest extends BaseTest {
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        loginPage = new LoginPage();
       /* productPage = new ProductPage();
        softAssert =new SoftAssert();*/
    }

    }


