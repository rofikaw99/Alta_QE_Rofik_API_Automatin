package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginFacebookStepDefinition {

    @Steps
    LoginStep loginStep;

    @Given("I open Facebook login page")
    public void IopenFacebookloginpage(){
        loginStep.OpenFacebookPage();
    }
    @When("I input email and password")
    public void Iinputemailandpassword(){
        loginStep.InputEmailandPassword();

    }
    @When("I click button login")
    public void Iclickbuttonlogin(){
        loginStep.KlikButtonLogin();

    }
    @Then("I can see my news feed")
    public void Icanseemynewsfeed(){
        loginStep.Icanseemynewsfeed();

    }

}
