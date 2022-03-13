package com.saucedemo.cucumber;

import com.cucumber.listener.Reporter;
import com.saucedemo.propertyreader.Property_Reader;
import com.saucedemo.utility.Util_Class;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


public class Hooks_Class extends Util_Class {

    //Hooks Helps to control the flow of the programme and optimize the lines of code.
    @Before
    public void setUp() {
        selectBrowser(Property_Reader.getInstance().getProperty("browser"));

    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShortpath = Util_Class.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShortpath);
                //IOException is a Checked exception
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        closeBrowser();
    }
}
