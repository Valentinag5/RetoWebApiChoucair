package co.choucair.tasks.back;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static co.choucair.utils.back.Diccionario.PUT_UPDATE_JSON;
import static co.choucair.utils.back.LeerArchivos.obtenerJsonDelArchivo;
import static co.choucair.utils.back.enums.Recurso.PUT_RECURSO;
import static io.restassured.http.ContentType.JSON;

public class PutModificarEmpleado implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String bodyRequest = obtenerJsonDelArchivo(PUT_UPDATE_JSON);
        actor.attemptsTo(
                Put.to(PUT_RECURSO.getValue())
                        .with(requestSpecification -> requestSpecification
                                .contentType(JSON)
                                .body(bodyRequest)
                                .log().body())
        );
    }

    public static PutModificarEmpleado putModificarEmpleado() {
        return Tasks.instrumented(PutModificarEmpleado.class);
    }
}
