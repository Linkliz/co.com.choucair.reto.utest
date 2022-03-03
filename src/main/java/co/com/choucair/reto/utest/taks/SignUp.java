package co.com.choucair.reto.utest.taks;

import co.com.choucair.reto.utest.userinterface.UTestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SignUp implements Task {

    private UTestSignUpPage uTestSignUpPage;

    public static SignUp signUpPage() {
        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestSignUpPage.JOIN_BUTTON));
    }
}
