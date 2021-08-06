package br.com.toolsqa.settings;

import br.com.toolsqa.enums.Web;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends BaseTest {

    private int cont;

    @Before(value = "@web")
    public void setUp() {
        System.out.println("Abrindo o Navegador");
        initializeWebApplication(Web.CHROME, "https://demoqa.com/");
        cont = 0;
    }

    @AfterStep(value = "@web")
    public void reportScreenShot(Scenario scenario){
        cont++;
        screenShotReporter(scenario.getName() + "_Step" + cont);
    }

    @After(value = "@web")
    public void tearDown() {
        System.out.println("Fechando o Navegador");
        closeWeb();
    }
}
