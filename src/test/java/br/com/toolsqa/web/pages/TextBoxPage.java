package br.com.toolsqa.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {

    public TextBoxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userName")
    private WebElement inputNomeCompleto;

    @FindBy(id = "userEmail")
    private WebElement inputEmail;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement inputEnderecoAtual;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    private WebElement inputEnderecoPermanente;

    @FindBy(id = "submit")
    private WebElement botaoSubmit;

    @FindBy(id = "name")
    private WebElement paragrafoNome;

    @FindBy(id = "email")
    private WebElement paragrafoEmail;

    @FindBy(xpath = "//p[@id='currentAddress']")
    private WebElement paragrafoEnderecoAtual;

    @FindBy(xpath = "//p[@id='permanentAddress']")
    private WebElement paragrafoEnderecoPermanente;

    public WebElement getInputNomeCompleto() {
        return inputNomeCompleto;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputEnderecoAtual() {
        return inputEnderecoAtual;
    }

    public WebElement getInputEnderecoPermanente() {
        return inputEnderecoPermanente;
    }

    public WebElement getBotaoSubmit() {
        return botaoSubmit;
    }

    public WebElement getParagrafoNome() {
        return paragrafoNome;
    }

    public WebElement getParagrafoEmail() {
        return paragrafoEmail;
    }

    public WebElement getParagrafoEnderecoAtual() {
        return paragrafoEnderecoAtual;
    }

    public WebElement getParagrafoEnderecoPermanente() {
        return paragrafoEnderecoPermanente;
    }
}
