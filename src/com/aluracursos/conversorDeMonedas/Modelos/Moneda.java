package com.aluracursos.conversorDeMonedas.Modelos;

public record Moneda(String base_code,
                     String target_code,
                     double conversion_rate,
                     double conversion_result) {


}
