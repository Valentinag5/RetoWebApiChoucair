package co.choucair.questions.back;

import static co.choucair.questions.back.CodRespuestaDelete.codRespuestaDelete;
import static co.choucair.questions.back.CodRespuestaGet.codRespuestaGet;
import static co.choucair.questions.back.CodRespuestaPost.codRespuestaPost;
import static co.choucair.questions.back.CodRespuestaPut.codRespuestaPut;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RespuestaTipoSolicitud {
    private RespuestaTipoSolicitud() {
    }

    public static void codigoRespuesta(String tipoRecurso) {
        switch (tipoRecurso) {
            case "GET":
           theActorInTheSpotlight().should(seeThat(codRespuestaGet(), is(equalTo(200))));
                break;
            case "POST":
                theActorInTheSpotlight().should(seeThat(codRespuestaPost(), is(equalTo(200))));
                break;
            case "PUT":
                theActorInTheSpotlight().should(seeThat(codRespuestaPut(), is(equalTo(200))));
                break;
            case "DELETE":
                theActorInTheSpotlight().should(seeThat(codRespuestaDelete(), is(equalTo(200))));
                break;
            default:
        }
    }

}
