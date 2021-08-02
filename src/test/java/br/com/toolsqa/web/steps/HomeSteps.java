package br.com.toolsqa.web.steps;

import br.com.toolsqa.web.funcionalidades.HomeFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeSteps {
    private HomeFuncionalidade homeFuncionalidade;

    public HomeSteps() {
        this.homeFuncionalidade = new HomeFuncionalidade();
    }

    @Dado("que clico no card {string}")
    public void queClicoNoCard(String arg0) {
        this.homeFuncionalidade.clicarNoCardElements();
    }
}
