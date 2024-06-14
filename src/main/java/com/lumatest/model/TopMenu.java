package com.lumatest.model;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

abstract class TopMenu extends BasePage {

  @FindBy(linkText = "Gear")
  private WebElement gearTopMenu;

  protected TopMenu(WebDriver driver) {
    super(driver);
  }

  @Step("Click Gear Top Menu.")
  public GearPage clickGearTopMenu() {
    gearTopMenu.click();

    return new GearPage(getDriver());
  }
}
