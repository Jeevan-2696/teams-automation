package com.teams.tests;
 
import org.testng.annotations.Test;
 
import com.teams.base.BaseClass;

import com.teams.pages.LoginPage;

import com.teams.pages.BillingPage;
 
public class BillingTest extends BaseClass {
 
    @Test

    public void verifyPaymentPage() throws InterruptedException {
 
        
 
        LoginPage login = new LoginPage(driver);
 
        login.login("jeevankalyan261@gmail.com", "Admin@1234");
 
        Thread.sleep(5000);
 
        BillingPage payment = new BillingPage(driver);
 
        payment.goToPayment();
 
        Thread.sleep(5000);

    }

}
 