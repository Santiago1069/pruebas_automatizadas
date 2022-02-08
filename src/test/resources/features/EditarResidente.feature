Feature: probar la funcinalidad de un residente editado

  Scenario: editar un residente
    Given ingreso a la aplicacion3
    When edito un residente
    And click en los eventos3
    Then obtengo resultados3