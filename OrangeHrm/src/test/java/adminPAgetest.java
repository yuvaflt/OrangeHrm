import org.testng.annotations.Test;

public class adminPAgetest extends baseTest {
    @Test
    public void test002(){
        statLoginPage().LogInPIMPage(). navigateToAdminPage().serachUserName("Aaliyah.Haq");
    }
}
