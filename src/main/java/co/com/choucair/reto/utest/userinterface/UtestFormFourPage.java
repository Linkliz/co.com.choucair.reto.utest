package co.com.choucair.reto.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormFourPage {
    public static final Target INPUT_PASSWORD = Target.the("input where do write the new password").located(By.id("password"));
    public static final Target INPUT_PASSWORD_CONFIRM = Target.the("input where do write the confirmed password").located(By.id("confirmPassword"));
    public static final Target CHECK_BUTTON_INFORMED = Target.the("Where you agree to receive information from utest").located(By.name("newsletterOptIn"));
    public static final Target CHECK_BUTTON_TERMS_USE = Target.the("Where you agree to terms of use from utest").located(By.id("termOfUse"));
    public static final Target CHECK_BUTTON_POLITICS = Target.the("Where you agree to politics from utest").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Button for finish the sing up form").located(By.id("laddaBtn"));
    public static final Target WELCOME_MMS = Target.the("extract the welcome message").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
