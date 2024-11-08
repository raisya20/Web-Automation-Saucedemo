package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.ScenarioTests;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {

    static WebDriver driver;
    static ExtentTest extenTest;
    static ExtentReports reports = new ExtentReports("target/ExtentReport.html");

    @Before
    public void setUp() {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        ScenarioTests[] tests = ScenarioTests.values();
        if (Utils.testCount >= tests.length) {
            Utils.testCount = 0;  // Reset jika mencapai batas
        }
        extenTest= reports.startTest(tests[Utils.testCount].getScenarioTestName());
        Utils.testCount++;
    }

    @AfterStep
    public void getResultTest(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            String screenshotPath = Utils.getScreenshot(driver, scenario.getName()
                    .replace(" ", "_"));
            extenTest.log(LogStatus.FAIL, scenario.getName() + "\n"
                    + extenTest.addScreenCapture(screenshotPath));
        }
    }

    @After
    public void endScenarioTest(){
        reports.endTest(extenTest);
        reports.flush();
    }

    @AfterAll
    public static void finish() {
        Utils.delay(5);
        DriverSingleton.closeObjectInstance();
    }
}
