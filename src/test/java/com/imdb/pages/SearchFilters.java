package com.imdb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchFilters {
    WebDriver driver;
    public SearchFilters(WebDriver driver){
        this.driver=driver;
    }

    private By  imdbRatings = By.xpath("//div[text()='IMDb ratings']");
    private By  minRating = By.xpath("//input[@name='imdb-ratings-max-input']");
    private By  maxRating = By.xpath("//input[@name='imdb-ratings-min-input']");
    private By genre = By.xpath("//div[text()='Genre']");
    private By genreName = By.xpath("//button[@data-testid='test-chip-id-Comedy']");
    private By filterBtn = By.xpath("//span[text()='See results']");
    private By img = By.xpath("//div[@id='inline20_responsive_wrapper']");

    public void filterBy(String min,String max) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(imdbRatings)));
        Thread.sleep(2000);
       wait.until(ExpectedConditions.elementToBeClickable(imdbRatings)).click();
        //driver.findElement(imdbRatings).click()
        driver.findElement(minRating).sendKeys(min);
        driver.findElement(maxRating).sendKeys(max);
        driver.findElement(genre).click();
        driver.findElement(genreName).click();
        driver.findElement(filterBtn).click();


    }



}
