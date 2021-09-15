package br.com.toolsqa.web.funcionalidades;

import br.com.toolsqa.communs.SeleniumRobot;
import br.com.toolsqa.settings.BaseTest;
import br.com.toolsqa.web.pages.HomePage;
import org.openqa.selenium.WebElement;

public class HomeFuncionalidade extends BaseTest {

    private HomePage homePage;
    private SeleniumRobot seleniumRobot;

    public HomeFuncionalidade() {
        this.homePage = new HomePage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void clicarNoCardElements() {
        realizarScrollEsperarEstarVisivelEClicar(this.homePage.getCardElements());
    }

    public void clicarNoCardForms() {
        realizarScrollEsperarEstarVisivelEClicar(this.homePage.getCardForms());
    }

    private void realizarScrollEsperarEstarVisivelEClicar(WebElement elements) {
        this.seleniumRobot.scroll();
        this.seleniumRobot.esperarElementoEstarClicavelEClicar(elements);
    }

    public void clicoNoCard(String opcao) {
        switch (opcao) {
            case "Elements":
                clicarNoCardElements();
                break;
            case "Forms":
                clicarNoCardForms();
                break;
        }
    }
}
