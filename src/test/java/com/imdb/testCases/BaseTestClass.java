package com.imdb.testCases;

import com.imdb.pages.AdvanceSearch;
import com.imdb.pages.ScrollDown;
import com.imdb.pages.SearchFilters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import java.time.Duration;

public class BaseTestClass {
    public WebDriver driver;
    public AdvanceSearch search;
    public ScrollDown scroll;
    public SearchFilters filters;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        search = new AdvanceSearch(driver);
        scroll = new ScrollDown(driver);
        filters = new SearchFilters(driver);
    }
    @AfterSuite
    public void cleanUp(){
        driver.quit();
    }
}
