package es.goeuro.test;

import es.goeuro.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by protsencode on 12/19/15.
 */

abstract public class TestBase {
    WebDriver driver = new FirefoxDriver();
    HomePage page = new HomePage();


    @BeforeSuite
    public void loadThisWebsite() {
        driver.manage().window().maximize();
        driver.get("http://www.google.com");

    }

    @AfterSuite
    public void closeWebsite() {
        driver.quit();
    }

}

