package org.graphwalker;

import controllers.ClassRosterController;
import helpers.DriverHelper;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import utils.ConsoleLogger;

import static org.graphwalker.LoginTest.dependant;

@GraphWalker(value = "random(edge_coverage(100))")
public class ClassRosterTest extends ExecutionContext implements ClassRoster {

    /*Verifying Display OF ClassRoster Tab*/
    @Override
    public void v_VerifyClassRosterReport() {
        if (dependant) {
            boolean classRoster = ClassRosterController.verifyClassRosterPage();
            DriverHelper.testExecution(classRoster, "Verification Of Class Roster Tab");
        } else {
            ConsoleLogger.SkippedTestCase("Test case : Skipped - Verification Of Class Roster Tab");
        }
    }

    /*Click Class Roster Tab*/
    @Override
    public void e_ClickClassRosterReport() {
        boolean classRoster = ClassRosterController.clickClassRosterTab();
        DriverHelper.testExecution(classRoster);
    }

    //Verifying Filters In ClassRoster Report
    @Override
    public void v_VerifyReportFilter() {
        if (dependant) {
            boolean filters = ClassRosterController.verifyFilersDisplay();
            DriverHelper.testExecution(filters, "Verification Of Filters in ClassRoster Report");
        } else {
            ConsoleLogger.SkippedTestCase("Test case : Skipped - Test Case Passe:Verification Of Filters in ClassRoster Report");
        }
    }

    //Selection Of Filters in CLassRoster Report
    @Override
    public void e_SelectFilter() {
        boolean filterSelection = ClassRosterController.selectClassRosterFilters();
        DriverHelper.testExecution(filterSelection);
    }

    //Verification Of Table Display After Filter Selection
    @Override
    public void v_VerifyTableDisplay() {
        if (dependant) {
            boolean filters = ClassRosterController.verifyTableDisplay();
            DriverHelper.testExecution(filters, "Verification Of Table Display After Filter Selection");
        } else {
            ConsoleLogger.SkippedTestCase("Test case : Skipped - Verification Of Table Display After Filter Selection");
        }
    }

    //Click On Full Screen Button
    @Override
    public void e_ClickFullScreen() {
        boolean fullScreen = ClassRosterController.clickFullScreenButton();
        DriverHelper.testExecution(fullScreen);
    }

    @Override
    public void v_VerifyFullScreenExit() {
        if (dependant) {
            boolean filters = ClassRosterController.verifyFullScreenTable();
            DriverHelper.testExecution(filters, "Verification Of Full Screen Table Display ");
        } else {
            ConsoleLogger.SkippedTestCase("Test case : Skipped- Verification Of Full Screen Table Display");
        }
        if (dependant)
            ClassRosterController.clickExitFullScreen();
    }

}
