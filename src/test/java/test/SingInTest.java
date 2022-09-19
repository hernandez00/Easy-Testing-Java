package test;

import java.time.Duration;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.Login;
import pages.Dashboard;

public class SingInTest {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void test() {
        driver.get("https://easy.unidas.com.br/login");
        //Criando instância das classes Login e Dashboard utilizando o initElements()
        Login loginPG = PageFactory.initElements(driver, Login.class);
        Dashboard dashPG = PageFactory.initElements(driver, Dashboard.class);

        loginPG.Login_Action("41328599833", "a@449f9054");
        System.out.println(driver.getTitle());
        Assert.isTrue(dashPG.isLogged(), "Deu ruim!");
    }

}
