package com.aluracursos.conversorDeMonedas.Menu;

public class Menu {

    private String saludo = """
            *************************************
            Sea bienvenido/a al Conversor de Moneda
            """;
    private String menuOpciones = """ 
            Seleccione la opción adecuada para su consulta: 
            
            1) Dólar ==> Peso colombiano
            2) Peso colombiano ==> Dólar
            3) Dólar ==> Peso argentino
            4) Peso argentino ==> Dólar
            5) Dólar ==> Real brasileño
            6) Real brasileño ==> Dólar
            7) Salir
            
            *************************************     
            """;
    public String getSaludo() {
        return saludo;
    }
    public String getMenuOpciones() {
        return menuOpciones;
    }


}
