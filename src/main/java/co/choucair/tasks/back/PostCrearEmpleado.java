package co.choucair.tasks.back;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static co.choucair.utils.back.Diccionario.POST_CREATE_JSON;
import static co.choucair.utils.back.LeerArchivos.obtenerJsonDelArchivo;
import static co.choucair.utils.back.enums.Recurso.POST_RECURSO;
import static io.restassured.http.ContentType.JSON;

public class PostCrearEmpleado implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String bodyRequest = obtenerJsonDelArchivo(POST_CREATE_JSON);
        actor.attemptsTo(
                Post.to(POST_RECURSO.getValue())
                        .with(requestSpecification -> requestSpecification
                                .contentType(JSON)
                                .body(bodyRequest)
                                .log().body())
        );
    }

    public static PostCrearEmpleado postCrearEmpleado() {

        return Tasks.instrumented(PostCrearEmpleado.class);
    }
}