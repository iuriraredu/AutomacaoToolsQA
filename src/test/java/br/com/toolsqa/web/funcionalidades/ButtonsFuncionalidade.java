package br.com.toolsqa.web.funcionalidades;

import br.com.toolsqa.communs.SeleniumRobot;
import br.com.toolsqa.settings.BaseTest;
import br.com.toolsqa.web.pages.ButtonsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsFuncionalidade extends BaseTest {

    private ButtonsPage buttonsPage;
    private SeleniumRobot seleniumRobot;
    private Actions action;

    public ButtonsFuncionalidade() {
        this.buttonsPage = new ButtonsPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
        this.action = new Actions(webDriver);
    }

    public void clicaDuasVezesNoBotao(String textoDoBotao) {
        WebElement botao = this.buttonsPage.getBotaoPorText(textoDoBotao);
        seleniumRobot.esperarElementoEstarVisivel(botao);
        action.doubleClick(botao).perform();
    }

    public void clicaComBotaoDireito(String textoDoBotao) {
        WebElement botao = this.buttonsPage.getBotaoPorText(textoDoBotao);
        seleniumRobot.esperarElementoEstarVisivel(botao);
        action.contextClick(botao).perform();
    }

    public void clicaNoBotao(String textoDoBotao) {
        this.buttonsPage.getBotaoPorText(textoDoBotao).click();
    }

    public String pegaMensagem(String mensagem) {
        if (mensagem.contains("You have done a double click"))
            return this.buttonsPage.getMensagemDoubleClick().getText();
        if (mensagem.contains("You have done a right click"))
            return this.buttonsPage.getMensagemRightClick().getText();
        if (mensagem.contains("You have done a dynamic click"))
            return this.buttonsPage.getMensagemClickSimples().getText();
        return "deu erro meu anjo";
    }
}
