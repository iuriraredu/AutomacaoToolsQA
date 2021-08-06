package br.com.toolsqa.web.funcionalidades;

import br.com.toolsqa.settings.BaseTest;
import br.com.toolsqa.web.pages.PraticeFormsPage;

public class PraticeFormsFuncionalidade extends BaseTest {
    private PraticeFormsPage praticeFormsPage;

    public PraticeFormsFuncionalidade() {
        this.praticeFormsPage = new PraticeFormsPage(webDriver);
    }
}
