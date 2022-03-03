package co.com.choucair.reto.utest.questions;

import co.com.choucair.reto.utest.userinterface.UtestFormFourPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String nameCourse = Text.of(UtestFormFourPage.WELCOME_MMS).viewedBy(actor).asString();
        if (question.equals(nameCourse)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
