package co.choucair.tasks.front;

import co.choucair.interactions.front.Espera;
import co.choucair.ui.front.PaginaCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirCarrito implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        Espera.seconds(15);
        actor.attemptsTo(
                Click.on(PaginaCompra.CARRITO),
                Espera.seconds(15)
        );
    }

    public static AbrirCarrito abrirCarrito() {return new AbrirCarrito();}
}
