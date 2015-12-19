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
 * Created by dprosenko on 30.01.15.
 */
public class SearchPage extends Page{

    public String SORTING_BY_PRICE = "(//*[@id='head_line']//a)[2]";
    public String ADVERTISING_1 = "(//*[@type='checkbox'])[1]";
    public String ADVERTISING_2 = "(//*[@type='checkbox'])[2]";
    public String ADVERTISING_3 = "(//*[@type='checkbox'])[3]";
    public String SHOW_SELECTED_xp = ".//*[@id='show_selected_a']";
    public String TITLE_result ="SS.lv Электротехника. Результат поиска";
    public String PRICE_TABLE = "//*[@c='1']";
    public String URLr = "ru/electronics/search-result/?q=Computer";


    public String checkinAdvertisingAndGetItsId(WebDriver driver, String xPath) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
        driver.findElement(By.xpath(xPath)).click();
        return driver.findElement(By.xpath(xPath)).getAttribute("id");
     }

    public String getTextFromAdv(WebDriver driver, String attr) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='tr_"+attr.substring(1)+"']/td[3]")));
        return  driver.findElement(By.xpath(".//*[@id='tr_"+attr.substring(1)+"']/td[3]")).getText();
      }

    public List<Double> getDisplayedList(WebDriver driver, String price_table) {
        List<Double> prices = new ArrayList<Double>();
        List<WebElement> elements = driver.findElements(By.xpath(price_table));
        for (WebElement i : elements) {
            String str = i.getText();
            String sPrice = str.substring(0, str.length() - 2);
            double price = Double.parseDouble(sPrice);
            prices.add(price);
         }
        return prices;
    }

    public List<Double> getSortedList(WebDriver driver, String price_table) {
            List<Double> prices = new ArrayList<Double>();
            List<WebElement> elements = driver.findElements(By.xpath(price_table));
            for (WebElement i : elements) {
                String str = i.getText();
                String sPrice = str.substring(0, str.length() - 2);
                double price = Double.parseDouble(sPrice);
                prices.add(price);
            }
            Collections.sort(prices);
            return prices;
        }

}
