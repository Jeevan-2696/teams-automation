package com.teams.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtilities {

    public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {

        // Create screenshots folder inside the Maven project
        File folder = new File(System.getProperty("user.dir") + "/screenshots");

        if (!folder.exists()) {
            folder.mkdirs();
        }

        // Capture screenshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save screenshot
        File dest = new File(folder, fileName + ".png");

        FileHandler.copy(src, dest);

        System.out.println("Screenshot saved successfully");
        System.out.println("Location: " + dest.getAbsolutePath());
    }
}