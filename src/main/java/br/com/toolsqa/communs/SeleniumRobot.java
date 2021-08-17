package br.com.toolsqa.communs;

import br.com.toolsqa.settings.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SeleniumRobot extends BaseTest {

    public void scroll() {
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("scrollBy(0,250)", "");
    }

    public void esperarElementoEstarClicavelEClicar(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void esperarElementoEstarVisivel(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Busca elemento pelo parametro informado
     * @param xPath que deve ser informado quando for realizar a busca
     * @return WebElement encontrado
     */
    public WebElement mapearElemento(String xPath) {
        return webDriver.findElement(By.xpath(xPath));
    }

    /**
     * Busca elementos pelo parametro informado
     * @param xPath que deve ser informado quando for realizar a busca
     * @return List<WebElement> dos elementos localizados pelo xpath informado
     */
    public List<WebElement> buscaVariosElementosPor(String xPath){
        return webDriver.findElements(By.xpath(xPath));
    }
}
