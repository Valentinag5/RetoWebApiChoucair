package co.choucair.questions.back;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.TheResponse;


public class CodRespuestaGet implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
        return TheResponse.statusCode().answeredBy(actor);

    }
    public static CodRespuestaGet codRespuestaGet() {
        return new CodRespuestaGet();
    }
}
