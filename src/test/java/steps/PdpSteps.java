package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.PdpPage;

public class PdpSteps {

    private final PdpPage pdpPage = new PdpPage();

    @Given("el usuario ingresa a la PDP del producto {string}")
    public void elUsuarioIngresaALaPDPDelProducto(String urlProducto) {
        pdpPage.goToProducto(urlProducto);
        pdpPage.waitPageToLoad();
    }

    @Then("el usuario verifica que se muestren correctamente los detalles del producto")
    public void elUsuarioVerificaQueSeMuestrenCorrectamenteLosDetallesDelProducto() {
        pdpPage.verifyPage();
    }
}
