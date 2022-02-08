Feature: probar la funcinalidad del proveedor

  Scenario: buscar un residente con el rol del proveedor
    Given ingreso a la aplicacion5
    When ingreso de los datos del residente
    And click en los eventos5
    Then obtengo resultados5
