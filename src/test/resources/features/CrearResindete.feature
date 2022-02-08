Feature: probar la funcinalidad de un residente registrado

  Scenario: registrar un residente
    Given ingreso a la aplicacion1
    When registro un residente
    And click en los eventos2
    Then obtengo resultados2
