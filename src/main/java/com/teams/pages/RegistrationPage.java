package com.teams.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Home page locator
    By getStartedButton = By.xpath("//a[contains(text(),'Get Started')]");

    // Registration page locators
    By companyTab = By.xpath("//button[contains(text(),'Company')]");
    By fullName = By.xpath("//input[@placeholder='Enter your full name']");
    By companyName = By.xpath("//input[@placeholder='Enter company name']");
    By companyDomain = By.xpath("//input[@placeholder='Enter company domain']");
    By phoneNumber = By.xpath("//input[@placeholder='Enter phone number']");
    By companyAddress = By.xpath("//input[@placeholder='Enter company address']");
    By companyEmail = By.xpath("//input[@placeholder='Enter company email']");
    By password = By.xpath("//input[@placeholder='Create password']");
    By confirmPassword = By.xpath("//input[@placeholder='Confirm password']");
    By continueButton = By.xpath("//button[contains(text(),'Continue')]");

    //Methods
    
    public void clickGetStarted() {
        driver.findElement(getStartedButton).click();
    }

    public void clickCompanyTab() {
        driver.findElement(companyTab).click();
    }

    public void enterFullName(String name) {
        driver.findElement(fullName).sendKeys(name);
    }

    public void enterCompanyName(String cname) {
        driver.findElement(companyName).sendKeys(cname);
    }

    public void enterCompanyDomain(String domain) {
        driver.findElement(companyDomain).sendKeys(domain);
    }

    public void enterPhoneNumber(String phone) {
        driver.findElement(phoneNumber).sendKeys(phone);
    }

    public void enterCompanyAddress(String address) {
        driver.findElement(companyAddress).sendKeys(address);
    }

    public void enterCompanyEmail(String email) {
        driver.findElement(companyEmail).sendKeys(email);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void enterConfirmPassword(String cpwd) {
        driver.findElement(confirmPassword).sendKeys(cpwd);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public void registerCompany(String name, String cname, String domain, String phone,
                                String address, String email, String pwd, String cpwd) {

        clickGetStarted();
        clickCompanyTab();
        
        enterFullName(name);
        enterCompanyName(cname);
        enterCompanyDomain(domain);
        enterPhoneNumber(phone);
        enterCompanyAddress(address);
        enterCompanyEmail(email);
        enterPassword(pwd);
        enterConfirmPassword(cpwd);
        clickContinue();
    }
}