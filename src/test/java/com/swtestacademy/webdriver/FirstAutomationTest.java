package com.swtestacademy.webdriver;

//Info: When you write your code IntelliJ automatically adds required classes
//Also you can select and add required classes by pressing ALT+Enter then select related class
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ONUR BASKIRT on 26.08.2015.
 */
public class FirstAutomationTest {
    //We should add @Test annotation that JUnit will run below method
    @Test
    //Start to write our test method. It should ends with "Test"
    public void firefoxTest(){
        System.setProperty("webdriver.gecko.driver", "D:\\Personal Data\\eclipse workspace\\lib\\geckodriver\\geckodriver-v0.16.1-win64\\geckodriver.exe");
        //step 1
        WebDriver driver = new FirefoxDriver();
//        //step 2 - navigate
//        driver.navigate().to("https://www.teknosa.com/");
//        //step 3 - assertion
//        Assert.assertEquals("Title check failed!", "Teknosa Alışveriş Sitesi - Herkes İçin Teknoloji", driver.getTitle());

        String baseUrl =   "http://demo.guru99.com/selenium/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        driver.get(baseUrl);

        actualTitle = driver.getTitle();

        if(actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test Failed");
        }

        //step 4 - close driver
        driver.close();
        driver.quit();
    }

}