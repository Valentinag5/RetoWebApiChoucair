package co.choucair.questions.back;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.TheResponse;

public class CodRespuestaPost implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
        return TheResponse.statusCode().answeredBy(actor);

    }
    public static CodRespuestaPost codRespuestaPost() {
        return new CodRespuestaPost();
    }
}
