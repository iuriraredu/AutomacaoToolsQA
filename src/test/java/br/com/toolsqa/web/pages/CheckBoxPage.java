package br.com.toolsqa.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {
    public CheckBoxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Home']/parent:: label/preceding-sibling:: button")
    private WebElement setaHome;

    @FindBy(xpath = "//span[text()='Documents']/parent:: label/preceding-sibling:: button")
    private WebElement setaDocuments;

    @FindBy(xpath = "//span[text()='Office']/parent:: label/preceding-sibling:: button")
    private WebElement setaOffice;

    @FindBy (xpath = "//span[text()='Private']")
    private WebElement opcaoPrivate;

    @FindBy (xpath = "//span[@class='text-success']")
    private WebElement resultado;

    public WebElement getSetaHome() {
        return setaHome;
    }

    public WebElement getSetaDocuments() {
        return setaDocuments;
    }

    public WebElement getSetaOffice() {
        return setaOffice;
    }

    public WebElement getOpcaoPrivate() {
        return opcaoPrivate;
    }

    public WebElement getResultado() {
        return resultado;
    }
}
