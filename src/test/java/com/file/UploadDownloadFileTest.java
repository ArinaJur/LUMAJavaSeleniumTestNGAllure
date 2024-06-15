package com.file;

import com.lumatest.utils.DriverUtils;
import com.lumatest.utils.ReportUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.awt.*;
import java.io.File;

public class UploadDownloadFileTest {
  private WebDriver driver;
  private final String chrome = "chrome";

  @Parameters(chrome)
  @BeforeMethod()
  protected void setupDriver(@Optional(chrome) String browser,  ITestResult result) {
    Reporter.log("______________________________________________________________________", true);

    if (browser.equalsIgnoreCase("chrome")) {
      WebDriverManager.chromedriver().setup();
    }

    Reporter.log("RUN " + result.getMethod().getMethodName(), true);

    this.driver = DriverUtils.createDriver(browser, this.driver);

    if (this.driver == null) {
      System.exit(1);
    }

    Reporter.log("INFO: " + browser.toUpperCase() + " driver created.", true);
  }

  @Test
  public void testUploadFile() throws InterruptedException {
    final String fileName = "image.jpg";
    File file = new File("src/test/resources/" + fileName);

    driver.get("https://blueimp.github.io/jQuery-File-Upload/");

    WebElement addFile = driver.findElement(By.xpath(".//input[@type='file']"));
    addFile.sendKeys(file.getAbsolutePath());

    Thread.sleep(5000);
    String actualFileToUploadName = driver.findElement(By.xpath("//p[@class = 'name']")).getText();

    Assert.assertEquals(actualFileToUploadName, fileName);

    driver.findElement(By.xpath("//button//span[text()='Start upload']")).click();
    Thread.sleep(3000);

    String actualFileUploadedName = driver.findElement(By.xpath("//p[@class = 'name']")).getText();

    Assert.assertEquals(actualFileUploadedName, fileName);

    WebElement deleteButton = driver.findElement(By.xpath("//button//span[text()='Delete']"));

    Assert.assertTrue(deleteButton.isDisplayed());
  }

  @Test
  public void fileDownload() throws AWTException, InterruptedException {

    driver.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
    Thread.sleep(2000);
    WebElement downloadButton = driver.findElement(By.xpath(".//a[text()='chromedriver_win32.zip']"));
    downloadButton.click();

    Thread.sleep(7000);
  }

  @Parameters(chrome)
  @AfterMethod(alwaysRun = true)
  protected void tearDown(@Optional(chrome) String browser, ITestResult result) {
    Reporter.log(result.getMethod().getMethodName() + ": " + ReportUtils.getTestStatus(result),
      true);

    if (this.driver != null) {
      this.driver.quit();
      Reporter.log("INFO: " + browser.toUpperCase() + " driver closed.", true);

      this.driver = null;
    } else {
      Reporter.log("INFO: Driver is null.", true);
    }
  }
}
