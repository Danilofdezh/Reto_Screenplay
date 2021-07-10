package com.demoqa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {

    public static String URL = "https://demoqa.com/automation-practice-form";

    public static final Target FIRSTNAME_INPUT = Target.the("").located(By.id("firstName"));
    public static final Target LASTNAME_INPUT = Target.the("").located(By.id("lastName"));
    public static final Target USER_EMAIL_INPUT = Target.the("").located(By.id("userEmail"));
    public static final Target GENDER_RADIOBUTTON = Target.the("").located(By.xpath("//label[@for='gender-radio-1']"));
    public static final Target MOBILE_NUMBER_INPUT = Target.the("").located(By.id("userNumber"));
    public static final Target DATE_OF_BIRTH_INPUT = Target.the("").located(By.id("dateOfBirthInput"));
    //public static final Target MONTH_OPTION = Target.the("").located(By.xpath("//*[@value='0' and text()='January']"));
    //public static final Target YEAR_OPTION = Target.the("").located(By.xpath("//*[@value='1993' and text()='1993']"));
    //public static final Target DAY_OPTION = Target.the("").located(By.xpath("//*[@class='react-datepicker__day react-datepicker__day--008' and text()='8']"));
    public static final Target SUBJECTS_INPUT = Target.the("").located(By.id("subjectsInput"));
    public static final Target HOBBIES_CHECKBOX = Target.the("").located(By.xpath("//label[@for='hobbies-checkbox-1']"));
    public static final Target SELECT_PICTURE_BUTTON = Target.the("").located(By.id("uploadPicture"));
    public static final Target CURRENT_ADDRESS_INPUT = Target.the("").located(By.id("currentAddress"));
    public static final Target STATE_INPUT = Target.the("").located(By.id("react-select-3-input"));
    public static final Target CITY_INPUT = Target.the("").located(By.id("react-select-4-input"));
    //public static final Target SUBMIT_BUTTON = Target.the("").located(By.id("submit"));
    //public static final Target SUBMIT_BUTTON = Target.the("").located(By.xpath("//button[@id='submit']"));
    public static final Target SUBMIT_BUTTON = Target.the("").locatedBy("//button[@id='submit']");

    }
