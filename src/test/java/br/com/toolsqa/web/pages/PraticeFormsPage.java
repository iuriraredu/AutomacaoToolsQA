package br.com.toolsqa.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PraticeFormsPage {

    public PraticeFormsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    private WebElement inputPrimeiroNome;

    @FindBy(id = "lastName")
    private WebElement inputUltimoNome;

    @FindBy(id = "userEmail")
    private WebElement inputEmail;

    @FindBy(id = "gender-radio-1")
    private WebElement radioMale;

    @FindBy(id = "gender-radio-2")
    private WebElement radioFemale;

    @FindBy(id = "gender-radio-3")
    private WebElement radioOther;

    @FindBy(id = "userNumber")
    private WebElement inputTelefone;

    @FindBy(id = "dateOfBirthInput")
    private WebElement inputDataNascimento;

    @FindBy(id = "subjectsInput")
    private WebElement inputSubjects;

    @FindBy(xpath = "//label[text()='Sports']/preceding-sibling:: input")
    private WebElement checkboxSports;

    @FindBy(xpath = "//label[text()='Reading']/preceding-sibling:: input")
    private WebElement checkboxReading;

    @FindBy(xpath = "//label[text()='Music']/preceding-sibling:: input")
    private WebElement checkboxMusic;

    @FindBy(id = "currentAddress")
    private WebElement textAreaEnderecoAtual;

}
