package com.lumatest.model;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

abstract class SideMenu extends BreadcrumbsMenu {

    @FindBy(linkText = "Bags")
    private WebElement bagsSideMenu;

    protected SideMenu(WebDriver driver) {
        super(driver);
    }

    @Step("Click Bags Side Menu.")
    public BagsPage clickBagsSideMenu() {
        bagsSideMenu.click();

        return new BagsPage(getDriver());
    }
}
