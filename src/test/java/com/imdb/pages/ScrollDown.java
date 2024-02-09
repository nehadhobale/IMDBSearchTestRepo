package com.imdb.pages;

import org.openqa.selenium.*;

public class ScrollDown {
    WebDriver driver;
    public ScrollDown(WebDriver driver){
        this.driver=driver;
    }

    private By stopText = By.xpath("//div[@class='sc-ff93f052-1 gdDCDL']");

    public void scrollUpDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(stopText);
        js.executeScript("arguments[0].scrollIntoView();",Element);


    }
}
