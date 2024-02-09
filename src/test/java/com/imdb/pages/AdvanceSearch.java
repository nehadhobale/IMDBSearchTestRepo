package com.imdb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvanceSearch {
    WebDriver driver;
    public AdvanceSearch(WebDriver driver){
        this.driver=driver;
    }

    private By allSearch = By.xpath("(//span[text()='All'])[1]");
    private By advanceSearch = By.xpath("//span[text()='Advanced Search']");
    public void AdvSearch(){
        driver.findElement(allSearch).click();
        driver.findElement(advanceSearch).click();
    }
}
