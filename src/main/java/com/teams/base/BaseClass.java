package com.teams.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public WebDriver driver;

    @BeforeMethod
    public void launchBrowser() {
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://leviticaconnect.com/");
    }

   /* @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }*/
    }
