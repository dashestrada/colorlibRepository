package co.com.reto.colorlib.questions;

import co.com.reto.colorlib.model.ColorlibData;
import co.com.reto.colorlib.userinterface.EmptyMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Range implements Question<Boolean> {

    private List<ColorlibData> datos;

    public Range(List<ColorlibData> datos) {
        this.datos = datos;
    }

    public static Range onThePage(List<ColorlibData> datos) {
        return new Range(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
         String text_invalid_range = Text.of(EmptyMessage.FIELD_RANGE).viewedBy(actor).asString();
             if
             (datos.get(0).getStrInvalidRange().equals(text_invalid_range)) {
                 return true;
             }
             else {
                 return false;
             }
        }

}
