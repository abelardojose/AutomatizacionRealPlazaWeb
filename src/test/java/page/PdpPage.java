package page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class PdpPage extends BasePage {

    private final By itemName = By.className("vtex-store-components-3-x-productBrand");
    private final By itemPrice = By.className("realplaza-product-custom-0-x-newFormInPdp_afterh2");
    private final By itemImage = By.xpath("//img[@data-vtex-preload='true']");
    private final By itemDescription = By.className("vtex-product-identifier-0-x-product-identifier__value");
    private final By addToCartButton = By.xpath("//span[text()='Agregar al carrito']");



    @Override
    public void waitPageToLoad() {
        waitPage(itemName, this.getClass().getSimpleName());
    }

    @Override
    public void verifyPage() {
        Logs.info("Verificando los elementos de la PDP");
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(itemName).isDisplayed()),
                () -> Assertions.assertTrue(find(itemPrice).isDisplayed()),
                () -> Assertions.assertTrue(find(itemImage).isDisplayed()),
                () -> Assertions.assertTrue(find(itemDescription).isDisplayed()),
                () -> Assertions.assertTrue(find(addToCartButton).isDisplayed())
        );
    }

    public void addToCart() {
        find(addToCartButton).click();
    }

    public void goToProducto(String urlProducto) {
        getDriver().get(urlProducto);
    }
}
