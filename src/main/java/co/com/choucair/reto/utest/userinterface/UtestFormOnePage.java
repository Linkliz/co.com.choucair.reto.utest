package co.com.choucair.reto.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormOnePage extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("input where do write the name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("input where do write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("input where do write  the email").located(By.id("email"));
    public static final Target INPUT_BIRTH_MONTH = Target.the("input where do write  the birthday month").located(By.id("birthMonth"));
    public static final Target INPUT_BIRTH_DAY = Target.the("input where do write  the birthday month").located(By.id("birthDay"));
    public static final Target INPUT_BIRTH_YEAR = Target.the("input where do write  the birthday month").located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("input where do write  the different languages").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target NEXT_BUTTON = Target.the("button for next step of form sign up").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
