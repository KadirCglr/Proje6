package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.val;

public class _02_LoginSteps {

    DialogContent dc=new DialogContent();
    @Given("Navigate to site")
    public void navigateTosite() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("gecerli kullanici adi {string} ve password {string} ile login olunuz")
    public void gecerliKullaniciAdiVePasswordIleLoginOlunuz(String name, String code) {
        dc.sendKeysFunction(dc.username, name);
        dc.sendKeysFunction(dc.password, code);
        dc.clickFunction(dc.loginButton);

    }

    @Then("login oldugunuzu dogrulayiniz")
    public void loginOldugunuzuDogrulayiniz() {
        dc.verifyContainsTextFunction(dc.dogrulama2, "Welcome");
    }

    @And("logout olunuz")
    public void logoutOlunuz() {
        dc.clickFunction(dc.logoutButton);
    }

    @When("gecersiz kullanici adi {string} ve password {string} ile login olunuz")
    public void gecersizKullaniciAdiVePasswordIleLoginOlunuz(String name, String code) {
        dc.sendKeysFunction(dc.username, name);
        dc.sendKeysFunction(dc.password, code);
        dc.clickFunction(dc.loginButton);

    }

    @Then("login olmadiginizi dogrulayiniz")
    public void loginOlmadiginiziDogrulayiniz() {
        dc.verifyContainsTextFunction(dc.dogrulama3, "Error");
    }





}
