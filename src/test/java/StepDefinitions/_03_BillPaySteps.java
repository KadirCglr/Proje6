package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_BillPaySteps {

    DialogContent dc=new DialogContent();

    @Given("Navigate to Website1")
    public void navigateToWebsite1() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("gecerli kullanici adi {string} ve password {string} ile login olunuz")
    public void gecerliKullaniciAdiVePasswordIleLoginOlunuz(String name, String code) {
        dc.sendKeysFunction(dc.username, name);
        dc.sendKeysFunction(dc.password, code);
        dc.clickFunction(dc.loginButton);

    }
    @Given("BillPay Sayfasina gidin")
    public void billpaySayfasinaGidin() {
        dc.clickFunction(dc.billPayButton);

    }


    @When("elektrik faturasi öde {string} ve {string}")
    public void elektrikFaturasiÖdeVe(String faturaName, String faturaTutar) {
        dc.sendKeysFunction(dc.payeeName, faturaName);
        dc.sendKeysFunction(dc.adress, "samsunBafra");
        dc.sendKeysFunction(dc.city, "samsun");
        dc.sendKeysFunction(dc.state,"doguKaradeniz");
        dc.sendKeysFunction(dc.zipcode, "55400");
        dc.sendKeysFunction(dc.phone, "1423654");
        dc.sendKeysFunction(dc.account, "kc101");
        dc.sendKeysFunction(dc.verifyaccount, "kc101");
        dc.sendKeysFunction(dc.amount, faturaTutar);
        dc.clickFunction(dc.sendPayment);
    }

//    @Then("elektrik faturanın ödendigini dogrula")
//    public void elektrikFaturanınÖdendiginiDogrula() {
//    }
//
//    @When("su faturasi öde {string} ve {string}")
//    public void suFaturasiÖdeVe(String faturaName, String faturaTutar) {
//    }
//
//    @Then("su faturanın ödendigini dogrula")
//    public void suFaturanınÖdendiginiDogrula() {
//    }
//
//    @When("dogalgaz faturasi öde {string} ve {string}")
//    public void dogalgazFaturasiÖdeVe(String faturaName, String faturaTutar) {
//    }
//
//    @Then("dogalgaz faturanın ödendigini dogrula")
//    public void dogalgazFaturanınÖdendiginiDogrula() {
//    }
}
