package br.com.rochadev.missao.missao3;

public class Retangulo {
    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo() {
    }

    public double calcularArea(double altura, double largura) {
        var area = altura * largura;
        return area;
    }

    ;
}
