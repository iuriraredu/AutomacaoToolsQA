package br.com.toolsqa.web.funcionalidades;

import br.com.toolsqa.communs.SeleniumRobot;
import br.com.toolsqa.settings.BaseTest;
import br.com.toolsqa.web.pages.FormsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FormsFuncionalidades extends BaseTest {
    private FormsPage formsPage;
    private SeleniumRobot seleniumRobot;

    public FormsFuncionalidades() {
        this.formsPage = new FormsPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void clicaEmPracticeForm(){
        seleniumRobot.esperarElementoEstarClicavelEClicar(this.formsPage.getOpcaoPracticeForm());
    }

}
