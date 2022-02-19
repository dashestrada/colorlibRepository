package co.com.reto.colorlib.questions;

import co.com.reto.colorlib.model.ColorlibData;
import co.com.reto.colorlib.userinterface.EmptyMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Email implements Question<Boolean> {

    private List<ColorlibData> datos;

    public Email(List<ColorlibData> datos) {
        this.datos = datos;
    }

    public static Email onThePage(List<ColorlibData> datos) { return new Email(datos);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text_invalid_email = Text.of(EmptyMessage.FIELD_EMAIL).viewedBy(actor).asString();

        if
        (datos.get(0).getStrInvalidEmail().equals(text_invalid_email)){
            return true;
        }
        else {
            return false;
        }
    }
}
