package com.cbt.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class deneme {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.getProperty("os.name"));
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://duckduckgo.com");
        WebElement toolBar=driver.findElement(By.name("q"));
        Thread.sleep(1000);
        toolBar.sendKeys("padel"+ Keys.ENTER);
    }
}
