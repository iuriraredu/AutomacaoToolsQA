package br.com.toolsqa.web.steps;

import br.com.toolsqa.web.funcionalidades.HomeFuncionalidade;
import io.cucumber.java.pt.Dado;

public class HomeSteps {
    private HomeFuncionalidade homeFuncionalidade;

    public HomeSteps() {
        this.homeFuncionalidade = new HomeFuncionalidade();
    }

    @Dado("que clico no card {string}")
    public void queClicoNoCard(String opcao) {
        this.homeFuncionalidade.clicoNoCard(opcao);
    }
}
