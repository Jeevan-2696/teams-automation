package com.teams.pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillingPage {

    WebDriver driver;
    WebDriverWait wait;

    public BillingPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,
                Duration.ofSeconds(20));
    }

    // Billing Menu
    By billingMenu =
            By.xpath("//span[contains(text(),\"Billing\")][2]");

    // Plans
    By premiumPlan =
            By.xpath("(//button[contains(text(),'Select')])[1]");

    By enterprisePlan =
            By.xpath("(//button[contains(text(),'Select')])[2]");

    // Continue Payment
    By continuePayment =
            By.xpath("//button[contains(text(),'Continue to Payment')]");

    // Payment History
    By paymentHistory =
            By.xpath("//*[contains(text(),'Payment History')]");

    // Invoice PDF
    By invoicePdf =
            By.xpath("//a[contains(text(),'PDF')]");

    // Razorpay
    By cardNumber =
            By.name("card[number]");

    By expiry =
            By.name("card[expiry]");

    By cvv =
            By.name("card[cvv]");

    By payButton =
            By.xpath("//button[contains(.,'Pay')]");

    By successButton =
            By.xpath("//button[contains(text(),'Success')]");

    // Click Billing
    public void clickBilling() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,700)");

        wait.until(
                ExpectedConditions
                        .elementToBeClickable(
                                billingMenu))
                .click();
    }

    // Select Premium Plan
    public void selectPremiumPlan() {

        wait.until(
                ExpectedConditions
                        .elementToBeClickable(
                                premiumPlan))
                .click();
    }

    // Select Enterprise Plan
    public void selectEnterprisePlan() {

        wait.until(
                ExpectedConditions
                        .elementToBeClickable(
                                enterprisePlan))
                .click();
    }

    // Continue Payment
    public void clickContinuePayment() {

        wait.until(
                ExpectedConditions
                        .elementToBeClickable(
                                continuePayment))
                .click();
    }

    // Complete Razorpay Payment
    public void makePayment()
            throws InterruptedException {

        Thread.sleep(5000);

        Set<String> windows =
                driver.getWindowHandles();

        for (String win : windows) {
            driver.switchTo().window(win);
        }

        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                cardNumber))
                .sendKeys("4111111111111111");

        driver.findElement(expiry)
                .sendKeys("1228");

        driver.findElement(cvv)
                .sendKeys("123");

        driver.findElement(payButton)
                .click();

        Thread.sleep(3000);

        driver.findElement(successButton)
                .click();
    }

    // Verify Payment History
    public boolean verifyPaymentHistory() {

        return wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                paymentHistory))
                .isDisplayed();
    }

    // Verify Invoice
    public boolean verifyInvoice() {

        return wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                invoicePdf))
                .isDisplayed();
    }
}