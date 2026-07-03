package com.teams.tests;

import org.testng.annotations.Test;

import com.teams.base.BaseClass;
import com.teams.pages.LoginPage;
import com.teams.pages.TeamPage;

public class TeamTest extends BaseClass {

    @Test
    public void verifyCreateTeam() throws Exception {

        LoginPage login = new LoginPage(driver);

        login.login("leviticaconnect@gmail.com", "Admin@123");

        Thread.sleep(5000);

        TeamPage team = new TeamPage(driver);

        team.createTeam(
                "Automation Team",
                "automation-team",
                "Automation Testing Team");

        Thread.sleep(5000);
    }
}