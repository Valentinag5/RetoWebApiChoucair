package co.choucair.tasks.front;

import co.choucair.interactions.front.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static co.choucair.ui.front.PaginaTelevisor.*;

public class SeleccionarTelevisorAleatorio implements Task {

    private int obtenerNumeroAleatorio(int min, int max) {
        // Genera y retorna un número aleatorio entre min y max
        return (int) (Math.random() * (max - min + 1)) + min;
    }

        @Override
        public <T extends Actor> void performAs(T actor) {

            List<WebElement> elementosCompra = actor.abilityTo(BrowseTheWeb.class).getDriver().findElements(By.xpath(XPATH_BOTON_COMPRAR));
            if (!elementosCompra.isEmpty()) {
                Random rand = new Random();
                int indiceAleatorio;
                indiceAleatorio = rand.nextInt(elementosCompra.size());
                WebElement elementoAleatorio = elementosCompra.get(indiceAleatorio);
                for (int i = 0; i < 5; i++) {
                    actor.attemptsTo(
                            Espera.seconds(5),
                            WaitUntil.the(BOTON_COMPRAR(), WebElementStateMatchers.isVisible()).forNoMoreThan(10L).seconds(),
                            Click.on(BOTON_COMPRAR())
                    );
                    int unidadesTelevisores = obtenerNumeroAleatorio(1, 3);
                    for (int j = 0; j < unidadesTelevisores; j++) {
                         actor.attemptsTo(
                                 WaitUntil.the(BOTON_CANTIDAD().of(Integer.toString(indiceAleatorio)), WebElementStateMatchers.isVisible()).forNoMoreThan(10L).seconds(),
                                 Click.on(BOTON_CANTIDAD().of(Integer.toString(indiceAleatorio))), // Usar el mismo índiceAleatorio
                                 Espera.seconds(5)

                         );
                    }
                    actor.attemptsTo(
                    Scroll.to(TEXTO_CATEGORIAS)
                    );
                }
            }
        }

    public static SeleccionarTelevisorAleatorio seleccionarTelevisorAleatorio() {return new SeleccionarTelevisorAleatorio();}
}
