import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SelTest {
    private WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }
    @Test
    public void test1() {
        driver.get("http://www.huidinglc.com");
        //System.out.println(driver.getTitle());
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(driver.getTitle(),"首页1","首页Title有问题");
        softAssert.assertAll();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
