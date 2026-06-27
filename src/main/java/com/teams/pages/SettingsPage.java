package com.teams.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingsPage {

    WebDriver driver;

    public SettingsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Settings page locators
    By settingsIcon = By.xpath("//span[normalize-space()='Settings']/ancestor::button");
    By passwordTab = By.xpath("//button[contains(.,'Password')]");

    // Password fields
    By currentPassword = By.xpath("//label[normalize-space()='Current Password']/following::input[1]");
    By newPassword = By.xpath("//label[normalize-space()='New Password']/following::input[1]");
    By confirmNewPassword = By.xpath("//label[normalize-space()='Confirm New Password']/following::input[1]");

    // Eye icons
    By currentPasswordEye = By.xpath("//label[normalize-space()='Current Password']/following::input[1]/following::button[1]");
    By newPasswordEye = By.xpath("//label[normalize-space()='New Password']/following::input[1]/following::button[1]");
    By confirmPasswordEye = By.xpath("//label[normalize-space()='Confirm New Password']/following::input[1]/following::button[1]");

    // Update button
    By updatePasswordButton = By.xpath("//button[normalize-space()='Update Password']");

    public void clickSettingsIcon() {
        driver.findElement(settingsIcon).click();
    }

    public void clickPasswordTab() {
        driver.findElement(passwordTab).click();
    }

    public void enterCurrentPassword(String oldPwd) {
        driver.findElement(currentPassword).clear();
        driver.findElement(currentPassword).sendKeys(oldPwd);
    }

    public void enterNewPassword(String newPwd) {
        driver.findElement(newPassword).clear();
        driver.findElement(newPassword).sendKeys(newPwd);
    }

    public void enterConfirmNewPassword(String confirmPwd) {
        driver.findElement(confirmNewPassword).clear();
        driver.findElement(confirmNewPassword).sendKeys(confirmPwd);
    }

    public void clickCurrentPasswordEye() {
        driver.findElement(currentPasswordEye).click();
    }

    public void clickNewPasswordEye() {
        driver.findElement(newPasswordEye).click();
    }

    public void clickConfirmPasswordEye() {
        driver.findElement(confirmPasswordEye).click();
    }

    public void clickUpdatePassword() {
        driver.findElement(updatePasswordButton).click();
    }

    public void changePassword(String oldPwd, String newPwd, String confirmPwd) throws InterruptedException {

        clickSettingsIcon();
        Thread.sleep(2000);

        clickPasswordTab();
        Thread.sleep(1000);

        enterCurrentPassword(oldPwd);
        clickCurrentPasswordEye();

        enterNewPassword(newPwd);
        clickNewPasswordEye();

        enterConfirmNewPassword(confirmPwd);
        clickConfirmPasswordEye();

        Thread.sleep(1000);

        clickUpdatePassword();
    }
}