package com.teams.packages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtilities {

    WebDriver driver;
    WebDriverWait wait;

    public WaitUtilities(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Wait for element visibility
    public WebElement waitForVisibility(By locator) {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait for element to be clickable
    public WebElement waitForClick(By locator) {
        return wait.until(
                ExpectedConditions.elementToBeClickable(locator));
    }

    // Wait for presence of element
    public WebElement waitForPresence(By locator) {
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Wait for page title
    public boolean waitForTitle(String title) {
        return wait.until(
                ExpectedConditions.titleContains(title));
    }
}
