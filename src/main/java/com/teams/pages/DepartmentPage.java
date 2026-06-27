package com.teams.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepartmentPage {

    WebDriver driver;

    // Constructor
    public DepartmentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By departmentIcon = By.xpath("//button[.//span[normalize-space()='Departments']]");
    By plusButton = By.xpath("//h2[text()='Departments']/following::button[1]");
    By departmentName = By.xpath("//input[@placeholder='e.g. design systems']");
    By createDepartmentButton = By.xpath("//button[text()='CreateDepartment']");

    // Methods
    public void clickDepartmentIcon() {
        driver.findElement(departmentIcon).click();
    }

    public void clickPlusButton() {
        driver.findElement(plusButton).click();
    }

    public void enterDepartmentName(String deptName) {
        driver.findElement(departmentName).sendKeys(deptName);
    }

    public void clickCreateDepartmentButton() {
        driver.findElement(createDepartmentButton).click();
    }

    // Complete Flow
    public void createDepartment(String deptName) {

        clickDepartmentIcon();
        clickPlusButton();
        enterDepartmentName(deptName);
        clickCreateDepartmentButton();
    }
}