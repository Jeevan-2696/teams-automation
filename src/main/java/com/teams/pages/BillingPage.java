package com.teams.pages;
 
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
 
public class BillingPage {
 
    WebDriver driver;
 
    public BillingPage(WebDriver driver) {

        this.driver = driver;

    }
 
    // Locators

    By billingMenu = By.xpath("//span[normalize-space()='Billing']/ancestor::button");
 
    By selectedPlan = By.xpath("//button[.//p[normalize-space()='Premium']]");

    By continueToPaymentButton = By.xpath("//button[contains(.,'Continue to Payment')]");
 
    

    public void clickBillingMenu() {

        driver.findElement(billingMenu).click();

    }
 
    public void clickPremiumSelect() {

        driver.findElement(selectedPlan).click();

    }
 
    public void clickContinueToPayment() {

        driver.findElement(continueToPaymentButton).click();

    }
 
    

    public void goToPayment() throws InterruptedException {

        clickBillingMenu();
 
        Thread.sleep(2000);
 
        clickPremiumSelect();
 
        Thread.sleep(2000);
 
        clickContinueToPayment();

    }

}
 