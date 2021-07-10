package com.demoqa.automation.tasks;
import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.ui.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class FillAllFaker implements Task {
    DataInjection dataInjection = new DataInjection();
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(dataInjection.getFirstName()).into(FormPage.FIRSTNAME_INPUT));
        actor.attemptsTo(Enter.theValue(dataInjection.getLastName()).into(FormPage.LASTNAME_INPUT));
        actor.attemptsTo(Enter.theValue(dataInjection.getEmail()).into(FormPage.USER_EMAIL_INPUT));
        actor.attemptsTo(Click.on(FormPage.GENDER_RADIOBUTTON));
        actor.attemptsTo(Enter.theValue(dataInjection.getMobileNumber()).into(FormPage.MOBILE_NUMBER_INPUT));
        Hit.the(Keys.CONTROL,Keys.BACK_SPACE,Keys.BACK_SPACE).into(FormPage.DATE_OF_BIRTH_INPUT);
        actor.attemptsTo(Enter.keyValues("Sep 1990").into(FormPage.DATE_OF_BIRTH_INPUT));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(FormPage.DATE_OF_BIRTH_INPUT));
        actor.attemptsTo(Enter.keyValues(dataInjection.getSubjects()).into(FormPage.SUBJECTS_INPUT));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(FormPage.SUBJECTS_INPUT));
        actor.attemptsTo(JavaScriptClick.on(FormPage.HOBBIES_CHECKBOX));
        actor.wasAbleTo(Enter.keyValues(dataInjection.getSelectPicture()).into(FormPage.SELECT_PICTURE_BUTTON));
        actor.attemptsTo(Enter.theValue(dataInjection.getCurrentAddress()).into(FormPage.CURRENT_ADDRESS_INPUT));
        actor.attemptsTo(Enter.theValue(dataInjection.getState()).into(FormPage.STATE_INPUT));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(FormPage.STATE_INPUT));
        actor.attemptsTo(Enter.theValue(dataInjection.getCity()).into(FormPage.CITY_INPUT));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(FormPage.CITY_INPUT));
        //actor.attemptsTo(Click.on(FormPage.SUBMIT_BUTTON));
        JavaScriptClick.on(FormPage.SUBMIT_BUTTON);

    }

    public static FillAllFaker dateFaker (){
        return instrumented(FillAllFaker.class);
        }

    }

