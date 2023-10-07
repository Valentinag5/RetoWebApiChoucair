package co.choucair.ui.front;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicioSesion extends PageObject {

    public static final Target PUBLICIDAD = Target.the("Modal de publicidad")
            .located(By.xpath("//div[@id='wps-overlay-close-button']"));

    public static final Target MICUENTA = Target.the("Mi cuenta")
            .located(By.xpath(" //*[@class='vtex-menu-2-x-styledLinkContent vtex-menu-2-x-styledLinkContent--header-link flex justify-between nowrap']"));

    public static final Target OPCION_INGRESO = Target.the("Opcion de ingreso")
            .located(By.xpath(" (//*[@class='vtex-button__label flex items-center justify-center h-100 ph6 '])[3]"));

    public static final Target CORREO = Target.the("Opcion de ingreso")
            .located(By.xpath("//*[@class='vtex-styleguide-9-x-input ma0 border-box vtex-styleguide-9-x-hideDecorators vtex-styleguide-9-x-noAppearance br2   w-100 bn outline-0 bg-base c-on-base b--muted-4 hover-b--muted-3 t-body ph5 ']"));

    public static final Target CLAVE = Target.the("Opcion de ingreso")
            .located(By.xpath("(//*[@class='vtex-styleguide-9-x-input ma0 border-box vtex-styleguide-9-x-hideDecorators vtex-styleguide-9-x-noAppearance br2  br-0 br--left  w-100 bn outline-0 bg-base c-on-base b--muted-4 hover-b--muted-3 t-body pl5 '])[2]"));

    public static final Target BOTON_ENTRAR = Target.the("Opcion de ingreso")
            .located(By.xpath("(//*[@class='vtex-button__label flex items-center justify-center h-100 ph5 '])[2]"));

}
