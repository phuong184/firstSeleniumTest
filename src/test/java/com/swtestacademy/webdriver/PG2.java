package com.swtestacademy.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by PHUONG NGUYEN on 8/14/2017.
 */
public class PG2 {
    @Test
    public void main(){
        //declare and instantian objects/variables
        System.setProperty("webdriver.gecko.driver", "D:\\Personal Data\\eclipse workspace\\lib\\geckodriver\\geckodriver-v0.16.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        String baseUrl =   "http://facebook.com";
        String tagName = "";

        driver.get(baseUrl);

        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);

        driver.close();

    }
}
