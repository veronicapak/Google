package com.google.step_definitions;

import com.google.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Google {
    @Given("user in on the homepage")
    public void user_in_on_the_homepage() {
    }
    @Then("title is {string}")
    public void title_is(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }
}
