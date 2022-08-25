import org.testng.annotations.Test;

public class PIMTest extends baseTest {
    //WebDriver driver;
    @Test
    public void Test01(){
        statLoginPage().LogInPIMPage().searchEmployeeId("0083").validateFirstAndLastName("Joe","Root");



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

