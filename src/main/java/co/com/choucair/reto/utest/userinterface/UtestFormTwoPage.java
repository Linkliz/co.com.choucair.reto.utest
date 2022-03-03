package co.com.choucair.reto.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormTwoPage {
    public static final Target INPUT_CITY = Target.the("input where do write the name city").located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("input where do write the postal code").located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("input where do write the name country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target NEXT_BUTTON = Target.the("button for next step of form sign up").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
