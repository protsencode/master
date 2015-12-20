package es.goeuro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Created by protsencode on 12/19/15.
 */
public class SearchPage extends HomePage{


    public String BUS_TAB = "#tab_bus" ;
    public String FLIGHT_TAB = "#tab_flight";
    public String SUMMARY_TABLE = "#summary_table";
    public String NEXT_BUTTON_TRAIN = "#results-train .next>a";
    public String NEXT_BUTTON_FLIGHT = "#results-flight .next>a";
    public String NEXT_BUTTON_BUS = "#results-bus .next>a";
    public String PRICE_TABLE_TRAIN = "#results-train .price-no";
    public String PRICE_TABLE_FLIGHT = "#results-flight .price-no";
    public String PRICE_TABLE_BUS = "#results-bus .price-no";
    public String SEARCH_URL = "search";


    public void waitUntilElementDissapear(WebDriver driver, String cssSelector, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        WebElement element = driver.findElement(By.cssSelector(cssSelector));
        wait.until(ExpectedConditions.stalenessOf(element));
    }

    public Boolean isPresent(WebDriver driver, String css){
        return driver.findElements(By.cssSelector(css)).size() > 0;
    }

    public List<Double> getPricesFromAllPages(WebDriver driver, String price_table, String nextButton){
        List<Double> all_prices = new ArrayList<Double>();
        boolean next;
        do {
            all_prices.addAll(getDisplayedList(driver, price_table));
            if(isPresent(driver, nextButton)){
              next = true;
                waitForElement(driver, nextButton,10);
                click(driver,nextButton);
                waitUntilElementDissapear(driver,price_table,10);
                } else {next = false;}
        }while(next);
        return all_prices;
    }


    public List<Double> getDisplayedList(WebDriver driver, String price_table) {
        List<Double> prices = new ArrayList<Double>();
        waitForElement(driver, price_table,10);
        List<WebElement> elements = driver.findElements(By.cssSelector(price_table));
        for (WebElement i : elements) {
            String str = i.getText();
            String sPrice = str.replace("€","").replace(",","");
            double price = Double.parseDouble(sPrice);
            prices.add(price);
         }
        return prices;
    }

    public List<Double> getSortedList(List<Double> list) {
        List<Double> sorted_prices = new ArrayList<Double>();
        sorted_prices.addAll(list);
        Collections.sort(sorted_prices);
        return sorted_prices;
    }



}

