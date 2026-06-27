package com.teams.tests;

import org.testng.annotations.Test;

import com.teams.base.BaseClass;
import com.teams.pages.UserRegistrationPage;

public class UserRegistrationTest extends BaseClass {

    @Test
    public void verifyUserRegistration() {

        UserRegistrationPage registration = new UserRegistrationPage(driver);

        registration.registerUser(
                "srujan kumar",
                "srujankumar@outlook.com",
                "9876543210",
                "User@123",
                "User@123"
        );
    }
}