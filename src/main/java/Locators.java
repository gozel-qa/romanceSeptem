import org.openqa.selenium.By;

public class Locators {

   //MediaPage
   public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/users/search']");

   //RegistrationPage
   public static final By LINK_JOINFORFREE = By.xpath("//button[@id='show-registration-block']");
   public static final By TEXT_FIELD_EMAIL = By.xpath("//input[@id='email']");
   public static final By TEXT_FIELD_PASSWORD = By.id("password");
   public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");



}
