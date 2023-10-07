package co.choucair.tasks.front;

import co.choucair.ui.front.AbrirPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaExito implements Task {

    private AbrirPagina abrirPagina;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(abrirPagina)
        );
    }

    public static AbrirPaginaExito abrirPaginaExito(){
        return new AbrirPaginaExito();
    }
}
