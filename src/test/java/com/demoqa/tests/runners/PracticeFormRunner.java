package com.demoqa.tests.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/practiceForm.feature",
        glue = "com.demoqa.tests.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@testFaker or @testProperties or @testExcel")



public class PracticeFormRunner {
}
