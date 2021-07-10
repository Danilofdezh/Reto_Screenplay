package com.demoqa.automation.tasks;

import com.demoqa.automation.ui.FormPage;
import com.demoqa.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillAllProperties implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.configProperties();
        actor.attemptsTo(
                Enter.keyValues(SpecialMethods.properties.getProperty("firstname")).into(FormPage.FIRSTNAME_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("lastname")).into(FormPage.LASTNAME_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("email")).into(FormPage.USER_EMAIL_INPUT),
                JavaScriptClick.on(FormPage.GENDER_RADIOBUTTON),
                Enter.keyValues(SpecialMethods.properties.getProperty("mobile")).into(FormPage.MOBILE_NUMBER_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("birthday")).into(FormPage.DATE_OF_BIRTH_INPUT),
                Enter.keyValues(Keys.ENTER).into(FormPage.DATE_OF_BIRTH_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("subjects")).into(FormPage.SUBJECTS_INPUT),
                Enter.keyValues(Keys.ENTER).into(FormPage.SUBJECTS_INPUT),
                JavaScriptClick.on(FormPage.HOBBIES_CHECKBOX),
                //Enter.keyValues(SpecialMethods.properties.getProperty("picture")).into(FormPage.SELECT_PICTURE_BUTTON),
                Enter.keyValues(SpecialMethods.properties.getProperty("currentAddress")).into(FormPage.CURRENT_ADDRESS_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("state"), Keys.ENTER).into(FormPage.STATE_INPUT),
                Enter.keyValues(Keys.ENTER).into(FormPage.STATE_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("city"),Keys.ENTER).into(FormPage.CITY_INPUT),
                Enter.keyValues(Keys.ENTER).into(FormPage.CITY_INPUT),
                JavaScriptClick.on(FormPage.SUBMIT_BUTTON)
        );

    }
    public static FillAllProperties dateProperties (){
        return instrumented(FillAllProperties.class);

    }
}
