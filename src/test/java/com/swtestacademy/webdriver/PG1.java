package com.swtestacademy.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by PHUONG NGUYEN on 8/14/2017.
 */
public class PG1 {
    @Test
    public void main(){
        //declare and instantian objects/variables
        System.setProperty("webdriver.gecko.driver", "D:\\Personal Data\\eclipse workspace\\lib\\geckodriver\\geckodriver-v0.16.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

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

        driver.close();

    }
}
