package starter.stepdefinitions;

import net.thucydides.core.annotations.Step;

public class LoginStep {
    FacebookLogin facebookLogin;

    @Step
    public void OpenFacebookPage() {
        facebookLogin.open();
    }
    @Step
    public void InputEmailandPassword() {
        facebookLogin.InputEmail();
        facebookLogin.InputPassword();
    }
    @Step
    public void KlikButtonLogin() {
        facebookLogin.ClickButtonLogin();
    }
    @Step
    public void Icanseemynewsfeed() {
        facebookLogin.Icanseemynewsfeed();
    }
}
