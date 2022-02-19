package co.com.reto.colorlib.questions;

import co.com.reto.colorlib.model.ColorlibData;
import co.com.reto.colorlib.userinterface.EmptyMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Password implements Question<Boolean> {
    private List<ColorlibData> datos;

    public Password(List<ColorlibData> datos) {

        this.datos = datos;
    }

    public static Password onThePage(List<ColorlibData> datos) {

        return new Password(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text_invalid_password = Text.of(EmptyMessage.FIELD_PASSWORD).viewedBy(actor).asString();
        if
        (datos.get(0).getStrInvalidPassword().equals(text_invalid_password)){
            return true;
        }
        else {
            return false;
        }
    }
}
