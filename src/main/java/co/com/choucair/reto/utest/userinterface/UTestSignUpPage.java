package co.com.choucair.reto.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UTestSignUpPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to sign up")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
