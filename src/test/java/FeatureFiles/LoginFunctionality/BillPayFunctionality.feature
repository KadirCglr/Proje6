Feature: BillPay Functionality


  Scenario: Login
    Given Navigate to Websitee
    When username password ile giriş yap
    Then BillPay Sayfasina gidin

    And su faturasini olustur
    Then su faturusinin odendigini dogrula

    And dogalgaz faturasini olustur
    Then dogalgaz faturasinin ödendigini dogrula



