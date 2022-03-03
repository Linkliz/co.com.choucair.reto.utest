package co.com.choucair.reto.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestFormThreePage {
    public static final Target DEVICE_BUTTON = Target.the("where do we write your movil device brand").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOVIL_DEVICE = Target.the("where do we write your movil device brand").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target MODEL_BUTTON = Target.the("where do we write your movil device model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MODEL = Target.the("where do we write your movil device model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target OS_BUTTON = Target.the("where do we write your movil device OS").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_OS = Target.the("where do we write your movil device OS").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target NEXT_BUTTON = Target.the("button for next step of form sign up").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

}


