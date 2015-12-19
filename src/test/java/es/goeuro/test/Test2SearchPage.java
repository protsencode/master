//package es.goeuro.test;
//
///**
// * Created by protsencode on 12/19/15.
// */
//
//public class Test2SearchPage extends TestBase {
////
//    @Test(priority = 1)//Checks that BASIC_URL is correct"
//    public void correctUrl() {
//        String expectedUrl = driver.getCurrentUrl();
//        Assert.assertEquals(page.BASIC_URL, expectedUrl);
//    }
//
//
//    @Test(priority = 2) //Checks that TITLE is correct
//    public void correctTitle() {
//        String expectedTitle = driver.getTitle();
//        Assert.assertEquals(page.TITLE, expectedTitle);
//    }

//    @Test(priority = 3) //Checks that site switched to russian
//    public void switchToRussian() {
//        page.click_xp(driver, page.RU_xp);
//        String expectedUrl = driver.getCurrentUrl();
//        String expectedTitle = driver.getTitle();
//        Assert.assertEquals(page.TITLE_ru, expectedTitle);
//        Assert.assertEquals(page.BASIC_URL + "ru/", expectedUrl);
//    }

//    @Test(priority = 4) //Checks that page 'electronics' is opened
//    public void elctrPageIsOpen() {
//        page.click_xp(driver, page.ELECTRONICS_LINK_xp);
//        //page 'electronics' is opened
//        ElectrPage elpage = new ElectrPage(); // new object for page electronics
//
//        elpage.waitForElement_xp(driver, elpage.FOOTER, 10);
//        String expectedUrl = driver.getCurrentUrl();
//        String expectedTitle = driver.getTitle();
//        Assert.assertEquals(elpage.TITLE_electr, expectedTitle);
//        Assert.assertEquals(elpage.BASIC_URL + elpage.URLe, expectedUrl);
//    }
//
//    @Test(priority = 5) //Checks that page 'Search' is opened
//    public void searchPageIsOpen() {
//        ResultPage resultPage = new ResultPage();
//        elPage.click_xp(driver, elPage.SEARCH_LINK_xp);
//        SearchPage search = new SearchPage();
//        search.waitForElement_xp(driver, search.FOOTER, 10);
//        String expectedUrl = driver.getCurrentUrl();
//        String expectedTitle = driver.getTitle();
//        Assert.assertEquals(search.TITLE_search, expectedTitle);
//        Assert.assertEquals(search.BASIC_URL + search.URLs, expectedUrl);
//    }
//
//    @Test(priority = 6) //Page 'Result' opens after searching
//    public void resultPageIsOpen() {
//        SearchPage search = new SearchPage();
//        search.fillField(driver, search.SEARCH_INPUT_xp, search.SEARCH_TEXT);
//        search.fillField(driver, search.MIN_INPUT_xp, "0");
//        search.fillField(driver, search.MAX_INPUT_xp, "1000");
//        search.click_xp(driver, search.EMPTY_SPACE);
//        search.click_xp(driver, search.BUTTON_SEARCH);
//
//        ResultPage result = new ResultPage();
//        result.waitForElement_xp(driver, result.FOOTER, 10);
//        String expectedUrl = driver.getCurrentUrl();
//        String expectedTitle = driver.getTitle();
//        Assert.assertEquals(result.TITLE_result, expectedTitle);
//        Assert.assertEquals(result.BASIC_URL + result.URLr, expectedUrl);
//    }

//    @Test(priority = 7) //Sorting by price woks good
//    public void sortingIsWorked() {
//        ResultPage result = new ResultPage();
//        result.click_xp(driver, result.SORTING_BY_PRICE);
//        List<Double> displayedPrices = result.getDisplayedList(driver, result.PRICE_TABLE);
//        List<Double> sortedPrices = result.getSortedList(driver, result.PRICE_TABLE);
//        // System.out.println(sortedPrices); //from verifiing via console
//        // System.out.println(displayedPrices);
//        Assert.assertTrue(displayedPrices.equals(sortedPrices));
//    }


//    @Test(priority = 8) //Show selected - functionality
//    public void showSelected() {
//        ResultPage result = new ResultPage();
//        String ID1 = result.checkinAdvertisingAndGetItsId(driver, result.ADVERTISING_1);
//        String ID2 = result.checkinAdvertisingAndGetItsId(driver, result.ADVERTISING_2);
//        String ID3 = result.checkinAdvertisingAndGetItsId(driver, result.ADVERTISING_3);
//
//        String EXPECTED_ADV_TEXT_1 = result.getTextFromAdv(driver, ID1);
//        String EXPECTED_ADV_TEXT_2 = result.getTextFromAdv(driver, ID2);
//        String EXPECTED_ADV_TEXT_3 = result.getTextFromAdv(driver, ID3);
//
//        result.click_xp(driver, result.SHOW_SELECTED_xp);
//
//        ShowSelected selected = new ShowSelected();
//
//        String expectedUrl = driver.getCurrentUrl();
//        String expectedTitle = driver.getTitle();
//        Assert.assertEquals(selected.TITLE_ss, expectedTitle);
//        Assert.assertTrue(expectedUrl.contains(selected.BASIC_URL + selected.URLss));
//
//
//        String ACTUAL_ADV_TEXT_1 = selected.getTextFromAdv(driver, ID1);
//        String ACTUAL_ADV_TEXT_2 = selected.getTextFromAdv(driver, ID2);
//        String ACTUAL_ADV_TEXT_3 = selected.getTextFromAdv(driver, ID3);
//
//        Assert.assertTrue(EXPECTED_ADV_TEXT_1.contains(ACTUAL_ADV_TEXT_1));
//        Assert.assertTrue(EXPECTED_ADV_TEXT_2.contains(ACTUAL_ADV_TEXT_2));
//        Assert.assertTrue(EXPECTED_ADV_TEXT_3.contains(ACTUAL_ADV_TEXT_3));
//    }

//}

