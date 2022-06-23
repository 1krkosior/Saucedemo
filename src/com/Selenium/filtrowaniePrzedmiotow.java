package com.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class filtrowaniePrzedmiotow {
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
        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value='za']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value='az']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value='lohi']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value='hilo']")).click();
    }
}