package com.teams.tests;

import org.testng.annotations.Test;

import com.teams.base.BaseClass;
import com.teams.pages.LoginPage;
import com.teams.pages.SettingsPage;

public class SettingsTest extends BaseClass {

    @Test
    public void verifyChangePassword() throws InterruptedException {

       

        LoginPage login = new LoginPage(driver);

        login.login("jeevankalyan261@gmail.com", "Admin@1234");

        Thread.sleep(5000);

        SettingsPage settings = new SettingsPage(driver);

        settings.changePassword(
                "Admin@1234",
                "Admin@12345",
                "Admin@12345"
        );

        Thread.sleep(5000);
    }
}