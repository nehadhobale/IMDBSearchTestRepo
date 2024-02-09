package com.imdb.testCases;

import com.imdb.utility.Utils;
import org.testng.annotations.Test;

import java.util.Properties;

public class IMDBSearchTest extends BaseTestClass {
    Properties properties;

    IMDBSearchTest() {
        this.properties = Utils.getProperties("IMDBSearchTest");
    }

    @Test
    public void verify_IMDBSearch_functionality() throws InterruptedException {
        driver.get(properties.getProperty("myUrl"));
        driver.manage().window().maximize();
        search.AdvSearch();
        scroll.scrollUpDown();
        filters.filterBy(properties.getProperty("minRating"), properties.getProperty("maxRating"));
    }
}
