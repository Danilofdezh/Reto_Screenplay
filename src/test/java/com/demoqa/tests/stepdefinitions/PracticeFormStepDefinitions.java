package com.demoqa.tests.stepdefinitions;

import com.demoqa.automation.interactions.OpenTheBrowser;
import com.demoqa.automation.tasks.FillAllExcel;
import com.demoqa.automation.tasks.FillAllFaker;
import com.demoqa.automation.tasks.FillAllProperties;
import com.demoqa.automation.ui.FormPage;
import com.demoqa.automation.utils.SpecialMethods;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PracticeFormStepDefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Danilo").can(BrowseTheWeb.with(driver));

        }

    //Faker
    @Given("^that a web user wants to practice form in demoqa$")
    public void thatAWebUserWantsToPracticeFormInDemoqa() {
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(FormPage.URL));
    }

    @When("^he fills all the requested fields in form section$")
    public void heFillsAllTheRequestedFieldsInFormSection() {
        theActorInTheSpotlight().attemptsTo(FillAllFaker.dateFaker());

    }

    @Then("^The information is displayed and a screenshot is taken\\.$")
    public void theInformationIsDisplayedAndAScreenshotIsTaken() {
        SpecialMethods.ScreenShotPage(driver);

    }


    //Properties
    @When("^he fills all the requested fields in form section with properties$")
    public void heFillsAllTheRequestedFieldsInFormSectionWithProperties() {
        theActorInTheSpotlight().attemptsTo(FillAllProperties.dateProperties());

    }

    @Then("^The information is displayed and a screenshot is taken with properties$")
    public void theInformationIsDisplayedAndAScreenshotIsTakenWithProper() {
        SpecialMethods.ScreenShotPage(driver);
    }

    //Excel
    @When("^he fills all the requested fields in form section with excel$")
    public void heFillsAllTheRequestedFieldsInFormSectionWithExcel() {
        theActorInTheSpotlight().attemptsTo(FillAllExcel.dateExcel());

    }

    @Then("^The information is displayed and a screenshot is taken with excel$")
    public void theInformationIsDisplayedAndAScreenshotIsTakenWithExcel() {
        SpecialMethods.ScreenShotPage(driver);
    }

}
