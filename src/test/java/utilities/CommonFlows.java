package utilities;

import org.openqa.selenium.WebDriver;

public class CommonFlows {
    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    //Agregar precondiciones

}
