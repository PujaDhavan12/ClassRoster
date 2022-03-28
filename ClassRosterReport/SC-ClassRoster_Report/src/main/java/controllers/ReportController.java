package controllers;

import helpers.DriverHelper;
import pom.LaunchpadPage;
import utils.ConsoleLogger;

@SuppressWarnings({"squid:S1118"})
public class ReportController {

    public static boolean reports = false;
    private static LaunchpadPage launchpadPage = new LaunchpadPage();

    //Click on Reports Tab
    public static boolean clickReports() {
        try {
            //click on LaunchPad
            DriverHelper.clickXpath(launchpadPage.getLaunchPadMenu());
            DriverHelper.waitUntilLoaderInvisible();
            //click on Report
            DriverHelper.clickXpath(launchpadPage.getReport());
            DriverHelper.waitUntilLoaderInvisible();
            reports = true;
        } catch (Exception e) {
            ConsoleLogger.DebugLog("Exception Handled for clickReports method");
        }
        return reports;
    }

}