package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

    final WebDriver driver;
    //Construtor. Toda página precisará do webdriver para encontrar os elementos
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    //Localizando o campo do CPF (Usuário)
    @FindBy(xpath = "//input[@formcontrolname = 'document']")
    WebElement input_document;

    //Localizando o campo senha
    @FindBy(xpath = "//input[@formcontrolname = 'password']")
    WebElement input_password;

    //Localizando o botão Continuar (Login)
    @FindBy(xpath = "//button[contains(text(), 'Continuar')]")
    WebElement button_login;

    //Metodo para fazer login no sistema
    public void Login_Action(String userDoc, String userPwd) {
        input_document.sendKeys(userDoc);
        input_password.sendKeys(userPwd);
        button_login.click();
    }
}
