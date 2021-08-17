package br.com.toolsqa.settings;

import br.com.toolsqa.enums.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {


    @Before(value = "@web")
    public void setUp() {
        System.out.println("Abrindo o Navegador");
        initializeWebApplication(Web.CHROME, "https://demoqa.com/");
    }

    @After(value = "@web")
    public void tearDown(Scenario scenario) {
        screenShotReport(scenario.getName());
        System.out.println("Fechando o Navegador");
        closeWeb();
    }
}
