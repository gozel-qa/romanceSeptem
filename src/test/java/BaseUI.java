import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    WebDriver driver;
    String mainUrl = "https://romanceabroad.com/";


    @BeforeMethod //executed first TestNG annotation
    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);


    }

    @AfterMethod
    public void afterActions(){

        //driver.quit();

    }
}
