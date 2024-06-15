package com.lumatest.data;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class TestData {
  public static final String BASE_URL = "https://magento.softwaretestingboard.com";
  public static final String BASE_URL_TITLE = "Home Page";

  public static class NavMenuData {
    public static final By WHATS_NEW_MENU = By.xpath("//nav//span[text()=\"What's New\"]");
    public static final String WHATS_NEW_URL = BASE_URL + "/what-is-new.html";
    public static final String WHATS_NEW_TITLE = "What's New";
  }

  //all others menus

  public static final By SALE_MENU = By.xpath("//nav//span[text()='Sale']");
  public static final String SALE_URL = BASE_URL + "/sale.html";
  public static final String SALE_TITLE = "Sale";

  @DataProvider(name = "navigationData")
  public static Object[][] getNavMenuData() {
    return new Object[][]{
      {BASE_URL, NavMenuData.WHATS_NEW_MENU, NavMenuData.WHATS_NEW_URL, NavMenuData.WHATS_NEW_TITLE},
      {BASE_URL, SALE_MENU, SALE_URL, SALE_TITLE}
    };
  }

  //ProductPage
  public static final String DRIVEN_BACKPACK_PRODUCT_URL = BASE_URL + "/driven-backpack.html";
  public static final String DRIVEN_BACKPACK_PRODUCT_NAME = "Driven Backpack";
  public static final String DRIVEN_BACKPACK_PRODUCT_PAGE_BREADCRUMBS_MENU = "Home Gear Bags Driven Backpack";
}
