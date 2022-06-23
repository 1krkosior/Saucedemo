package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class testCalosciowyC {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\krkosior\\Desktop\\selenium\\lib\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com./");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("FirstName");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("LastName");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("11111");
        Thread.sleep(1000);
        driver.findElement(By.id("continue")).click();
    }
}
