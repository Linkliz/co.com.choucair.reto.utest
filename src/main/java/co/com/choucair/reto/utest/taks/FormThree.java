package co.com.choucair.reto.utest.taks;

import co.com.choucair.reto.utest.model.UTestSignUpData;
import co.com.choucair.reto.utest.userinterface.UtestFormThreePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;

public class FormThree implements Task {
    private UTestSignUpData uTestSignUpData;

    public FormThree(UTestSignUpData uTestSignUpData) {
        this.uTestSignUpData = uTestSignUpData;
    }

    public static FormThree the(UTestSignUpData uTestSignUpData) {
        return Tasks.instrumented(FormThree.class,uTestSignUpData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestFormThreePage.DEVICE_BUTTON),
                Enter.theValue(uTestSignUpData.getStrMovilDevice()).into(UtestFormThreePage.INPUT_MOVIL_DEVICE).thenHit(Keys.ENTER),
                Click.on(UtestFormThreePage.MODEL_BUTTON),
                Enter.theValue(uTestSignUpData.getStrModel()).into(UtestFormThreePage.INPUT_MODEL).thenHit(Keys.ENTER),
                Click.on(UtestFormThreePage.OS_BUTTON),
                Enter.theValue(uTestSignUpData.getStrOperatingSystem()).into(UtestFormThreePage.INPUT_OS).thenHit(Keys.ENTER),
                Click.on(UtestFormThreePage.NEXT_BUTTON));
    }
}
