
import org.testng.annotations.Test;

//to have access to variables and methods we extend our child class with parent class BaseUI, so inherit all Parent methods
public class RegistrationTests extends BaseUI {


    @Test
    public void JoinForFreeNow (){

        driver.findElement(Locators.LINK_JOINFORFREE).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.EMAIL);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.PASSWORD);
        driver.findElement(Locators.BUTTON_NEXT).click();


    }


}
