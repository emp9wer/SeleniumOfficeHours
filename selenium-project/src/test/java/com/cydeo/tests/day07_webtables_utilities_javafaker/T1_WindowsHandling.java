package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_WindowsHandling {

    //TC #1: Window Handle practice
    //1. Create new test and make set ups
    //2. Go to : https://www.amazon.com
    //3. Copy paste the lines from below into your class
    //4. Create a logic to switch to the tab where Etsy.com is open
    //5. Assert: Title contains “Etsy”
    //Lines to be pasted:
    //((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
    //((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
    //((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
    //These lines will simply open new tabs using something called JavascriptExecutor
    //and get those pages. We will learn JavascriptExecutor later as well.

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //1. Create new test and make set ups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit(); // closes all tabs
    }

    @Test
    public void window_handling_test(){
        //3. Copy paste the lines from below into your class
        //These lines will simply open new tabs using something called JavascriptExecutor
        //and get those pages. We will learn JavascriptExecutor later as well.
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");


        //4. Create a logic to switch to the tab where Etsy.com is open

        //return and store all window handles in a Set.
       // Set<String> allWindowHandles = driver.getWindowHandles();
       // for (String each : allWindowHandles) {

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);

            if(driver.getCurrentUrl().contains("etsy")){
                    break;
            }
        }

        //5. Assert: Title contains “Etsy”
        BrowserUtils.verifyTitleContains(driver,"Etsy");

        //Lines to be pasted:
        //((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        //((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        //((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
        //These lines will simply open new tabs using something called JavascriptExecutor
        //and get those pages. We will learn JavascriptExecutor later as well.
    }

    @Test
    public void window_handling_test2(){
        //3. Copy paste the lines from below into your class
        //These lines will simply open new tabs using something called JavascriptExecutor
        //and get those pages. We will learn JavascriptExecutor later as well.
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");


        //4. Create a logic to switch to the tab where Etsy.com is open

        //return and store all window handles in a Set.
        // Set<String> allWindowHandles = driver.getWindowHandles();
        // for (String each : allWindowHandles) {

        BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");

        //5. Assert: Title contains “Etsy”


        //Lines to be pasted:
        //((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        //((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        //((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
        //These lines will simply open new tabs using something called JavascriptExecutor
        //and get those pages. We will learn JavascriptExecutor later as well.
    }


}
