package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_T2_T3_Alert_Practices {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @AfterMethod
    public void tearDown(){

        driver.close();
    }

    @Test
    public void information_alert_test1(){
        //TC #1: Information alert practice
        //3. Click to “Click for JS Alert” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed(),"result is not displayed");
        Assert.assertEquals(resultText.getText(),"You successfully clicked an alert","text is not as expected");

    }

    @Test
    public void information_alert_test2(){
        //TC #2: Confirmation alert practice
        //3. Click to “Click for JS Confirm” button
        WebElement clickForJSConfirmButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickForJSConfirmButton.click();
        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //5. Verify “You clicked: Ok” text is displayed.
        WebElement resText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resText.isDisplayed(),"text not displayed");
        Assert.assertEquals(resText.getText(),"You clicked: Ok","text is not matching");
    }

    @Test
    public void information_alert_test3(){
        //TC #3: Information alert practice
        //3. Click to “Click for JS Prompt” button
        WebElement clickForJSPromptButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        clickForJSPromptButton.click();
        //4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        //5. Click to OK button from the alert
        alert.accept();
        //6. Verify “You entered: hello” text is displayed.
        WebElement res = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(res.isDisplayed(),"text not displayed");
        Assert.assertEquals(res.getText(),"You entered: hello","text is not matching");

    }










}
