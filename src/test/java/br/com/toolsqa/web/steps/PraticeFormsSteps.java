package br.com.toolsqa.web.steps;

import br.com.toolsqa.web.funcionalidades.PraticeFormsFuncionalidade;
import io.cucumber.java.pt.E;

public class PraticeFormsSteps {
    private PraticeFormsFuncionalidade praticeFormsFuncionalidade;


    public PraticeFormsSteps() {
        this.praticeFormsFuncionalidade = new PraticeFormsFuncionalidade();
    }

    @E("^preencho todos os campos com dados validos$")
    public void preenchoTodosOsCamposComDadosValidos() {
    }
}

