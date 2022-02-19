package co.com.reto.colorlib.questions;

import co.com.reto.colorlib.model.ColorlibData;
import co.com.reto.colorlib.userinterface.EmptyMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Url implements Question<Boolean> {

    private List<ColorlibData> datos;

    public Url(List<ColorlibData> datos) {

        this.datos = datos;
    }

    public static Url onThePage(List<ColorlibData> datos) {
        return new Url(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
      String Text_invalid_url = Text.of(EmptyMessage.FIELD_URL).viewedBy(actor).asString();
        if
        (datos.get(0).getSrtInvalidUrls().equals(Text_invalid_url)) {
            return true;
        }
        else {
            return false;
        }
    }

}
