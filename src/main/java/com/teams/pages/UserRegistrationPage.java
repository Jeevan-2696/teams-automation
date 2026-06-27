package com.teams.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRegistrationPage {

    WebDriver driver;

    public UserRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Home Page
    By getStartedBtn = By.xpath("//a[@href='/register']");

    // Registration Page
    By userTab = By.xpath("//button[text()='User']");

    // User Registration
    By fullName = By.xpath("//input[@placeholder='Enter your full name']");
    By email = By.xpath("//input[@placeholder='user@example.com']");
    By mobile = By.xpath("//input[@placeholder='Enter mobile number']");
    By password = By.xpath("//input[@placeholder='Enter password']");
    By confirmPassword = By.xpath("//input[@placeholder='Confirm password']");
    By continueBtn = By.xpath("//button[text()='Continue']");

    // Click Get Started
    public void clickGetStarted() {
        driver.findElement(getStartedBtn).click();
    }

    // Click User Tab
    public void clickUserTab() {
        driver.findElement(userTab).click();
    }

    // Enter Details
    public void enterFullName(String name) {
        driver.findElement(fullName).sendKeys(name);
    }

    public void enterEmail(String mail) {
        driver.findElement(email).sendKeys(mail);
    }

    public void enterMobile(String number) {
        driver.findElement(mobile).sendKeys(number);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void enterConfirmPassword(String cpwd) {
        driver.findElement(confirmPassword).sendKeys(cpwd);
    }

    public void clickContinue() {
        driver.findElement(continueBtn).click();
    }

    // Complete User Registration
    public void registerUser(String name,
                             String mail,
                             String number,
                             String pwd,
                             String cpwd) {

        clickGetStarted();
        clickUserTab();

        enterFullName(name);
        enterEmail(mail);
        enterMobile(number);
        enterPassword(pwd);
        enterConfirmPassword(cpwd);

        clickContinue();
    }
}