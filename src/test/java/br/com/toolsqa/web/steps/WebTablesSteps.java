package br.com.toolsqa.web.steps;

import br.com.toolsqa.web.funcionalidades.WebTablesFuncionalidade;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.jupiter.api.Assertions.*;

public class WebTablesSteps {
    private WebTablesFuncionalidade webTablesFuncionalidade;

    public WebTablesSteps() {
        this.webTablesFuncionalidade = new WebTablesFuncionalidade();
    }

    @E("clico no botao de {string}")
    public void clicoNoBotaoDe(String arg0) {
        this.webTablesFuncionalidade.clicarNoBotaoAdd();
    }

    @E("preencho os dados solicitados")
    public void preenchoOsDadosSolicitados() {
        this.webTablesFuncionalidade.preencheOsCampos(
                "Iuri","Ramos","iuri@teste.com",
                28,"1500","QA"
        );
    }

    @E("clico no botao com o simbolo de um lapis na linha de First Name {string}")
    public void clicoNoBotaoComOSimboloDeUmLapisNaLinhaDeFirstName(String primeiroNome) {
        this.webTablesFuncionalidade.clicarNoBotaoEditar(primeiroNome);
    }

    @E("altero os dados solicitados")
    public void alteroOsDadosSolicitados() {
        this.webTablesFuncionalidade.alteraDados(
                "Iuri","Ramos","iuri@teste.com",
                28,"1500","QA"
        );
    }

    @Quando("clico no botao para {string}")
    public void clicoNoBotaoPara(String arg0) {
        this.webTablesFuncionalidade.clicarNoBotaoSubmit();
    }

    @Quando("clico no botao com o simbolo de um lixeira na linha de First Name {string} e Last Name {string}")
    public void clicoNoBotaoComOSimboloDeUmLixeiraNaLinhaDeFirstName(String primeiroNome, String ultimoNome) {
        this.webTablesFuncionalidade.clicarNoBotaoExcluir(primeiroNome, ultimoNome);
    }

    @Entao("eh listado os dados inseridos na Web Table")
    public void ehListadoOsDadosInseridosNaWebTable() {
        assertTrue(this.webTablesFuncionalidade.verificaSeEncontraLinhaComOsDados(
                "Iuri", "Ramos", "iuri@teste.com",
                "28", "1500", "QA"
        ));
    }

    @Entao("eh atualizado os dados da linha da Web Table")
    public void ehAtualizadoOsDadosDaLinhaDaWebTable() {
        assertTrue(this.webTablesFuncionalidade.verificaSeEncontraLinhaComOsDados(
                "Iuri", "Ramos", "iuri@teste.com",
                "28", "1500", "QA"
        ));
    }

    @Entao("a linha de First Name {string} da Web Table não está mais visivel")
    public void aLinhaDeFirstNameDaWebTableNaoEstaMaisVisivel(String arg0) {
        boolean teste = this.webTablesFuncionalidade.verificaSeEncontraLinhaComOsDados(
                "Cierra", "Vega", "cierra@example.com",
                "39", "10000", "Insurance"
        );
        //System.out.println(teste);
        assertFalse(teste);
    }
}


