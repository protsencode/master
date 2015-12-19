package es.goeuro.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.apache.log4j.Logger;

/**
 * Created by protsencode on 12/19/15.
 */
public class Test1HomePage extends TestBase {
    private static final Logger log = Logger.getLogger(Test1HomePage.class);
    @Test
    public void correctUrl() {
        log.info("Test 1 Checks that BASIC_URL is correct");
        try {
            String expectedUrl = driver.getCurrentUrl();
            Assert.assertEquals(expectedUrl, page.BASIC_URL);
            log.info("Test Passed");
        }catch (AssertionError ar){
            log.error(ar);
            Assert.fail();
        }
    }

    @Test
    public void correctTitle() {
        log.info("Test 2 Checks that TITLE is correct");
        try {
            String expectedTitle = driver.getTitle();
            Assert.assertEquals(expectedTitle, page.TITLE);
            log.info("Test Passed");
        } catch (AssertionError ar){
            log.error(ar);
            Assert.fail();
        }
    }
}
