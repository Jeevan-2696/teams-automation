package com.teams.tests;

import org.testng.annotations.Test;

import com.teams.base.BaseClass;
import com.teams.pages.SuperAdminPage;

public class SuperAdminTest extends BaseClass {

    @Test
    public void verifyAddCompany() throws InterruptedException {

        driver.get("https://leviticaconnect.com/login/super-admin");

        SuperAdminPage superAdmin = new SuperAdminPage(driver);

        superAdmin.loginSuperAdmin("info@leviticaconnect.com", "Admin@123");

        Thread.sleep(5000);

       

        superAdmin.addCompanyFlow(
                "Jeevan Kalyan",
                "ABC Technologies",
                "abctech.com",
                "jeevankalyan@abctech.com",
                "9876543210",
                "Hyderabad",
                "Admin@1234",
                "Admin@1234"
        );

        Thread.sleep(5000);
    }
}