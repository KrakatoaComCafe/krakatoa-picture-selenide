package br.com.krakatoa;

import br.com.krakatoa.base.LoginPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {

    private final static String URL = "localhost:3000";

    @Before
    public void setUp() {
//        Configuration.headless = true;
        open(URL);
    }

    @Test
    public void doLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.inputUser();
        loginPage.inputPassword();
        loginPage.doLogin();

        Selenide.sleep(1000);
        SelenideElement header = $("header").shouldBe(Condition.visible);

        Assertions.assertEquals("Krakatoa Pictures\n♡", header.getText());
    }
}
