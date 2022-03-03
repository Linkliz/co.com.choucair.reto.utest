package co.com.choucair.reto.utest.taks;

import co.com.choucair.reto.utest.model.UTestSignUpData;
import co.com.choucair.reto.utest.userinterface.UtestFormFourPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FormFour implements Task {
    private UTestSignUpData uTestSignUpData;

    public FormFour(UTestSignUpData uTestSignUpData) {
        this.uTestSignUpData = uTestSignUpData;
    }

    public static FormFour the(UTestSignUpData uTestSignUpData) {
        return Tasks.instrumented(FormFour.class,uTestSignUpData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestSignUpData.getStrPassword()).into(UtestFormFourPage.INPUT_PASSWORD),
                Enter.theValue(uTestSignUpData.getStrConfirmPassword()).into(UtestFormFourPage.INPUT_PASSWORD_CONFIRM),
                Click.on(UtestFormFourPage.CHECK_BUTTON_INFORMED),
                Click.on(UtestFormFourPage.CHECK_BUTTON_TERMS_USE),
                Click.on(UtestFormFourPage.CHECK_BUTTON_POLITICS),
                Click.on(UtestFormFourPage.COMPLETE_SETUP_BUTTON));
    }
}
