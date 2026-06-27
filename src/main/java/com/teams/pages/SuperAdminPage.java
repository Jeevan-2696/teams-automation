package com.teams.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuperAdminPage {

    WebDriver driver;

    public SuperAdminPage(WebDriver driver) {
        this.driver = driver;
    }

    // Login locators
    By email = By.xpath("//input[@placeholder='Enter your email address']");
    By password = By.xpath("//input[@placeholder='Enter your password']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");

    // Add Company menu/button
    By addCompany = By.xpath("//button[.//span[normalize-space()='Add Company']]");

    // Add Company form locators
    By fullName = By.xpath("//input[@placeholder='Enter admin full name']");
    By companyName = By.xpath("//input[@placeholder='Enter company name']");
    By companyDomain = By.xpath("//input[@placeholder='Enter company domain']");
    By adminEmail = By.xpath("//input[@placeholder='Enter admin email']");
    By phoneNumber = By.xpath("//input[@placeholder='Enter phone number']");
    By companyAddress = By.xpath("//input[@placeholder='Enter company address']");
    By createPassword = By.xpath("//input[@placeholder='Create password']");
    By confirmPassword = By.xpath("//input[@placeholder='Confirm password']");
    By createCompanyButton = By.xpath("//button[normalize-space()='Create company and send OTP']");

    public void loginSuperAdmin(String mail, String pwd) {
        driver.findElement(email).sendKeys(mail);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();
    }

    public void clickAddCompany() {
        driver.findElement(addCompany).click();
    }

    public void enterCompanyDetails(String name, String cname, String domain,
                                    String mail, String phone, String address,
                                    String pwd, String cpwd) {

        driver.findElement(fullName).sendKeys(name);
        driver.findElement(companyName).sendKeys(cname);
        driver.findElement(companyDomain).sendKeys(domain);
        driver.findElement(adminEmail).sendKeys(mail);
        driver.findElement(phoneNumber).sendKeys(phone);
        driver.findElement(companyAddress).sendKeys(address);
        driver.findElement(createPassword).sendKeys(pwd);
        driver.findElement(confirmPassword).sendKeys(cpwd);
    }

    public void clickCreateCompany() {
        driver.findElement(createCompanyButton).click();
    }

    public void addCompanyFlow(String name, String cname, String domain,
                               String mail, String phone, String address,
                               String pwd, String cpwd) {

        clickAddCompany();
        enterCompanyDetails(name, cname, domain, mail, phone, address, pwd, cpwd);
        clickCreateCompany();
    }
}