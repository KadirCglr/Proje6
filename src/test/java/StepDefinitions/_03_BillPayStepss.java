package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_BillPayStepss {

    DialogContent dc=new DialogContent();
    @Given("Navigate to Websitee")
    public void navigateToWebsitee() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("username password ile giriş yap")
    public void usernamePasswordIleGirişYap() {
        dc.sendKeysFunction(dc.username, "kadirD");
        dc.sendKeysFunction(dc.password, "352347");
        dc.clickFunction(dc.loginButton);
    }

    @Then("BillPay Sayfasina gidin")
    public void billpaySayfasinaGidin() {
        dc.clickFunction(dc.billPayButton);
        dc.sendKeysFunction(dc.payeeName, "elektrik");
        dc.sendKeysFunction(dc.adress, "bafra");
        dc.sendKeysFunction(dc.city, "samsun");
        dc.sendKeysFunction(dc.state, "karadeniz");
        dc.sendKeysFunction(dc.zipcode, "55400");
        dc.sendKeysFunction(dc.phone, "123456789");
        dc.sendKeysFunction(dc.account, "23112");
        dc.sendKeysFunction(dc.verifyaccount, "23112");
        dc.sendKeysFunction(dc.amount, "85");
        dc.clickFunction(dc.sendPayment);
        dc.verifyContainsTextFunction(dc.dogrulama4, "Bill Payment Complete");

    }

    @And("su faturasini olustur")
    public void suFaturasiniOlustur() {
        dc.clickFunction(dc.billPayButton);
        dc.sendKeysFunction(dc.payeeName, "su");
        dc.sendKeysFunction(dc.adress, "bafra");
        dc.sendKeysFunction(dc.city, "samsun");
        dc.sendKeysFunction(dc.state, "karadeniz");
        dc.sendKeysFunction(dc.zipcode, "55400");
        dc.sendKeysFunction(dc.phone, "123456789");
        dc.sendKeysFunction(dc.account, "23112");
        dc.sendKeysFunction(dc.verifyaccount, "23112");
        dc.sendKeysFunction(dc.amount, "45");
        dc.clickFunction(dc.sendPayment);

    }

    @Then("su faturusinin odendigini dogrula")
    public void suFaturusininOdendiginiDogrula() {
        dc.verifyContainsTextFunction(dc.dogrulama4, "Bill Payment Complete");

    }

    @And("dogalgaz faturasini olustur")
    public void dogalgazFaturasiniOlustur() {
        dc.clickFunction(dc.billPayButton);
        dc.sendKeysFunction(dc.payeeName, "dogalgazk");
        dc.sendKeysFunction(dc.adress, "bafra");
        dc.sendKeysFunction(dc.city, "samsun");
        dc.sendKeysFunction(dc.state, "karadeniz");
        dc.sendKeysFunction(dc.zipcode, "55400");
        dc.sendKeysFunction(dc.phone, "123456789");
        dc.sendKeysFunction(dc.account, "23112");
        dc.sendKeysFunction(dc.verifyaccount, "23112");
        dc.sendKeysFunction(dc.amount, "120");
        dc.clickFunction(dc.sendPayment);

    }

    @Then("dogalgaz faturasinin ödendigini dogrula")
    public void dogalgazFaturasininÖdendiginiDogrula() {
        dc.verifyContainsTextFunction(dc.dogrulama4, "Bill Payment Complete");
    }
}
