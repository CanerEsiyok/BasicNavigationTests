package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class BrowserFactory {
    public static ArrayList<WebDriver> getDriver(String str) {

        WebDriver driver1 = null;
        WebDriver driver2 = null;
        WebDriver driver3 = null;
        ArrayList<WebDriver>drivers=new ArrayList<>();

        if (str.startsWith("Safari"))
            driver1 = null;

        else if (str.startsWith("Windows")){
            WebDriverManager.chromedriver().setup();
            driver1 = new ChromeDriver();
            WebDriverManager.firefoxdriver().setup();
            driver2=new FirefoxDriver();
            WebDriverManager.edgedriver().setup();
            driver3=new EdgeDriver();
            drivers.addAll(Arrays.asList(driver1,driver2,driver3));
        }

        return drivers;
    }
}
