package com.lumatest.test;

import com.lumatest.base.BaseTest;
import com.lumatest.data.TestData;
import com.lumatest.pages.HomePage;
import com.lumatest.pages.ProductPage;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest {

    @Test
    public void testProduct() {
        Allure.step("Open Base URL.");
        getDriver().get(TestData.BASE_URL);

        ProductPage productPage = new HomePage(getDriver())
                .clickGearTopMenu()
                .clickBagsSideMenu()
                .clickProductImg(TestData.DRIVEN_BACKPACK_PRODUCT_NAME);

        final String productName = productPage.getProductNameText();
        final String breadcrumbsMenuText = productPage.getBreadcrumbsMenuText();

        Allure.step(
                "Verify actual '" + productName + "' equals to '" + TestData.DRIVEN_BACKPACK_PRODUCT_NAME + "'"
        );
        Assert.assertEquals(productName, TestData.DRIVEN_BACKPACK_PRODUCT_NAME);

        Allure.step(
                "Verify actual '" + breadcrumbsMenuText + "' equals to '" + TestData.DRIVEN_BACKPACK_PRODUCT_PAGE_BREADCRUMBS_MENU + "'"
        );
        Assert.assertEquals(breadcrumbsMenuText, TestData.DRIVEN_BACKPACK_PRODUCT_PAGE_BREADCRUMBS_MENU);
    }
}
