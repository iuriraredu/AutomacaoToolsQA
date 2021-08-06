package br.com.toolsqa.web.pages;

import br.com.toolsqa.communs.SeleniumRobot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesPage {

    private SeleniumRobot seleniumRobot;

    public WebTablesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.seleniumRobot = new SeleniumRobot();
    }

    @FindBy(id = "addNewRecordButton")
    private WebElement botaoAdd;

    @FindBy(id = "submit")
    private WebElement botaoSubmit;

    @FindBy(id = "firstName")
    private WebElement inputPrimeiroNome;

    @FindBy(id = "lastName")
    private WebElement inputUltimoNome;

    @FindBy(id = "userEmail")
    private WebElement inputEmail;

    @FindBy(id = "age")
    private WebElement inputIdade;

    @FindBy(id = "salary")
    private WebElement inputSalario;

    @FindBy(id = "department")
    private WebElement inputDepartamento;

    public WebElement getBotaoAdd() {
        return botaoAdd;
    }

    public WebElement getBotaoSubmit() {
        return botaoSubmit;
    }

    public WebElement getInputPrimeiroNome() {
        return inputPrimeiroNome;
    }

    public WebElement getInputUltimoNome() {
        return inputUltimoNome;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputIdade() {
        return inputIdade;
    }

    public WebElement getInputSalario() {
        return inputSalario;
    }

    public WebElement getInputDepartamento() {
        return inputDepartamento;
    }

    public WebElement getBotaoEditarPelo(String primeiroNome){
        return this.seleniumRobot.mapearElemento(
                "//div[text()='" + primeiroNome +
                        "']/following-sibling:: div/div/span[@class='mr-2']"
        );
    }

    public WebElement getBotaoExcluirPelo(String primeiroNome, String ultimoNome){
        return this.seleniumRobot.mapearElemento(
                "//div[text()='"+ primeiroNome +
                        "']/following-sibling::div[text()='"+ ultimoNome +
                        "']/following-sibling::div/div/span[@class='mr-2']"
        );
    }

    public WebElement getCamposTabelaPelo(String texto){
        return this.seleniumRobot.mapearElemento(
                "//div[text()='"+ texto + "']"
        );
    }
}
