package br.com.toolsqa.web.funcionalidades;

import br.com.toolsqa.communs.SeleniumRobot;
import br.com.toolsqa.settings.BaseTest;
import br.com.toolsqa.web.pages.HomePage;

public class HomeFuncionalidade extends BaseTest {

    private HomePage homePage;
    private SeleniumRobot seleniumRobot;

    public HomeFuncionalidade() {
        this.homePage = new HomePage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void clicarNoCardElements() {
        this.seleniumRobot.scroll();
        this.seleniumRobot.esperarElementoEstarClicavelEClicar(
                this.homePage.getCardElements()
        );
    }

    public void clicarNoCardForms() {
        this.seleniumRobot.scroll();
        this.seleniumRobot.esperarElementoEstarClicavelEClicar(
                this.homePage.getCardForms()
        );
    }

    public void clicoNoCard(String opcao) {
        if (opcao.equals("Elements"))
            clicarNoCardElements();
        else if (opcao.equals("Forms"))
            clicarNoCardForms();
    }
}
