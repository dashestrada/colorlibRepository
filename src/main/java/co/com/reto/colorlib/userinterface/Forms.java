package co.com.reto.colorlib.userinterface;

import net.serenitybdd.core.annotations.findby.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Forms extends PageObject {

    public static final Target METIS = Target.the("Texto para validar que ingreso a la página después del login")
            .located(By.xpath("//img[@src='assets/img/logo.png']"));
    public static final Target FORMS = Target.the("Desplegable para ir a los formularios")
            .located(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a"));
    public static Target BLOCk_VALIDATION = Target.the("Validar texto Block Validation")
            .located(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/header/h5"));
    public static final Target FORMS_VALIDATION = Target.the("Desplegable para ir a los formularios")
            .located(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/ul/li[2]/a"));
    public static final Target REQUIRED = Target.the("Campo para ingresar el nombre")
            .located(By.id("required2"));
    public static final Target EMAIL = Target.the("Campo para ingresar el email")
            .located(By.id("email2"));
    public static final Target PASSWORD_VALIDATION = Target.the("Campo para ingresar la clave")
            .located(By.id("password2"));
    public static final Target CONFIRM_PASSWORD = Target.the("Campo para confirmar la clave")
            .located(By.id("confirm_password2"));
    public static final Target DATE = Target.the("Campo para ingresar la fecha")
            .located(By.id("date2"));
    public static final Target URL = Target.the("Campo para ingresar la Url")
            .located(By.xpath("//input[@name='url2']"));
    public static final Target DIGITS = Target.the("Campo para ingresar los digitos")
            .located(By.id("digits"));
    public static final Target RANGE = Target.the("Campo para ingresar el rango")
            .located(By.id("range"));
    public static final Target POLICY = Target.the("Marcamos para aceptar las politicas")
            .located(By.id("agree2"));
    public static final Target BUTTON_VALIDAR = Target.the("Botón para validar")
            .located(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div/form/div[10]/input"));




}
