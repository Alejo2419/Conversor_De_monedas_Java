package com.alura.modelos;

import java.util.Map;
import  conexion.Conexion;

public class Monedas {
    double dolarHoy = 0;
    double pesoColombiano = 0;
    double pesoArgentino = 0;
    double realBrasileno = 0;
    double bolivarVenezolano = 0;
    double pesoMexicano = 0;
    double pesoChileno = 0;
    double pesoUruguayo = 0;
    double guaraniParaguayo = 0;
    int seleccion = 0;

    public void ActualizarTasas() {
        try {
            Map<String, Double> tasas = Conexion.obtenerTasas();
            if (tasas.containsKey("COP")) this.pesoColombiano = tasas.get("COP");
            if (tasas.containsKey("ARS")) this.pesoArgentino = tasas.get("ARS");
            if (tasas.containsKey("BRL")) this.realBrasileno = tasas.get("BRL");
            if (tasas.containsKey("VES")) this.bolivarVenezolano = tasas.get("VES");
            if (tasas.containsKey("MXN")) this.pesoMexicano = tasas.get("MXN");
            if (tasas.containsKey("CLP")) this.pesoChileno = tasas.get("CLP");
            if (tasas.containsKey("UYU")) this.pesoUruguayo = tasas.get("UYU");
            if (tasas.containsKey("PYG")) this.guaraniParaguayo = tasas.get("PYG");
            if (tasas.containsKey("COP")) this.dolarHoy = tasas.get("COP");

        }  catch (Exception e) {
            System.out.println("Error al actualizar tasas: " + e.getMessage());
        }

    }




    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

    public double getDolarHoy() {
        return dolarHoy;
    }

    public void setDolarHoy(double dolarHoy) {
        this.dolarHoy = dolarHoy;
    }

    public double getPesoColombiano() {
        return pesoColombiano;
    }

    public void setPesoColombiano(double pesoColombiano) {
        this.pesoColombiano = pesoColombiano;
    }

    public double getPesoArgentino() {
        return pesoArgentino;
    }

    public void setPesoArgentino(double pesoArgentino) {
        this.pesoArgentino = pesoArgentino;
    }

    public double getRealBrasileno() {
        return realBrasileno;
    }

    public void setRealBrasileno(double realBrasileno) {
        this.realBrasileno = realBrasileno;
    }

    public double getBolivarVenezolano() {
        return bolivarVenezolano;
    }

    public void setBolivarVenezolano(double bolivarVenezolano) {
        this.bolivarVenezolano = bolivarVenezolano;
    }

    public double getPesoMexicano() {
        return pesoMexicano;
    }

    public void setPesoMexicano(double pesoMexicano) {
        this.pesoMexicano = pesoMexicano;
    }

    public double getPesoChileno() {
        return pesoChileno;
    }

    public void setPesoChileno(double pesoChileno) {
        this.pesoChileno = pesoChileno;
    }

    public double getPesoUruguayo() {
        return pesoUruguayo;
    }

    public void setPesoUruguayo(double pesoUruguayo) {
        this.pesoUruguayo = pesoUruguayo;
    }

    public double getGuaraniParaguayo() {
        return guaraniParaguayo;
    }

    public void setGuaraniParaguayo(double guaraniParaguayo) {
        this.guaraniParaguayo = guaraniParaguayo;
    }



}

