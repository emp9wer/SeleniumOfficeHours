package com.cydeo.tests.day03_sccSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_cssSelector {
    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        //locating using class attribute's value
        //WebElement logInButton = driver.findElement(By.className("login-btn"));

        System.out.println("1 locating using cssSelector using type attribute's value !!!!!!!!!");
        //locating using cssSelector using type attribute's value !!!!!!!!!
        // tagName[attribute='value']
        //WebElement logInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        //WebElement logInButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        //WebElement logInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));


        System.out.println("2 locating using cssSelector using type attribute's value !!!!!!!!!");
        //locating using cssSelector using class attribute's value !!!!!!!!!
        // tagName.classValue
        WebElement logInButton = driver.findElement(By.cssSelector("input.login-btn"));


        String loginButtonTextExpected = "Log In";
        String loginButtonTextActual = logInButton.getAttribute("value");

        System.out.println("loginButtonTextExpected = " + loginButtonTextExpected);
        System.out.println("loginButtonTextActual = " + loginButtonTextActual);

        if(loginButtonTextExpected.equals(loginButtonTextActual)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.close();

        //
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from

    }
}
