Feature: BillPay Functionality


    Scenario Outline: Login
      Given Navigate to Website1

      When gecerli kullanici adi "<name>" ve password "<code>" ile login olunuz
      Then login oldugunuzu dogrulayiniz
      And logout olunuz
      Examples:
        | name   | code   |
        | kadirD | 352347 |


  Scenario Outline: BillPay elektrik
    Given BillPay Sayfasina gidin

    When elektrik faturasi öde "<faturaName>" ve "<faturaTutar>"
    Examples:
      | faturaName | faturaTutar |
      | elektrik   | 85          |

#    Then elektrik faturanın ödendigini dogrula

#
#  Scenario Outline: BillPay su
#    Given BillPay Sayfasina gidin
#
#    When su faturasi öde "<faturaName>" ve "<faturaTutar>"
#    Examples:
#      | faturaName | faturaTutar |
#      | su         | 45          |
#
#    Then su faturanın ödendigini dogrula
#
#  Scenario Outline: BillPay dogalgaz
#    Given BillPay Sayfasina gidin
#
#    When dogalgaz faturasi öde "<faturaName>" ve "<faturaTutar>"
#    Examples:
#      | faturaName | faturaTutar |
#      | dogalgaz   | 120         |
#
#    Then dogalgaz faturanın ödendigini dogrula

