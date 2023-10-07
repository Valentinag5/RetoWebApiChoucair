package co.choucair.tasks.back;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.conditions.Check;

import static co.choucair.tasks.back.GetObtenerEmpleado.getObtenerEmpleado;
import static co.choucair.utils.back.enums.TipoDeSolicitud.GET;


public class TipoSolicitud implements Task {
    private String tipoSolicitud;

    public TipoSolicitud with(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(tipoSolicitud.equals(GET.getValue()))
                        .andIfSo(getObtenerEmpleado())

        );
    }

    public static TipoSolicitud tipoSolicitud() {
        return Tasks.instrumented(TipoSolicitud.class);
    }
}
