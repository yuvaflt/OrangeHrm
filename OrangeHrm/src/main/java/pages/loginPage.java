package pages;

import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    @FindBy(css = "input[name='username']") private WebElement userName;
    @FindBy(css = "input[name=\"password\"]") private  WebElement password;
    @FindBy(xpath = "//button[@type=\"submit\"]") private  WebElement Login;

    public PIMPage LogInPIMPage(){
        userName.sendKeys(Info.USER_NAME);
        password.sendKeys(Info.PASSWORD);
        Login.click();
        return PageFactory.initElements(Browser.driver, PIMPage.class);

    }
}
