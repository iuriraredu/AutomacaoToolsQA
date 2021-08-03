package br.com.toolsqa.web.steps;

import br.com.toolsqa.web.funcionalidades.CheckBoxFuncionalidade;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.*;

public class CheckBoxSteps {
    private CheckBoxFuncionalidade checkBoxFuncionalidade;
    public CheckBoxSteps() {
        this.checkBoxFuncionalidade = new CheckBoxFuncionalidade();
    }

    @E("clico na seta ao lado de {string}")
    public void clicoNaSetaAoLadoDe (String nomeSeta) {
        this.checkBoxFuncionalidade.clicaNaSeta(nomeSeta);
    }

    @Quando("clico em {string}")
    public void clicoEm(String arg0) {
        this.checkBoxFuncionalidade.clicoEmPrivate();
    }

    @Entao("é apresentado a mensagem {string}")
    public void éApresentadoAMensagem(String mensagem) {
        System.out.println(this.checkBoxFuncionalidade.pegaMensagem());
        assertEquals(mensagem, this.checkBoxFuncionalidade.pegaMensagem());
    }
}
