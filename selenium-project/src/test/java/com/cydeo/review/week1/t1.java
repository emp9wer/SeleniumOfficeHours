package com.cydeo.review.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class t1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        while (true) {
            driver.get("https://www.google.com");
            Thread.sleep(1000);
            driver.findElement(By.className("gLFyf")).sendKeys("Cydeo");
            Thread.sleep(1000);
            driver.findElement(By.className("wM6W7d")).click();
            Thread.sleep(1000);
        }
    }
}
