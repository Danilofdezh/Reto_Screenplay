package com.demoqa.automation.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SpecialMethods {
    private static int var = 0;
    public static Properties properties;

    public static void configProperties() {
        properties = new Properties();
        try {
            properties.load(new FileReader("conf.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void waitFor(int segundos) throws InterruptedException {
        Thread.sleep(segundos * 1000);
    }
    public static void ScreenShotPage(WebDriver driver){
        try {

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\LENOVO\\IdeaProjects\\Reto_Screenplay\\screenshot\\Captura_"+var+".jpg"));
            var++;
        }catch (IOException error){
            error.printStackTrace();
        }
    }

}
