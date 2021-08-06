package br.com.toolsqa.web.steps;

import br.com.toolsqa.web.funcionalidades.FormsFuncionalidades;
import io.cucumber.java.pt.Dado;

public class FormsSteps {
    private FormsFuncionalidades formsFuncionalidades;

    public FormsSteps() {
        this.formsFuncionalidades = new FormsFuncionalidades();
    }

    @Dado("que navego ate a pagina de {string}")
    public void queNavegoAteAPaginaDe(String arg0) {
        this.formsFuncionalidades.clicaEmPracticeForm();
    }
}

