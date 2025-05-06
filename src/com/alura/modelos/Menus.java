package com.alura.modelos;

public class Menus {
    String menu1 =  """
                    ---1) Pesos Colombianos ---
                    ---2) Pesos Argentinos ----
                    ---3) Real Brasileño ------
                    ---4) Bolivar Venezolano --
                    ---5) Peso Mexicano -------
                    ---6) Peso Chileno --------
                    ---7) Peso Uruguayo -------
                    ---8) Guarani Paraguayo ---
                    """;
    String menuAmonedas = "--Convertir de Dólares a Moneda-\uD83D\uDCB6";
    String menuADolar = "--Para Convertir Monedas A Dolar-\uD83D\uDCB7";
    String respuesta1 = "Tus Dolares equivalen a: $";
    String respuesta2 = "Tu Valor en Moneda local equivale a: $";

    public String getRespuesta2() {
        return respuesta2;
    }



    public String getMenu1() {
        return menu1;
    }

    public void setMenu1(String menu1) {
        this.menu1 = menu1;
    }

    public String getMenuAmonedas() {
        return menuAmonedas;
    }

    public void setMenuAmonedas(String menuAmonedas) {
        this.menuAmonedas = menuAmonedas;
    }

    public String getMenuADolar() {
        return menuADolar;
    }

    public void setMenuADolar(String menuADolar) {
        this.menuADolar = menuADolar;
    }



    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }


}






