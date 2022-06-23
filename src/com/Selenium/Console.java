package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Console {
    public static void main(String[] args) throws InterruptedException {
    //    @Test

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\krkosior\\Desktop\\selenium\\lib\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com./");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();

    }
}

