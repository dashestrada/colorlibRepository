package co.com.reto.colorlib.tasks;

import co.com.reto.colorlib.userinterface.Forms;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

public class FormEmpty implements Task {


    public static FormEmpty onThePage() { return Tasks.instrumented(FormEmpty.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Forms.FORMS), Click.on(Forms.FORMS_VALIDATION),
                Click.on(Forms.BUTTON_VALIDAR));
    }
}
