package utilities;

import org.openqa.selenium.WebDriver;
import page.PdpPage;

public class CommonFlows {

    private final PdpPage pdpPage = new PdpPage();
    
    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    //Agregar precondiciones
    public void gotoUrlPdpPage(String url) {
        getDriver().get(url);
        pdpPage.waitPageToLoad();
        pdpPage.verifyPage();

    }

}
