package co.choucair.tasks.front;

import co.choucair.interactions.front.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.choucair.ui.front.PaginaInicioSesion.*;


public class IniciarSesion implements Task {

    private String correo;
    private String clave;

    public IniciarSesion conElCorreo(String correo){
        this.correo=correo;
        return this;
    }

    public IniciarSesion conLaClave(String clave){
        this.clave=clave;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Espera.seconds(5),
                WaitUntil.the(PUBLICIDAD, WebElementStateMatchers.isVisible()).forNoMoreThan(5L).seconds(),
                Click.on(PUBLICIDAD),
                Click.on(MICUENTA),
                WaitUntil.the(OPCION_INGRESO, WebElementStateMatchers.isVisible()).forNoMoreThan(40L).seconds(),
                Click.on(OPCION_INGRESO),
                Enter.theValue(correo).into(CORREO),
                Enter.theValue(clave).into(CLAVE),
                Click.on(BOTON_ENTRAR)
        );
    }

    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}
