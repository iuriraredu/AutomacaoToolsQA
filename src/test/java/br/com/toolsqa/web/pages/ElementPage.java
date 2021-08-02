package br.com.toolsqa.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementPage {

    public ElementPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='header-wrapper'  and child:: div[text()='Elements']]")
    private WebElement menuElements;

    @FindBy(xpath = "//span[text()='Text Box']")
    private WebElement opcaoTextBox;

    public WebElement getMenuElements() {
        return menuElements;
    }

    public WebElement getOpcaoTextBox() {
        return opcaoTextBox;
    }
}
