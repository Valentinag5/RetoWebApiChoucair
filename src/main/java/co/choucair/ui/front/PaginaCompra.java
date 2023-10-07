package co.choucair.ui.front;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaCompra extends PageObject {

    public static final Target CARRITO = Target.the("Carrito")
            .located(By.xpath("(//a[@class='exito-header-3-x-minicartLink'])"));

    public static final Target CONTENEDOR_COMPRAS = Target.the("Contenedor Compras")
            .located(By.xpath("(//span[contains(text(), 'Televisor')])"));

}
