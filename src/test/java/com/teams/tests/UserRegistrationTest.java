package com.teams.tests;

import org.testng.annotations.Test;

import com.teams.base.BaseClass;
import com.teams.pages.UserRegistrationPage;

public class UserRegistrationTest extends BaseClass {

    @Test
    public void verifyUserRegistration() {

        UserRegistrationPage registration = new UserRegistrationPage(driver);

        registration.registerUser(
                "sairam",
                "sairamk@gmail.com",
                "9876543280",
                "Sairam@1234",
                "Sairam@1234"
        );
    }
}