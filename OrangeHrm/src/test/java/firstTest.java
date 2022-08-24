import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.loginPage;

public class firstTest extends baseTest {
    //WebDriver driver;
    @Test
    public void Test01(){
        statLoginPage().LogInPIMPage();

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
    }
    @Test
    public void Test02(){

    }




    }

