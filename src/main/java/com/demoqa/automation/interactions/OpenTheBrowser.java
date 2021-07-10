package com.demoqa.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Interaction {

    private String url;
    public OpenTheBrowser(String url){
        this.url = url;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
    public static OpenTheBrowser on (String url){
        return new OpenTheBrowser(url);
    }
}
