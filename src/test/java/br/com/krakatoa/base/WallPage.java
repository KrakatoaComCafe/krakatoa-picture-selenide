package br.com.krakatoa.base;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class WallPage {

    private SelenideElement searchInput;
    private SelenideElement searchButton;

    public WallPage() {
        this.searchInput = Selenide.$(By.xpath("//*[@id=\"root\"]/div/header/form/input[1]"));
        this.searchButton = Selenide.$(By.xpath("//*[@id=\"root\"]/div/header/form/input[2]"));
    }

    public SelenideElement getSearchInput() {
        return this.searchInput;
    }

    public void clickSearchButton() {
        this.searchButton.click();
    }

    public ElementsCollection getAllPosts() {
        return Selenide.$$(By.className("foto"));
    }
}
