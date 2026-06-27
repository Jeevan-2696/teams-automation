package com.teams.tests;

import org.testng.annotations.Test;

import com.teams.base.BaseClass;
import com.teams.pages.RegistrationPage;

public class RegistrationTest extends BaseClass {

    @Test
    public void verifyCompanyRegistration() {

        RegistrationPage registrationPage = new RegistrationPage(driver);

        registrationPage.registerCompany(
                "Jeevan Kalyan",
                "Software Solutions Pvt Ltd",
                "outlook.com",
                "9876543210",
                "Hyderabad",
                "gjeevankalyan26@outlook.com",
                "Admin@1234",
                "Admin@1234"
        );
    }
}