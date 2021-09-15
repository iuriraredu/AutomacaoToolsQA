package br.com.toolsqa.web.funcionalidades;

import br.com.toolsqa.communs.SeleniumRobot;
import br.com.toolsqa.settings.BaseTest;
import br.com.toolsqa.web.pages.CheckBoxPage;

public class CheckBoxFuncionalidade extends BaseTest {
    private CheckBoxPage checkBoxPage;
    private SeleniumRobot seleniumRobot;

    public CheckBoxFuncionalidade() {
        this.checkBoxPage = new CheckBoxPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void clicaNaSeta(String nomeSeta) {
        switch (nomeSeta) {
            case "Home":
                this.seleniumRobot.esperarElementoEstarClicavelEClicar(
                        this.checkBoxPage.getSetaHome()
                );
                break;
            case "Documents":
                this.seleniumRobot.esperarElementoEstarClicavelEClicar(
                        this.checkBoxPage.getSetaDocuments()
                );
                break;
            case "Office":
                this.seleniumRobot.esperarElementoEstarClicavelEClicar(
                        this.checkBoxPage.getSetaOffice()
                );
                break;
        }

    }

    public void clicoEmPrivate() {
        this.seleniumRobot.esperarElementoEstarClicavelEClicar(
                this.checkBoxPage.getOpcaoPrivate()
        );
    }

    public String pegaMensagem() {
        return "You have selected :" + this.checkBoxPage.getResultado().getText();
    }
}
