package co.choucair.ui.front;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaCategoria extends PageObject {

    public static final Target MENU = Target.the("Menu")
            .located(By.xpath(" //*[@id='Trazado_7822']"));
    public static final Target CATEGORIA = Target.the("Categoria")
            .located(By.xpath(" //p[@id='undefined-nivel2-Tecnología'] "));
    public static final Target SUBCATEGORIA = Target.the("Subcategoria")
            .located(By.xpath(" //a[@id='Categorías-nivel2-Televisores'] "));

}
