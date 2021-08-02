package br.com.toolsqa.settings;

import br.com.toolsqa.interfaces.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    protected void initializeWebApplication(WebApplication webApplication, String url) {
        if (webDriver != null) webDriver.quit();

        webDriver = webApplication.getWebDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);

        wait = new WebDriverWait(webDriver, 15);
    }

    protected static void closeWeb() {
        webDriver.close();
    }

}
