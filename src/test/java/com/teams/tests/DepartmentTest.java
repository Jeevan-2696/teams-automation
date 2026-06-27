package com.teams.tests;

import org.testng.annotations.Test;

import com.teams.base.BaseClass;
import com.teams.pages.DepartmentPage;
import com.teams.pages.LoginPage;

public class DepartmentTest extends BaseClass {

    @Test
    public void verifyCreateDepartment() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        
        loginPage.clickSignIn();

        loginPage.login("jeevankalyan261@gmail.com", "Admin@1234");

        Thread.sleep(5000);

        DepartmentPage departmentPage = new DepartmentPage(driver);

        departmentPage.createDepartment("coding Team");

        Thread.sleep(3000);
    }
}