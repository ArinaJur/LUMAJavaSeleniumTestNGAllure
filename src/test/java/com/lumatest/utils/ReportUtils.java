package com.lumatest.utils;

import org.testng.ITestResult;

public class ReportUtils {
  public static String getTestStatus(ITestResult result) {
    if (result.getStatus() == 1) {
      return "PASS";
    } else if (result.getStatus() == 2) {
      return "FAIL";
    }

    return "UNKNOWN";
  }
}
