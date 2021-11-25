package com.company;

public class Categoria {
    private String codigo;
    private String nomCategoria;
    private double valor;

    public Categoria(String codigo, String nomCategoria, float valor) {
        this.codigo = codigo;
        this.nomCategoria = nomCategoria;
        this.valor = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
