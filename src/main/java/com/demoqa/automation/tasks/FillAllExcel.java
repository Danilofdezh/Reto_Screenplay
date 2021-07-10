package com.demoqa.automation.tasks;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.ui.FormPage;
import com.demoqa.automation.utils.Excel;
import cucumber.api.java.gl.E;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillAllExcel implements Task {
    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,0)).into(FormPage.FIRSTNAME_INPUT),
                Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,1)).into(FormPage.LASTNAME_INPUT),
                Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,2)).into(FormPage.USER_EMAIL_INPUT),
                JavaScriptClick.on(FormPage.GENDER_RADIOBUTTON),
                Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,3)).into(FormPage.MOBILE_NUMBER_INPUT),
                Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,4)).into(FormPage.SUBJECTS_INPUT),
                Enter.keyValues(Keys.ENTER).into(FormPage.SUBJECTS_INPUT),
                JavaScriptClick.on(FormPage.HOBBIES_CHECKBOX),
                Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,5)).into(FormPage.SELECT_PICTURE_BUTTON),
                Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,6)).into(FormPage.CURRENT_ADDRESS_INPUT),
                JavaScriptClick.on(FormPage.STATE_INPUT),
                Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,7)).into(FormPage.STATE_INPUT).thenHit(Keys.ENTER),
                JavaScriptClick.on(FormPage.STATE_INPUT),
                Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,8)).into(FormPage.CITY_INPUT).thenHit(Keys.ENTER),
                JavaScriptClick.on(FormPage.CITY_INPUT),
                JavaScriptClick.on(FormPage.SUBMIT_BUTTON)


        );



    }


    public static FillAllExcel dateExcel (){
        return instrumented(FillAllExcel.class);
    }
    }



