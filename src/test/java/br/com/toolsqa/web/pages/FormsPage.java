package br.com.toolsqa.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage {
    public FormsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement opcaoPracticeForm;

    public WebElement getOpcaoPracticeForm() {
        return opcaoPracticeForm;
    }
}
