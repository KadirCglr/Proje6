package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

//POM: Page Object Model
public class DialogContent extends Parent {
    //kullanıcıdan dialog la veri alan bölümler(açılan küçük pencerelere dialog denir)
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerButton;

    @FindBy(name = "customer.firstName")
    public WebElement firstName;


    @FindBy(name = "customer.lastName")
    public WebElement lastNameField;


    @FindBy(name = "customer.address.street")
    public WebElement addressField;

    @FindBy(name = "customer.address.city")
    public WebElement cityField;

    @FindBy(name = "customer.address.state")
    public WebElement stateField;

    @FindBy(name = "customer.address.zipCode")
    public WebElement zipCodeField;


    @FindBy(name = "customer.phoneNumber")
    public WebElement phoneNumberField;

    @FindBy(name = "customer.ssn")
    public WebElement ssnField;

    @FindBy(name = "customer.username")
    public WebElement usernameField;

    @FindBy(name = "customer.password")
    public WebElement passwordField;

    @FindBy(name = "repeatedPassword")
    public WebElement confirmPasswordField;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement registerClick;

    @FindBy(xpath = "//p[text()='Your account was created successfully. You are now logged in.']")
    public WebElement dogrulama1;

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//b[text()='Welcome']")
    public WebElement dogrulama2;

    @FindBy(xpath = "//a[text()='Log Out']")
    public WebElement logoutButton;

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement dogrulama3;

    @FindBy(xpath = "//a[text()='Bill Pay']")
    public WebElement billPayButton;


    @FindBy(name = "payee.name")
    public WebElement payeeName;

    @FindBy(name = "payee.address.street")
    public WebElement adress;

    @FindBy(name = "payee.address.city")
    public WebElement city;


    @FindBy(name = "payee.address.state")
    public WebElement state;


    @FindBy(name = "payee.address.zipCode")
    public WebElement zipcode;


    @FindBy(name = "payee.phoneNumber")
    public WebElement phone;


    @FindBy(name = "payee.accountNumber")
    public WebElement account;

    @FindBy(name = "verifyAccount")
    public WebElement verifyaccount;

    @FindBy(name = "amount")
    public WebElement amount;

    @FindBy(xpath = "//input[@type='submit'")
    public WebElement sendPayment;






}





