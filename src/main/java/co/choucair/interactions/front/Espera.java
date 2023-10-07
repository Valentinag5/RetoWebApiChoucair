package co.choucair.interactions.front;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class Espera implements Interaction {
        private int segundos;

        public Espera(int segundos) {
            this.segundos = segundos;
        }


        @Override
        @Step("{0} espera #segundos segundo(s) antes de ejecutar el siguiente paso")
        //Esta clase es de esperas Explicitas
        public <T extends Actor> void performAs(T actor) {
            new InternalSystemClock().pauseFor((segundos * 1000));

        }
        public static Interaction seconds(int segundos) {
            return Tasks.instrumented(Espera.class, segundos);
        }

}
