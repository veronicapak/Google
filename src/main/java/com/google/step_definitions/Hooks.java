package com.google.step_definitions;

import com.google.utilities.ConfigurationReader;
import com.google.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setupScenario(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void teardownScenario(){
        Driver.closeDriver();
    }
}
