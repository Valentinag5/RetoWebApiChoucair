package co.choucair.stepdefinitions.setup;

import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.choucair.utils.back.Diccionario.URL_BASE;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ConfiguracionBack {

    private static final String ACTOR = "Valentina";
    private void setActorYEscenario() {
        setTheStage(Cast.ofStandardActors());
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(CallAnApi.at(URL_BASE));
    }

    protected void configurarBack() {

        setActorYEscenario();
    }
}
