package co.com.choucair.reto.utest.taks;

import co.com.choucair.reto.utest.model.UTestSignUpData;
import co.com.choucair.reto.utest.userinterface.UtestFormOnePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;

public class FormOne implements Task {

    private UTestSignUpData uTestSignUpData;

    public FormOne(UTestSignUpData uTestSignUpData) {
        this.uTestSignUpData = uTestSignUpData;
    }

    public static FormOne the(UTestSignUpData uTestSignUpData) {
        return Tasks.instrumented(FormOne.class,uTestSignUpData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestSignUpData.getStrFirstName()).into(UtestFormOnePage.INPUT_FIRST_NAME),
                Enter.theValue(uTestSignUpData.getStrLastName()).into(UtestFormOnePage.INPUT_LAST_NAME),
                Enter.theValue(uTestSignUpData.getStrEmailAddress()).into(UtestFormOnePage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(uTestSignUpData.getStrMount()).from(UtestFormOnePage.INPUT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(uTestSignUpData.getStrDay()).from(UtestFormOnePage.INPUT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(uTestSignUpData.getStrYear()).from(UtestFormOnePage.INPUT_BIRTH_YEAR),
                Type.theValue(uTestSignUpData.getStrLanguages()).into(UtestFormOnePage.INPUT_LANGUAGES).thenHit(Keys.ENTER),
                Click.on(UtestFormOnePage.NEXT_BUTTON));
    }
}
