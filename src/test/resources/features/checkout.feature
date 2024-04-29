Feature: Compra de Productos Real Plaza

  @TC01
  Scenario Outline: Verificar el ingreso a la PDP de productos de distintos seller
    Given el usuario ingresa a la PDP del producto "<productoOechsle>"
    Then el usuario verifica que se muestren correctamente los detalles del producto
    Examples:
      |productoOechsle                                                                           |
      |https://www.realplaza.com/vinera-de-acrilico-632886/p                                     |
      |https://www.realplaza.com/caja-china-mr-grill-mediana-junior-con-parrilla-regular-276546/p|
      |https://www.realplaza.com/freidora-de-aire-digital-9l-oster-ckstaf90d-651338/p            |

