package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

        // Linki do twittera, facebooka i linkedina dostępnych w lewym dolnym rogu
public class Linki {
    public static void main(String[] args) throws InterruptedException {

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
        driver.findElement(By.xpath("//a[@href='https://twitter.com/saucelabs']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/saucelabs']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/sauce-labs/']")).click();
        Thread.sleep(3000);
    }
}

            // Linki do twittera, facebooka i linkedina dostępnych w lewym dolnym rogu i przejście do strony głównej
/*
public class Linki {
    public static void main(String[] args) throws InterruptedException {

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
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://twitter.com/saucelabs']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/saucelabs']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/sauce-labs/']")).click();
        Thread.sleep(3000);


        Set<String> windows = driver.getWindowHandles();
        String mainwindow = driver.getWindowHandle();

        for (String handle : windows) {
            driver.switchTo().window(handle);
            String pagetitle = driver.getTitle();
            if (pagetitle.equalsIgnoreCase("https://twitter.com/saucelabs")) {
                driver.findElement(By.xpath("https://www.saucedemo.com./")).click();
                driver.close();
            }
        }
        driver.switchTo().window(mainwindow);
        driver.close();
    }
}
*/


        // Linki do twittera, facebooka i linkedina dostępnych w lewym dolnym rogu i zamknięcie strony twitter i przejście do strony głównej
/*
public class Linki {
    public static void main(String[] args) throws InterruptedException {

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
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://twitter.com/saucelabs']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/saucelabs']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/sauce-labs/']")).click();
        Thread.sleep(3000);


        Set<String> windows = driver.getWindowHandles();
        String mainwindow = driver.getWindowHandle();

        for (String handle : windows) {
            driver.switchTo().window(handle);
            String pagetitle = driver.getTitle();
            if (pagetitle.equalsIgnoreCase("https://www.saucedemo.com./")) {
                driver.findElement(By.xpath("https://twitter.com/saucelabs")).click();
               driver.close();
            }
         }
                driver.close();
        driver.switchTo().window(mainwindow);

            }
        }
        */