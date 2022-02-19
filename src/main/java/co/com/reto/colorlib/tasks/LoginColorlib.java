package co.com.reto.colorlib.tasks;

import co.com.reto.colorlib.model.ColorlibData;
import co.com.reto.colorlib.userinterface.LoginUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import java.util.List;


public class LoginColorlib implements Task {

    private List<ColorlibData> datos;

    public LoginColorlib(List<ColorlibData> datos) {
        this.datos = datos;
    }

    public static LoginColorlib onThePage(List<ColorlibData> datos) {
        return Tasks.instrumented(LoginColorlib.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrUser()).into(LoginUser.USERNAME),
                Enter.theValue(datos.get(0).getStrPassword()).into(LoginUser.PASSWORD),
                Click.on(LoginUser.BUTTON_SIGN)
               );
    }
}
