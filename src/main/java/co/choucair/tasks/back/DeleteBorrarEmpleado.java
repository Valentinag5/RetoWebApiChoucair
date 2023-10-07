package co.choucair.tasks.back;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static co.choucair.utils.back.enums.Recurso.DELETE_RECURSO;

public class DeleteBorrarEmpleado implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from(DELETE_RECURSO.getValue())
        );
    }

    public static DeleteBorrarEmpleado deleteBorrarEmpleado() {
        return Tasks.instrumented(DeleteBorrarEmpleado.class);
    }
}