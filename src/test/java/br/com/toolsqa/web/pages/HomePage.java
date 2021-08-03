package br.com.toolsqa.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//h5[text()='Elements']/parent:: div/parent:: div")
    private WebElement cardElements;

    @FindBy(xpath = "//h5[text()='Forms']/parent:: div/parent:: div")
    private WebElement cardForms;

    public WebElement getCardElements() {
        return cardElements;
    }

    public WebElement getCardForms() {
        return cardForms;
    }
}
