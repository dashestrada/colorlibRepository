package co.com.reto.colorlib.questions;

import co.com.reto.colorlib.model.ColorlibData;
import co.com.reto.colorlib.userinterface.Forms;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Anwers implements Question<Boolean> {

    private List<ColorlibData> datos;

    public Anwers(List<ColorlibData> datos) {
        this.datos = datos;
    }

    public static Anwers onThePage(List<ColorlibData> datos) {
        return new Anwers(datos);


    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text_required = Text.of(Forms.REQUIRED).viewedBy(actor).asString();
        String text_email = Text.of(Forms.EMAIL).viewedBy(actor).asString();
        String text_password = Text.of(Forms.PASSWORD_VALIDATION).viewedBy(actor).asString();
        String text_confirm_password = Text.of(Forms.CONFIRM_PASSWORD).viewedBy(actor).asString();
        String text_date = Text.of(Forms.DATE).viewedBy(actor).asString();
        String text_url = Text.of(Forms.URL).viewedBy(actor).asString();
        String text_digities = Text.of(Forms.DIGITS).viewedBy(actor).asString();
        String text_rango = Text.of(Forms.RANGE).viewedBy(actor).asString();

        if
        (datos.get(0).getStrTextoFinal().equals(text_required) &&
                datos.get(0).getStrTextoFinal().equals(text_email) &&
                datos.get(0).getStrTextoFinal().equals(text_password) &&
                datos.get(0).getStrTextoFinal().equals(text_confirm_password) &&
                datos.get(0).getStrTextoFinal().equals(text_date) &&
                datos.get(0).getStrTextoFinal().equals(text_url) &&
                datos.get(0).getStrTextoFinal().equals(text_digities) &&
                datos.get(0).getStrTextoFinal().equals(text_rango)) {
            return true;
        } else {
            return false;
        }

    }
}