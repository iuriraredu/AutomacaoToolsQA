package br.com.toolsqa.web.funcionalidades;

import br.com.toolsqa.communs.SeleniumRobot;
import br.com.toolsqa.settings.BaseTest;
import br.com.toolsqa.web.pages.WebTablesPage;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablesFuncionalidade extends BaseTest {
    private WebTablesPage webTablesPage;
    private SeleniumRobot seleniumRobot;

    public WebTablesFuncionalidade() {
        this.webTablesPage = new WebTablesPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void clicarNoBotaoAdd(){
        this.seleniumRobot.esperarElementoEstarClicavelEClicar(
                this.webTablesPage.getBotaoAdd());
    }

    public void preencheOsCampos(String primeiroNome, String ultimoNome,String email,
                                 int idade, String salario, String departamento){
        this.seleniumRobot.esperarElementoEstarVisivel(this.webTablesPage.getBotaoSubmit());
        this.webTablesPage.getInputPrimeiroNome().sendKeys(primeiroNome);
        this.webTablesPage.getInputUltimoNome().sendKeys(ultimoNome);
        this.webTablesPage.getInputEmail().sendKeys(email);
        this.webTablesPage.getInputIdade().sendKeys(idade + "");
        this.webTablesPage.getInputSalario().sendKeys(salario);
        this.webTablesPage.getInputDepartamento().sendKeys(departamento);
    }

    public void alteraDados(String primeiroNome, String ultimoNome,String email,
                            int idade, String salario, String departamento){
        this.seleniumRobot.esperarElementoEstarVisivel(this.webTablesPage.getBotaoSubmit());
        this.webTablesPage.getInputPrimeiroNome().clear();
        this.webTablesPage.getInputPrimeiroNome().sendKeys(primeiroNome);
        this.webTablesPage.getInputUltimoNome().clear();
        this.webTablesPage.getInputUltimoNome().sendKeys(ultimoNome);
        this.webTablesPage.getInputEmail().clear();
        this.webTablesPage.getInputEmail().sendKeys(email);
        this.webTablesPage.getInputIdade().clear();
        this.webTablesPage.getInputIdade().sendKeys(idade + "");
        this.webTablesPage.getInputSalario().clear();
        this.webTablesPage.getInputSalario().sendKeys(salario);
        this.webTablesPage.getInputDepartamento().clear();
        this.webTablesPage.getInputDepartamento().sendKeys(departamento);
    }

    public void clicarNoBotaoSubmit(){
        this.seleniumRobot.esperarElementoEstarClicavelEClicar(
                this.webTablesPage.getBotaoSubmit()
        );
    }

    public void clicarNoBotaoEditar(String primeiroNome){
        this.seleniumRobot.esperarElementoEstarClicavelEClicar(
                this.webTablesPage.getBotaoEditarPelo(primeiroNome)
        );
    }

    public void clicarNoBotaoExcluir(String primeiroNome, String ultimoNome){
        this.seleniumRobot.esperarElementoEstarClicavelEClicar(
                this.webTablesPage.getBotaoExcluirPelo(primeiroNome, ultimoNome)
        );
    }

    public String textoDosCampos(String texto){
        return this.webTablesPage.getCamposTabelaPelo(texto).getText();
    }

    public boolean verificaSeEncontraLinhaComOsDados(String primeiroNome, String ultimoNome,String email,
                                        String idade, String salario, String departamento){
        String xPath = ("//div[" +
                "div[text()='" + primeiroNome + "' and following-sibling:: " +
                "div[text()='" + ultimoNome + "' and following-sibling:: " +
                "div[text()='" + idade + "' and following-sibling:: " +
                "div[text()='" + email + "' and following-sibling:: " +
                "div[text()='" + salario + "' and following-sibling:: " +
                "div[text()='" + departamento + "']]]]]]]");
        List<WebElement> webElements = this.seleniumRobot.buscaVariosElementosPor(xPath);
        return webElements.size() > 0;
    }
}
