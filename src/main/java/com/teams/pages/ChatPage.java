package com.teams.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChatPage {

    WebDriver driver;

    public ChatPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By chatIcon = By.xpath("//span[normalize-space()='Chat']/ancestor::button");
    By userName = By.xpath("//h3[normalize-space()='Jeevitha']");
    By messageBox = By.xpath("//textarea[@placeholder='type a message...']");
    By sendButton = By.xpath("//button[contains(@class,'bg-gradient-to-r')]");

    public void clickChatIcon() {
        driver.findElement(chatIcon).click();
    }

    public void selectUser() {
        driver.findElement(userName).click();
    }

    public void enterMessage(String message) {
        driver.findElement(messageBox).sendKeys(message);
    }

    public void clickSendButton() {
        driver.findElement(sendButton).click();
    }

    public void sendMessage(String message) throws InterruptedException {
        clickChatIcon();
        Thread.sleep(2000);

        selectUser();
        Thread.sleep(2000);

        enterMessage(message);
        Thread.sleep(1000);

        clickSendButton();
    }
}