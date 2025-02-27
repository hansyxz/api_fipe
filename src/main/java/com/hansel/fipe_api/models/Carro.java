package com.hansel.fipe_api.models;

public class Carro {
    String marca;
    String preco;
    String modelo;
    int anoModelo;
    String combustivel;
    String codigoFipe;

    public Carro(String marca, String preco, String modelo, int anoModelo, String combustivel, String codigoFipe) {
        this.marca = marca;
        this.preco = preco;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.combustivel = combustivel;
        this.codigoFipe = codigoFipe;
    }

    public String getMarca() {
        return marca;
    }

    public String getPreco() {
        return preco;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getCodigoFipe() {
        return codigoFipe;
    }
}
