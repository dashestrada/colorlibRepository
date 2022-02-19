package co.com.reto.colorlib.questions;

import co.com.reto.colorlib.model.ColorlibData;
import co.com.reto.colorlib.userinterface.EmptyMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Digits implements Question<Boolean> {
    private List<ColorlibData> datos;

    public Digits(List<ColorlibData> datos) {
        this.datos = datos;
    }

    public static Digits onThePage(List<ColorlibData> datos) {
        return new Digits(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       String text_invalid_digits = Text.of(EmptyMessage.FIELD_DIGITS).viewedBy(actor).asString();
       if
       (datos.get(0).getStrInvalidDigits().equals(text_invalid_digits)) {
           return true;
       }
       else {
           return false;
       }
    }
}
