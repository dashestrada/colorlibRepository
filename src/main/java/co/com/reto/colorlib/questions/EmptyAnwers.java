package co.com.reto.colorlib.questions;

import co.com.reto.colorlib.model.ColorlibData;
import co.com.reto.colorlib.userinterface.EmptyMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class EmptyAnwers implements Question<Boolean> {
    List<ColorlibData> datos;

    public EmptyAnwers(List<ColorlibData> datos) {
        this.datos = datos;
    }

    public static EmptyAnwers onThePage(List<ColorlibData> datos) {
        return new EmptyAnwers(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
    String text_required_Message = Text.of(EmptyMessage.FIELD_REQUIRED).viewedBy(actor).asString();
        String text_email_Message = Text.of(EmptyMessage.FIELD_EMAIL).viewedBy(actor).asString();
        String text_password_Message = Text.of(EmptyMessage.FIELD_PASSWORD).viewedBy(actor).asString();
        String text_confirm_password_Message = Text.of(EmptyMessage.FIELD_CONFIRM_PASSWORD).viewedBy(actor).asString();
        String text_date_Message = Text.of(EmptyMessage.FIELD_DATE).viewedBy(actor).asString();
        String text_url_Message = Text.of(EmptyMessage.FIELD_URL).viewedBy(actor).asString();
        String text_digits_Message = Text.of(EmptyMessage.FIELD_DIGITS).viewedBy(actor).asString();
        String text_range_Message = Text.of(EmptyMessage.FIELD_RANGE).viewedBy(actor).asString();
        String text_policy_Message = Text.of(EmptyMessage.FIELD_POLICY).viewedBy(actor).asString();

        if
        (datos.get(0).getStrMessageRequired().equals(text_required_Message) &&
        datos.get(0).getStrMessageRequired().equals(text_email_Message) &&
         datos.get(0).getStrMessageRequired().equals(text_password_Message) &&
        datos.get(0).getStrMessageRequired().equals(text_password_Message) &&
         datos.get(0).getStrMessageRequired().equals(text_date_Message) &&
         datos.get(0).getStrMessageRequired().equals(text_url_Message) &&
         datos.get(0).getStrMessageRequired().equals(text_digits_Message) &&
         datos.get(0).getStrMessageRequired().equals(text_policy_Message)) {
             return true;
        } else {
            return false;}


    }
}
