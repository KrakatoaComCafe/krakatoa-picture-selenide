package br.com.krakatoa;

import br.com.krakatoa.base.LoginPage;
import br.com.krakatoa.base.WallPage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    private final static String URL = "localhost:3000";

    @Before
    public void setUp() {
        open(URL);
        LoginPage loginPage = new LoginPage();
        loginPage.doLogin();
        Selenide.sleep(2000);
    }

    @Test
    public void searchInputTest() {
        WallPage wallPage = new WallPage();
        wallPage.getSearchInput().setValue("Vitor");
        wallPage.clickSearchButton();

        Selenide.sleep(1000);

        ElementsCollection posts = wallPage.getAllPosts();

        Assert.assertEquals(2, posts.size());
    }
}
