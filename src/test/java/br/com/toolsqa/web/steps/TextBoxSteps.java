package br.com.toolsqa.web.steps;

import br.com.toolsqa.web.funcionalidades.TextBoxFuncionalidade;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.jupiter.api.Assertions.*;

public class TextBoxSteps {

    private TextBoxFuncionalidade textBoxFuncionalidade;

    public TextBoxSteps() {
        this.textBoxFuncionalidade = new TextBoxFuncionalidade();
    }

    @E("realizo preenchimento dos campos {string}, {string}, {string} e {string}")
    public void realizoPreenchimentoDosCamposE(String nomeCompleto, String email,
                                               String enderecoAtual, String enderecoPermanente) {

        this.textBoxFuncionalidade.aguardaBotaoSubmitFicarVisivelParaPreencherDados();
        this.textBoxFuncionalidade.preencheNome(nomeCompleto);
        this.textBoxFuncionalidade.preencheEmail(email);
        this.textBoxFuncionalidade.preencheEnderecoAtual(enderecoAtual);
        this.textBoxFuncionalidade.preencheEnderecoPermanente(enderecoPermanente);
    }

    @Quando("clico no botao {string}")
    public void clicoNoBotao(String arg0) {
        this.textBoxFuncionalidade.clicarNoBotaoSubmit();
    }

    @Entao("eh apresentado os campos {string}, {string}, {string} e {string} preenchidos corretamente")
    public void ehApresentadoOsCamposEPreenchidos(String nomeCompleto, String email,
                                                  String enderecoAtual, String enderecoPermanente) {

//        System.out.println(this.textBoxFuncionalidade.pegaTextoNomeCompleto());
//        System.out.println(this.textBoxFuncionalidade.pegaTextoEmail());
//        System.out.println(this.textBoxFuncionalidade.pegaTextoEnderecoAtual());
//        System.out.println(this.textBoxFuncionalidade.pegaTextoEnderecoPermanente());
        assertEquals(nomeCompleto, this.textBoxFuncionalidade.pegaTextoNomeCompleto());
        assertEquals(email, this.textBoxFuncionalidade.pegaTextoEmail());
        assertEquals(enderecoAtual, this.textBoxFuncionalidade.pegaTextoEnderecoAtual());
        assertEquals(enderecoPermanente, this.textBoxFuncionalidade.pegaTextoEnderecoPermanente());
    }
}

