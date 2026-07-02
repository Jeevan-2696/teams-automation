package com.teams.tests;

import org.testng.annotations.Test;

import com.teams.base.BaseClass;
import com.teams.pages.LoginPage;

public class LoginTest extends BaseClass {

    @Test
    public void verifyLoginLogout() throws InterruptedException {

      
        LoginPage loginPage = new LoginPage(driver);

       
        loginPage.clickSignIn();

        loginPage.enterEmail("jeevankalyan261@gmail.com"); 

        loginPage.enterPassword("Admin@1234"); 

        
        loginPage.clickLoginButton();

        
        Thread.sleep(5000);

      
        loginPage.clickProfile();

        
        Thread.sleep(5000);

      
        loginPage.clickSignOut();

       
        Thread.sleep(3000);
    }
}