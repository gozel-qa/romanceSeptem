import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseUI{


    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    String currentUrlSearch;
    String expectedUrlSearch= "https://romanceabroad.com/users/search";


    @Test
    public void testSearchPage () {

        driver.findElement(LINK_SEARCH).click();
        currentUrlSearch=driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);

    }
}
