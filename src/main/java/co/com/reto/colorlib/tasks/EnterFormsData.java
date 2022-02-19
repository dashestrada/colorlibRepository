package co.com.reto.colorlib.tasks;

import co.com.reto.colorlib.model.ColorlibData;
import co.com.reto.colorlib.userinterface.Forms;
import co.com.reto.colorlib.userinterface.LoginUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.util.List;

public class EnterFormsData implements Task {

    private List<ColorlibData> datos;
    public EnterFormsData(List<ColorlibData> datos) {
        this.datos = datos;
    }

    public static EnterFormsData onThePage(List<ColorlibData> datos) {
        return Tasks.instrumented(EnterFormsData.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(WebElementQuestion.the(Forms.METIS), WebElementStateMatchers.isVisible()),
                Click.on(Forms.FORMS), Click.on(Forms.FORMS_VALIDATION),
                Check.whether(WebElementQuestion.the(Forms.BLOCk_VALIDATION), WebElementStateMatchers.isVisible()),
                Enter.theValue(datos.get(0).getStrRequired()).into(Forms.REQUIRED),
                Enter.theValue(datos.get(0).getStrEmail()).into(Forms.EMAIL),
                Enter.theValue(datos.get(0).getStrPasswordValidation()).into(Forms.PASSWORD_VALIDATION),
                Enter.theValue(datos.get(0).getStrConfirmPassword()).into(Forms.CONFIRM_PASSWORD),
                Enter.theValue(datos.get(0).getStrDate()).into(Forms.DATE),
                Enter.theValue(datos.get(0).getStrUrl()).into(Forms.URL),
                Enter.theValue(datos.get(0).getStrDigitiesOnly()).into(Forms.DIGITS),
                Enter.theValue(datos.get(0).getStrRango()).into(Forms.RANGE),
                Click.on(Forms.POLICY),
                Click.on(Forms.BUTTON_VALIDAR)


    );




    }
}
