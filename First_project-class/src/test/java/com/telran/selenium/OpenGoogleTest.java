package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.*;

public class OpenGoogleTest extends TestBase {

    @Test
    public void searchJavaTest() throws InterruptedException {
        openSite("https://www.google.com");
        type(By.name("q"),"Java"+ Keys.ENTER);

        Thread.sleep(6000);
    }
//    @Test
//    public void clickSettings() throws InterruptedException {
//        click(By.id("fsettl"));
//        Thread.sleep(6000);
//    }


}
