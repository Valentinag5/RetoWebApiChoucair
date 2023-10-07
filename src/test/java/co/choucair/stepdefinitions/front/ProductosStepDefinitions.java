package co.choucair.stepdefinitions.front;

import co.choucair.stepdefinitions.setup.ConfiguracionFront;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static co.choucair.tasks.front.AbrirCarrito.abrirCarrito;
import static co.choucair.tasks.front.AbrirPaginaExito.abrirPaginaExito;
import static co.choucair.tasks.front.IniciarSesion.iniciarSesion;
import static co.choucair.tasks.front.SeleccionarCategoria.seleccionarCategoria;
import static co.choucair.tasks.front.SeleccionarTelevisor.seleccionarTelevisor;
import static co.choucair.tasks.front.SeleccionarTelevisorAleatorio.seleccionarTelevisorAleatorio;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ProductosStepDefinitions extends ConfiguracionFront {
    private static final Logger LOGGER = Logger.getLogger(ProductosStepDefinitions.class);


    @Dado("que estoy loggeado en la pagina")
    public void queEstoyLoggeadoEnLaPagina() {
        try {
            configurarNavegador();
            LOGGER.info("Inicia la automatización");
            theActorInTheSpotlight().wasAbleTo(
                    abrirPaginaExito(),
                    iniciarSesion()
                            .conElCorreo("valentinamejiag@hotmail.com")
                            .conLaClave("Valen123")

            );
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }

    @Cuando("selecciono la categoria Tecnologia y la subcategoria Televisores")
    public void queSeleccionoLaCategoriaTecnologiaYLaSubcategoriaTelevisores() {
        try {
            LOGGER.info("Selecciona la categoria 'Tecnologia' y la subcategoria 'Televisores'");
            theActorInTheSpotlight().wasAbleTo(
                    seleccionarCategoria()
            );
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.error(exception.getMessage(),exception);
        }
    }

    @Cuando("selecciono los televisores de forma aleatoria y agrego cantidades diferentes a cada seleccion")
    public void seleccionoLosTelevisoresDeFormaAleatoriaYAgregoCantidadesDiferentesACadaSeleccion() {
        try {
            LOGGER.info("Selecciona cinco televisores de forma aleatoria'");
            theActorInTheSpotlight().wasAbleTo(
                    seleccionarTelevisorAleatorio()
            );
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.error(exception.getMessage(),exception);
        }
    }


    @Entonces("Deberia visualizar los nombres precios cantidades y numero de productos")
    public void deberiaVisualizarLosNombresPreciosCantidadesYNumeroDeProductos() {
       /* try {
            LOGGER.info("Verificando que el nombre del producto que aparece sea el mismo del que se selecciono");
                theActorInTheSpotlight().should(
                        seeThat(verificarNombre(), equalTo(textoEsperadoNombre()))
                );
            }
            LOGGER.info("Mensaje de confirmacion exitoso");
            quitarDriver();
            LOGGER.info("Driver quitado");
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.error(exception.getMessage(),exception);
        }*/
    }


}
