package br.com.toolsqa.web.pages;

import br.com.toolsqa.communs.SeleniumRobot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {

    private SeleniumRobot seleniumRobot;

    public ButtonsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.seleniumRobot = new SeleniumRobot();
    }

    @FindBy (id = "doubleClickMessage")
    private WebElement mensagemDoubleClick;

    @FindBy (id = "rightClickMessage")
    private WebElement mensagemRightClick;

    @FindBy (id = "dynamicClickMessage")
    private WebElement mensagemClickSimples;

    @FindBy (id = "rightClickBtn")
    private WebElement botaoClickDireito;

    @FindBy (id = "doubleClickBtn")
    private WebElement botaoDuploClick;

    public WebElement getBotaoPorText(String textoDoBotao){
        return
                (textoDoBotao).contains("Double Click Me") ? botaoDuploClick :
                (textoDoBotao).contains("Right Click Me") ? botaoClickDireito :
                this.seleniumRobot.mapearElemento(
                        "//button[text()='" + textoDoBotao + "']"
                );
    }

    public WebElement getMensagemDoubleClick() {
        return mensagemDoubleClick;
    }

    public WebElement getMensagemRightClick() {
        return mensagemRightClick;
    }

    public WebElement getMensagemClickSimples() {
        return mensagemClickSimples;
    }
}
