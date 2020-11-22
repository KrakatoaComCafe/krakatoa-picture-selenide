package br.com.krakatoa.base;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class LoginPage {

    private final static String INPUT = "input";
    private final static String USER = "alots";
    private final static String PASSWORD = "123456";

    private SelenideElement inputName;
    private SelenideElement inputPassword;
    private SelenideElement button;

    public LoginPage() {
        ElementsCollection form = $$(INPUT);
        this.inputName = form.get(0);
        this.inputPassword = form.get(1);
        this.button = form.get(2);
    }

    public SelenideElement inputUser() {
        return this.inputName.setValue(USER);
    }

    public SelenideElement inputPassword() {
        return this.inputPassword.setValue(PASSWORD);
    }

    public void doLogin() {
        if (!USER.equals(this.inputPassword.getValue())) this.inputUser();
        if (!PASSWORD.equals(this.inputPassword.getValue())) this.inputPassword();
        this.button.click();
    }
}
