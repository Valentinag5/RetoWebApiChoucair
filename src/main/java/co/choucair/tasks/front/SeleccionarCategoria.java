package co.choucair.tasks.front;

import co.choucair.interactions.front.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.choucair.ui.front.PaginaCategoria.*;

public class SeleccionarCategoria implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        Espera.seconds(15);
        actor.attemptsTo(
                WaitUntil.the(MENU, WebElementStateMatchers.isVisible()).forNoMoreThan(50L).seconds(),
                Click.on(MENU),
                Click.on(CATEGORIA),
                Click.on(SUBCATEGORIA)
                );
    }

    public static SeleccionarCategoria seleccionarCategoria() { return new SeleccionarCategoria();}
}
