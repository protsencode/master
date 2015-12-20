package es.goeuro.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Created by protsencode on 12/19/15.
 */

public class HomePage {
    public String BOOKINGCOM_CHECKBOX = ".hotel-checkbox__booking";
    public String BUTTON_SEARCH = "#search-form__submit-btn";
    public String TITLE = "Tus billetes baratos de tren, AVE, autobús y avión online | GoEuro";
    public String BASIC_URL = "http://www.goeuro.es/";
    public String FROM_FILTER = "#from_filter";
    public String TO_FILTER = "#to_filter";
    public String PLACE_FROM = "madrid";
    public String PLACE_TO = "barcelona";


    public void waitForElement(WebDriver driver, String cssSelector, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
    }

    public void click(WebDriver driver, String cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
        driver.findElement(By.cssSelector(cssSelector)).click();
    }

    public void fillField(WebDriver driver, String cssSelector, String text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
        driver.findElement(By.cssSelector(cssSelector)).sendKeys(text);
    }
}