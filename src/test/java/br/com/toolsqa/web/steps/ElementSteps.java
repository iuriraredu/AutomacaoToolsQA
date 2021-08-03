package br.com.toolsqa.web.steps;

import br.com.toolsqa.web.funcionalidades.ElementFuncionalidade;
import io.cucumber.java.pt.Dado;

public class ElementSteps {

    private ElementFuncionalidade elementFuncionalidade;

    public ElementSteps() {
        this.elementFuncionalidade = new ElementFuncionalidade();
    }

    @Dado("que navego ate pagina de {string}")
    public void queNavegoAtePaginaDe(String opcao) {
        //this.elementFuncionalidade.clicarEmMenuELements();
        this.elementFuncionalidade.clicoNaOpcao(opcao);
    }
}
