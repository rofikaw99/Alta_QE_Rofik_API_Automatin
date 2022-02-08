package starter.stepdefinitions;




import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://www.facebook.com/")
public class FacebookLogin extends PageObject {

    @WhenPageOpens
    public void waitUntilTittleAppears() {

    }
    @FindBy(id="email")
    WebElement fieldEmail;
    public void InputEmail() {
        fieldEmail.sendKeys("halland@gmail.com");
    }
    @FindBy(id="passContainer")
    WebElement fieldPassword;
    public void InputPassword() {
        fieldPassword.sendKeys("automatise7");
    }


    @FindBy(how= How.NAME, using="login")
    WebElement fieldButtonLogin;

    public void ClickButtonLogin() {
        fieldButtonLogin.click();
    }

    public void Icanseemynewsfeed() {
    }
}
