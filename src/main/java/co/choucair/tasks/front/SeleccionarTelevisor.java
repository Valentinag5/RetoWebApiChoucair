package co.choucair.tasks.front;

import co.choucair.interactions.front.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.choucair.ui.front.PaginaTelevisor.*;

public class SeleccionarTelevisor implements Task {
        private int obtenerNumeroAleatorio(int min, int max) {
            // Genera y retorna un número aleatorio entre min y max
            return (int) (Math.random() * (max - min + 1)) + min;
        }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (int i = 0; i < 5; i++) {
            Espera.seconds(5);
            int unidadesTelevisores = obtenerNumeroAleatorio(1, 10);
            for (int j = 0; j < unidadesTelevisores; j++) {
                Espera.seconds(5);
                actor.attemptsTo(
                        Espera.seconds(5),
                        WaitUntil.the(BOTON_COMPRAR(), WebElementStateMatchers.isVisible()).forNoMoreThan(10L).seconds(),
                        Click.on(BOTON_COMPRAR()),
                        Scroll.to(TEXTO_CATEGORIAS),
                        Espera.seconds(5),
                        WaitUntil.the(BOTON_CANTIDAD(), WebElementStateMatchers.isVisible()).forNoMoreThan(10L).seconds(),
                        Click.on(BOTON_CANTIDAD()),
                        Scroll.to(TEXTO_CATEGORIAS),
                        Espera.seconds(5)
                );
            }
        }
    }

    public static SeleccionarTelevisor seleccionarTelevisor() {return new SeleccionarTelevisor();}

}






