import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//created javaClass
//always with capital letter
public class MainPage {

    //putting the variable in a separate String and outside the method in the class, other methods have access
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    //String variables
    String currentUrlSearch;
    String expectedUrlSearch= "https://romanceabroad.com/users/search";
    String currentUrlMedia;
    String expectedUrlMedia ="https://romanceabroad.com/media/index";
    //By variable
    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_MEDIA =By.cssSelector("a[@href='https://romanceabroad.com/users/search']");
    By LINK_JOINFORFREE =By.xpath("//button[@id='show-registration-block']");


    //creating first java method
    //public means public access
    //void  - returns no data (e.g. string or integer)
    //name the method using camalCase

    @BeforeMethod //executed first TestNG annotation
    public void setUp(){
        //Selelnium has a lot of methods that we can use.
        //To use those methods we need to create the object of that method
        // WebDriver driver(object name)

        //we use chromedriver
        //earlier we needed to set System.setProperties. Not anymore
        //System.setProperty("webdriver.chrome.driver","/Users/guzel/Desktop/romancesep/chromedriver" );
        //we initialize the driver.
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);


    }
    @Test
    public void testSearchPage () {

        driver.findElement(LINK_SEARCH).click();
        currentUrlSearch=driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);

    }
    @Test
    public void testMediaPage (){

        driver.findElement(LINK_MEDIA).click();
        currentUrlMedia=driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, expectedUrlMedia);

    }

    @Test
    public void JoinForFreeNow (){

        driver.findElement(LINK_JOINFORFREE).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("qaractice@gmail.com");
        driver.findElement(By.id("password")).sendKeys("september2023!");
        driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();


    }

    @AfterMethod
    public void afterActions(){

        driver.quit();

    }

}
