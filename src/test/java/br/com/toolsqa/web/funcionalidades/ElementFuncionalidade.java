package br.com.toolsqa.web.funcionalidades;

import br.com.toolsqa.communs.SeleniumRobot;
import br.com.toolsqa.settings.BaseTest;
import br.com.toolsqa.web.pages.ElementPage;


public class ElementFuncionalidade extends BaseTest {

    private ElementPage elementPage;
    private SeleniumRobot seleniumRobot;

    public ElementFuncionalidade() {
        this.elementPage = new ElementPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void clicarEmMenuELements() {
        this.seleniumRobot.esperarElementoEstarClicavelEClicar(this.elementPage.getMenuElements());

    }

    public void clicarEmOpcaoTextBox() {
        this.seleniumRobot.esperarElementoEstarClicavelEClicar(
                this.elementPage.getOpcaoTextBox());
    }
}
