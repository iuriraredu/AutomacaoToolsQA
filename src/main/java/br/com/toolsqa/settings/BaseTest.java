package br.com.toolsqa.settings;

import br.com.toolsqa.interfaces.WebApplication;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public abstract class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    protected void initializeWebApplication(WebApplication webApplication, String url) {
        webDriver = webApplication.getWebDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);

        wait = new WebDriverWait(webDriver, 15);
    }

    protected static void closeWeb() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    protected static void screenShotReport(String nomeMetodo){
        File screenshot = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot,
                    new File("test-output/Screenshot/" +
                        new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(
                                new Timestamp(System.currentTimeMillis())
                        ) + "_" + nomeMetodo + ".png"
                    )
            );
        } catch (Exception e){
            System.out.println("Houveram problemas ao copiar o arquivo para pasta!\n" + e.getMessage());
        }
    }
}
