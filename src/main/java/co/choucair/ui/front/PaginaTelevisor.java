package co.choucair.ui.front;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaTelevisor extends PageObject {

    public static final Target TEXTO_CATEGORIAS = Target.the("Texto Resultados")
            .located(By.xpath("//div[@class='vtex-breadcrumb-1-x-container pv3']"));
    public static String XPATH_BOTON_COMPRAR = "(//button[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer w-100 '])";
   public static final Target BOTON_COMPRAR() {
        String xpathConVariable = XPATH_BOTON_COMPRAR;
        return Target.the("Botón comprar").locatedBy(xpathConVariable);
    }
    public static String XPATH_BOTON_CANTIDAD = "(//button[@class='exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus'])";
    public static final Target BOTON_CANTIDAD() {
        String xpathConVariable = XPATH_BOTON_CANTIDAD;
        return Target.the("Botón cantidad").locatedBy(xpathConVariable);
    }

   /* private static int obtenerNumeroAleatorio() {
        // Genera y retorna un número aleatorio
        return (int) (Math.random() * 10) + 1;
    }
    private static int numeroAleatorio = obtenerNumeroAleatorio();

    public static  org.openqa.selenium.By NOMBRE_TELEVISOR = By.xpath("(//*[@class='vtex-store-components-3-x-productBrand '])["+numeroAleatorio+"]");

    public static String XPATH_COSTO_TELEVISOR = "(//*[@class='exito-vtex-components-4-x-PricePDP'])";

    public static final Target COSTO_TELEVISOR() {
        String xpathConVariable = XPATH_COSTO_TELEVISOR + "[" + numeroAleatorio + "]";
        return Target.the("Botón comprar").locatedBy(xpathConVariable);
    }


*/


}