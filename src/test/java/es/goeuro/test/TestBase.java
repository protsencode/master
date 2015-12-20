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
    SearchPage search = new SearchPage();

    @BeforeSuite
    public void loadThisWebsite() {
        driver.manage().window().maximize();
        driver.get(page.BASIC_URL);
    }

    @AfterSuite
    public void closeWebsite() {
        driver.quit();
    }

}

