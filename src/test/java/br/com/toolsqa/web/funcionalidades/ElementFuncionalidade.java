package br.com.toolsqa.web.funcionalidades;

import br.com.toolsqa.communs.SeleniumRobot;
import br.com.toolsqa.enums.Web;
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

    public void clicarEmOpcaoCheckBox() {
        this.seleniumRobot.esperarElementoEstarClicavelEClicar(
                this.elementPage.getOpcaoCheckBox());
    }

    private void clicarEmOpcaoWebTables() {
        this.seleniumRobot.esperarElementoEstarClicavelEClicar(
                this.elementPage.getOpcaoWebTables());
    }

    public void clicoNaOpcao(String opcao) {
        switch (opcao) {
            case "TextBox":
                clicarEmOpcaoTextBox();
                break;
            case "CheckBox":
                clicarEmOpcaoCheckBox();
                break;
            case "Web Tables":
                clicarEmOpcaoWebTables();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcao);
        }
    }
}
