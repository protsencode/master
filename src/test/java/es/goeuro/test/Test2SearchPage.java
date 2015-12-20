package es.goeuro.test;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by protsencode on 12/19/15.
 */

public class Test2SearchPage extends TestBase {

    @Test(priority = 3)
    public void searchPageIsOpened() {
        log.info("Test 3 starts: Checks that Search Page is opened");
        page.fillField(driver, page.FROM_FILTER, page.PLACE_FROM);
        page.fillField(driver, page.TO_FILTER, page.PLACE_TO);
        page.click(driver, page.BOOKINGCOM_CHECKBOX);
        page.click(driver, page.BUTTON_SEARCH);
        search.waitForElement(driver, search.SUMMARY_TABLE, 10);
        String expectedUrl = driver.getCurrentUrl();
        try {
            Assert.assertTrue(expectedUrl.contains(search.BASIC_URL + search.SEARCH_URL));
            log.info("Test Passed");
        } catch (AssertionError ar) {
            log.error(ar);
            Assert.fail();
        }
    }

    @Test(priority = 4)
    public void sortingByPriceIsWorkedForTrain(){
        log.info("Test 4 starts: Checks that Sorting by Price for Trains works good");
        List<Double> displayedPrices = search.getPricesFromAllPages(driver, search.PRICE_TABLE_TRAIN, search.NEXT_BUTTON_TRAIN);
        List<Double> sortedPrices = search.getSortedList(displayedPrices);
        log.info(displayedPrices);
        log.info(sortedPrices);
        try {
            Assert.assertTrue(displayedPrices.equals(sortedPrices));
            log.info("Test Passed");
        } catch (AssertionError ar) {
            log.error(ar);
            Assert.fail();
        }
    }

    @Test(priority = 5)
    public void sortingByPriceIsWorkedForFlight() {
        log.info("Test 4 starts: Checks that Sorting by Price for Flight works good");
        search.click(driver, search.FLIGHT_TAB);
        List<Double> displayedPrices = search.getPricesFromAllPages(driver, search.PRICE_TABLE_FLIGHT, search.NEXT_BUTTON_FLIGHT);
        List<Double> sortedPrices = search.getSortedList(displayedPrices);
        log.info(displayedPrices);
        log.info(sortedPrices);
        try {
            Assert.assertTrue(displayedPrices.equals(sortedPrices));
            log.info("Test Passed");
        } catch (AssertionError ar) {
            log.error(ar);
            Assert.fail();
        }
    }

    @Test(priority = 6)
    public void sortingByPriceIsWorkedForBus(){
        log.info("Test 4 starts: Checks that Sorting by Price for Bus works good");
        search.click(driver, search.BUS_TAB);
        List<Double> displayedPrices = search.getPricesFromAllPages(driver, search.PRICE_TABLE_BUS, search.NEXT_BUTTON_BUS);
        List<Double> sortedPrices = search.getSortedList(displayedPrices);
        log.info(displayedPrices);
        log.info(sortedPrices);
        try {
            Assert.assertTrue(displayedPrices.equals(sortedPrices));
            log.info("Test Passed");
        } catch (AssertionError ar) {
            log.error(ar);
            Assert.fail();
        }
    }



        private static final Logger log = Logger.getLogger(Test2SearchPage.class);
}

