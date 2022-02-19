package co.com.reto.colorlib.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmptyMessage extends PageObject {

    public static final net.serenitybdd.screenplay.targets.Target FIELD_REQUIRED = Target.the("Mensaje de Campo requerido ")
            .located(By.id("required2-error"));
    public static final net.serenitybdd.screenplay.targets.Target FIELD_EMAIL = Target.the("Mensaje de Campo requerido ")
            .located(By.id("email2-error"));
    public static final net.serenitybdd.screenplay.targets.Target FIELD_PASSWORD = Target.the("Mensaje de Campo requerido ")
            .located(By.id("password2-error"));
    public static final net.serenitybdd.screenplay.targets.Target FIELD_CONFIRM_PASSWORD = Target.the("Mensaje de Campo requerido ")
            .located(By.id("confirm_password2-error"));
    public static final net.serenitybdd.screenplay.targets.Target FIELD_DATE= Target.the("Mensaje de Campo requerido ")
            .located(By.id("date2-error"));
    public static final net.serenitybdd.screenplay.targets.Target FIELD_URL= Target.the("Mensaje de Campo requerido ")
            .located(By.id("url2-error"));
    public static final net.serenitybdd.screenplay.targets.Target FIELD_DIGITS= Target.the("Mensaje de Campo requerido ")
            .located(By.id("digits-error"));
    public static final net.serenitybdd.screenplay.targets.Target FIELD_RANGE= Target.the("Mensaje de Campo requerido ")
            .located(By.id("range-error"));
    public static final net.serenitybdd.screenplay.targets.Target FIELD_POLICY= Target.the("Mensaje de Campo requerido ")
            .located(By.id("agree2-error"));




}
