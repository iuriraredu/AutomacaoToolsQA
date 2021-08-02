package br.com.toolsqa.web.funcionalidades;

import br.com.toolsqa.communs.SeleniumRobot;
import br.com.toolsqa.settings.BaseTest;
import br.com.toolsqa.web.pages.TextBoxPage;

public class TextBoxFuncionalidade extends BaseTest {

    private TextBoxPage textBoxPage;
    private SeleniumRobot seleniumRobot;

    public TextBoxFuncionalidade() {
        this.textBoxPage = new TextBoxPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void preencheNome(String nomeCompleto) {
        this.textBoxPage.getInputNomeCompleto().sendKeys(nomeCompleto);
    }

    public void preencheEmail(String email) {
        this.textBoxPage.getInputEmail().sendKeys(email);
    }

    public void preencheEnderecoAtual(String enderecoAtual) {
        this.textBoxPage.getInputEnderecoAtual().sendKeys(enderecoAtual);
    }

    public void preencheEnderecoPermanente(String enderecoPermanente) {
        this.textBoxPage.getInputEnderecoPermanente().sendKeys(enderecoPermanente);
    }

    public void aguardaBotaoSubmitFicarVisivelParaPreencherDados() {
        this.seleniumRobot.esperarElementoEstarVisivel(this.textBoxPage.getBotaoSubmit());
    }

    public void clicarNoBotaoSubmit() {
        this.seleniumRobot.scroll();
        this.textBoxPage.getBotaoSubmit().click();
    }

    public String pegaTextoNomeCompleto() {
        return this.textBoxPage.getParagrafoNome().getText().replace("Name:", "");
    }

    public String pegaTextoEmail() {
        return this.textBoxPage.getParagrafoEmail().getText().replace("Email:", "");
    }

    public String pegaTextoEnderecoAtual() {
        return this.textBoxPage.getParagrafoEnderecoAtual().getText().replace("Current Address :","");
    }

    public String pegaTextoEnderecoPermanente() {
        return this.textBoxPage.getParagrafoEnderecoPermanente().getText().replace("Permananet Address :","");
    }
}
