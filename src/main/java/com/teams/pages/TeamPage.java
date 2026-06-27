package com.teams.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeamPage {

    WebDriver driver;

    public TeamPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators

    By teamsIcon = By.xpath("//span[normalize-space()='Teams']/ancestor::button");

    By plusButton = By.xpath("//button[@aria-haspopup='dialog']");

    By departmentDropdown = By.xpath("//button[contains(.,'Select department')]");

    // All department options
    By departmentOptions = By.xpath("//div[@role='option']");

    By teamName = By.xpath("//input[@placeholder='Enter team name']");

    By slug = By.xpath("//input[@placeholder='Custom Slug']");

    By description = By.xpath("//textarea[@placeholder='What is this team for?']");

    By publicTeam = By.xpath("//div[contains(.,'Public')]");

    By createTeamButton = By.xpath("//button[normalize-space()='Create team']");


    // Methods

    public void clickTeamsIcon() {
        driver.findElement(teamsIcon).click();
    }

    public void clickPlusButton() {
        driver.findElement(plusButton).click();
    }

    public void selectRandomDepartment() throws InterruptedException {

        driver.findElement(departmentDropdown).click();

        Thread.sleep(1000);

        List<WebElement> list = driver.findElements(departmentOptions);

        Random random = new Random();

        int index = random.nextInt(list.size());

        list.get(index).click();
    }

    public void enterTeamName(String name) {
        driver.findElement(teamName).sendKeys(name);
    }

    public void enterSlug(String slugName) {
        driver.findElement(slug).sendKeys(slugName);
    }

    public void enterDescription(String desc) {
        driver.findElement(description).sendKeys(desc);
    }

    public void clickPublicTeam() {
        driver.findElement(publicTeam).click();
    }

    public void clickCreateTeam() {
        driver.findElement(createTeamButton).click();
    }

    public void createTeam(String name,String slugName,String desc) throws InterruptedException {

        clickTeamsIcon();

        Thread.sleep(1000);

        clickPlusButton();

        Thread.sleep(1000);

        selectRandomDepartment();

        Thread.sleep(1000);

        enterTeamName(name);

        enterSlug(slugName);

        enterDescription(desc);

        clickPublicTeam();

        clickCreateTeam();
    }

}