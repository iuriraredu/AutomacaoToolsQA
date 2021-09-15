package br.com.toolsqa.web.steps;

import br.com.toolsqa.web.funcionalidades.ButtonsFuncionalidade;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.jupiter.api.Assertions.*;

public class ButtonsStep {

    private ButtonsFuncionalidade buttonsFuncionalidade;
    public ButtonsStep() {
        this.buttonsFuncionalidade = new ButtonsFuncionalidade();
    }

    @Quando("clico duas vezes seguidas em {string}")
    public void clicoDuasVezesSeguidasEm(String textoDoBotao){
        this.buttonsFuncionalidade.clicaDuasVezesNoBotao(textoDoBotao);
    }

    @Quando("clico com o botao direito do mouse em {string}")
    public void clicoComOBotaoDireitoDoMouseEm(String textoDoBotao) {
        this.buttonsFuncionalidade.clicaComBotaoDireito(textoDoBotao);
    }

    @Quando("clico no botao com texto {string}")
    public void clicoNoBotaoComTexto(String textoDoBotao) {
        this.buttonsFuncionalidade.clicaNoBotao(textoDoBotao);
    }

    @Entao("visualizo a mensagem {string}")
    public void visualizoAMensagem(String mensagem) {
        assertEquals(mensagem, this.buttonsFuncionalidade.pegaMensagem(mensagem));
    }
}
