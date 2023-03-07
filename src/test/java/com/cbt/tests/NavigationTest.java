package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class NavigationTest {
    public static void main(String[] args) throws InterruptedException {
        String OS = System.getProperty("os.name");
        ArrayList<WebDriver> drivers = BrowserFactory.getDriver(OS);
        for (WebDriver driver : drivers) {

            driver.manage().window().maximize();
            driver.get("https://duckduckgo.com");
            Thread.sleep(1000);
            String title1 = driver.getTitle();
            driver.navigate().to("https://etsy.com");
            Thread.sleep(1000);
            String title2 = driver.getTitle();
            driver.navigate().back();
            StringUtility.verifyEquals(title1, driver.getTitle());
            Thread.sleep(1000);
            driver.navigate().forward();
            StringUtility.verifyEquals(title2, driver.getTitle());
            Thread.sleep(1000);
            driver.close();


        }
    }
}