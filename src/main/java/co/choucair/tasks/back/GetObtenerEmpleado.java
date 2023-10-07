package co.choucair.tasks.back;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.choucair.utils.back.enums.Recurso.GET_RECURSO;

public class GetObtenerEmpleado implements Task {

    private Object recurso;

    public GetObtenerEmpleado conElRecurso(Object recurso){
        this.recurso=recurso;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(GET_RECURSO.getValue())
        );
    }
    public static GetObtenerEmpleado getObtenerEmpleado() {
        return Tasks.instrumented(GetObtenerEmpleado.class);
    }
}