package com.teams.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;   // <-- ADD THIS FIELD

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // <-- ADD THIS LINE
    }

    // Locators
    By signIn = By.xpath("//a[text()='Sign In']");
    By email = By.xpath("//input[@placeholder='Enter your email address']");
    By password = By.xpath("//input[@placeholder='Enter your password']");
    By signInButton = By.xpath("//button[contains(text(),'Login')]");
    By profileIcon = By.xpath("//button[@data-slot='dropdown-menu-trigger']");
    By signOut = By.xpath("//span[text()='Sign out']");

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

  
    public void clickProfile() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[data-sonner-toast]")));
        WebElement profile = wait.until(ExpectedConditions.elementToBeClickable(profileIcon));
        profile.click();
    }



    // Click Sign Out
    public void clickSignOut() {
        wait.until(ExpectedConditions.elementToBeClickable(signOut)).click();
    }

    
    // Complete Login
    public void login(String mail, String pwd) {

        clickSignIn();
        enterEmail(mail);
        enterPassword(pwd);
        clickLoginButton();
    }

   
    // Complete Logout
    public void logout() {
    	clickProfile();
        clickSignOut();
    }
}