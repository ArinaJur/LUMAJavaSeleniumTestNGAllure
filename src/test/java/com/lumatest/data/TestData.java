package com.lumatest.data;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class TestData {
    public static final String BASE_URL = "https://magento.softwaretestingboard.com";
    public static final String BASE_URL_TITLE = "Home Page";

    //NavBar Menu
    public static final By WHATS_NEW_MENU = By.xpath("//nav//span[text()=\"What's New\"]");
    public static final String WHATS_NEW_URL = BASE_URL + "/what-is-new.html";
    public static final String WHATS_NEW_TITLE = "What's New";

    //all others menus

    public static final By SALE_MENU = By.xpath("//nav//span[text()='Sale']");
    public static final String SALE_URL = BASE_URL + "/sale.html";
    public static final String SALE_TITLE = "Sale";

    //Allure.step("SetUp expected results");
    @DataProvider(name = "navigationData")
    public static Object[][] getNavMenuData() {
        return new Object[][] {
                {BASE_URL, WHATS_NEW_MENU, WHATS_NEW_URL, WHATS_NEW_TITLE},
                {BASE_URL, SALE_MENU, SALE_URL, SALE_TITLE}
        };
    }



}
