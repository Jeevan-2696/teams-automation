package com.teams.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By signIn = By.xpath("//a[text()='Sign In']");
    By email = By.xpath("//input[@placeholder='Enter your email address']");
    By password = By.xpath("//input[@placeholder='Enter your password']");
    By signInButton = By.xpath("//button[contains(text(),'Login')]");
    By profileButton = By.xpath("[.//p[contains(text(),'Jeevan Kalyan')]");
    By logoutButton = By.xpath(".//span[normalize-space()='Sign out']]");

    // Click Sign In
    public void clickSignIn() {
        driver.findElement(signIn).click();
    }

    // Enter Email
    public void enterEmail(String mail) {
        driver.findElement(email).sendKeys(mail);
    }

    // Enter Password
    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    // Click Login
    public void clickLoginButton() {
        driver.findElement(signInButton).click();
    }

    // Complete Login
    public void login(String mail, String pwd) {

        clickSignIn();
        enterEmail(mail);
        enterPassword(pwd);
        clickLoginButton();
    }

    // Click Profile
    public void clickProfileButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.presenceOfElementLocated(profileButton));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(profileButton));
    }


    public void clickLogoutButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.presenceOfElementLocated(logoutButton));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(logoutButton));
    }
    // Complete Logout
    public void logout() {
        clickProfileButton();
        clickLogoutButton();
    }
}