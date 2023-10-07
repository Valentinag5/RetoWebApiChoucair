package co.choucair.stepdefinitions.back;

import co.choucair.stepdefinitions.setup.ConfiguracionBack;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static co.choucair.questions.back.RespuestaTipoSolicitud.codigoRespuesta;
import static co.choucair.tasks.back.TipoSolicitud.tipoSolicitud;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CrudStepDefinitions extends ConfiguracionBack {
    private static final Logger LOGGER = Logger.getLogger(CrudStepDefinitions.class);
    @Before
    public void prepareTest() {
        configurarBack();
    }

    @Cuando("ejecuto una solicitud de tipo {string} en el servicio")
    public void ejecutoUnaSolicitudDeTipoEnElServicio(String tipoRecurso) {
        try {

            LOGGER.info("Inicia la automatización");
            theActorInTheSpotlight().attemptsTo(
                    tipoSolicitud().with(tipoRecurso));
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }

    }
    @Entonces("debería ver la respuesta respectiva de la solicitud de tipo {string}")
    public void deberíaVerLaRespuestaRespectivaDeLaSolicitudDeTipo(String tipoRecurso) {
        try {
            LOGGER.info("Se muestra el código de respuesta");
            codigoRespuesta(tipoRecurso);
        }catch (Exception e){
            LOGGER.warn(e.getMessage());
        }


    }

}
