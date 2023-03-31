package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _01_RegisterSteps {

    DialogContent dc=new DialogContent();



    @Given("Navigate to Website")
    public void navigateToWebsite() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }


    @When("Para Bank sitesinde bir hesap açınız")
    public void paraBankSitesindeBirHesapAciniz() {
        dc.clickFunction(dc.registerButton);
        dc.sendKeysFunction(dc.firstName, "kadir");
        dc.sendKeysFunction(dc.lastNameField, "caglar");
        dc.sendKeysFunction(dc.addressField, "samsun");
        dc.sendKeysFunction(dc.cityField, "bafra");
        dc.sendKeysFunction(dc.stateField, "çarşamba");
        dc.sendKeysFunction(dc.zipCodeField, "55400");
        dc.sendKeysFunction(dc.phoneNumberField, "05454788774");
        dc.sendKeysFunction(dc.ssnField, "12345");
        dc.sendKeysFunction(dc.usernameField, "kadirD");
        dc.sendKeysFunction(dc.passwordField, "352347");
        dc.sendKeysFunction(dc.confirmPasswordField,"352347");
        dc.waitUntilClickable(dc.registerClick);
        dc.clickFunction(dc.registerClick);


    }

    @Then("Hesabın açıldığını dogrulayınız")
    public void hesabinAcildiginiDogrulayiniz() {
        dc.verifyContainsTextFunction(dc.dogrulama1, "Your account");







    }


}
