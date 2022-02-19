package co.com.reto.colorlib.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUser extends PageObject {
    public static final Target USERNAME = Target.the("Campo para ingresar el usuario")
            .located(By.xpath("//input[@placeholder='Username']"));
    public static final Target PASSWORD = Target.the("Campo para ingresar la contraseña")
            .located(By.xpath("//input[@placeholder='Password']"));
    public static final Target BUTTON_SIGN = Target.the("Botón para ingresar")
            .located(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']"));
}
