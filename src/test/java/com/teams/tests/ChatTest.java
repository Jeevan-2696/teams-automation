package com.teams.tests;

import org.testng.annotations.Test;

import com.teams.base.BaseClass;
import com.teams.pages.ChatPage;
import com.teams.pages.LoginPage;

public class ChatTest extends BaseClass {

    @Test
    public void verifySendChatMessage() throws InterruptedException {

        

        LoginPage login = new LoginPage(driver);

        login.login("jeevankalyan261@gmail.com", "Admin@1234");

        Thread.sleep(5000);

        ChatPage chat = new ChatPage(driver);

        chat.sendMessage("Hello, this is automation testing message");

        Thread.sleep(5000);
    }
}