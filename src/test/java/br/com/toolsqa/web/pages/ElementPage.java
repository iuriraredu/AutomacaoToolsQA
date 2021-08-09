package br.com.toolsqa.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementPage {

    public ElementPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='header-wrapper' and child:: div[text()='Elements']]")
    private WebElement menuElements;

    @FindBy(xpath = "//span[text()='Text Box']")
    private WebElement opcaoTextBox;

    @FindBy(xpath = "//span[text()='Check Box']")
    private WebElement opcaoCheckBox;

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement opcaoWebTables;

    @FindBy(xpath = "//span[text()='Buttons']")
    private WebElement opcaoButtons;

    public WebElement getMenuElements() {
        return menuElements;
    }

    public WebElement getOpcaoTextBox() {
        return opcaoTextBox;
    }

    public WebElement getOpcaoCheckBox() {
        return opcaoCheckBox;
    }

    public WebElement getOpcaoWebTables() {
        return opcaoWebTables;
    }

    public WebElement getOpcaoButtons() {
        return opcaoButtons;
    }
}
