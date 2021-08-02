package br.com.toolsqa.settings;

import br.com.toolsqa.enums.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

    @Before
    public void setUp() {
        System.out.println("Abrindo o Navegador");
        initializeWebApplication(Web.CHROME, "https://demoqa.com/");
    }

    @After
    public void tearDown() {
        System.out.println("Fechando o Navegador");
        closeWeb();
    }
}
