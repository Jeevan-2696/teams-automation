package com.teams.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.teams.base.BaseClass;
import com.teams.pages.BillingPage;
import com.teams.pages.LoginPage;

public class BillingTest
        extends BaseClass {

    @Test
    public void verifyBillingFlow()
            throws Exception {

        LoginPage login =
                new LoginPage(driver);

        login.login(
                "jeevankalyan261@gmail.com",
                "Admin@1234");

        BillingPage billing =
                new BillingPage(driver);

        billing.clickBilling();

        billing.selectPremiumPlan();

        billing.clickContinuePayment();

        billing.makePayment();

        Assert.assertTrue(
                billing.verifyPaymentHistory());

        Assert.assertTrue(
                billing.verifyInvoice());
    }
}