
import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.loginPage;

import java.time.Duration;

public class baseTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = Browser.getDriver();
        driver.navigate().to(Info.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
    public loginPage statLoginPage(){
        return PageFactory.initElements(driver, loginPage.class);
    }
}
