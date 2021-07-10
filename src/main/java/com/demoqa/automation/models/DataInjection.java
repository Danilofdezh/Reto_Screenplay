package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String firstName, lastName, email, mobileNumber, dateofbirth, subjects, selectPicture, currentAddress, filepath, sheetName,
            state, city;

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getMobileNumber() { return mobileNumber; }
    public String getDateofbirthday() { return dateofbirth; }
    public String getSubjects() { return subjects; }
    public String getSelectPicture() { return selectPicture; }
    public String getCurrentAddress() { return currentAddress; }
    public String getState() { return state; }
    public String getCity() { return city; }


    public String getFilepath() {
        return filepath;
    }

    public String getSheetName() {
        return sheetName;
    }

    public DataInjection(){
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.mobileNumber = Integer.toString(faker.number().numberBetween(1000000000,1999999999));
        this.dateofbirth = faker.date().birthday().toString();
        this.subjects = "English";
        this.selectPicture = "C:\\Users\\LENOVO\\IdeaProjects\\Danilo.jpg";
        this.currentAddress = faker.address().fullAddress();
        this.state = "Haryana";
        this.city = "Aruba";
        this.filepath = "resources/Data Injection.xlsx";
        this.sheetName = "DataInjection";

    }


}

