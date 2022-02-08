Feature: probar la funcinalidad de un proveedor

  Scenario: ingresar rol proveedor
    Given ingreso a la aplicacion4
    When registro un proveedor
    And click en los eventos4
    Then obtengo resultados4
