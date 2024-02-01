package br.com.rochadev.missao.missao3;

public class Teste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(1.94,2);

        System.out.println("A área do retangulo é: " + retangulo.calcularArea(retangulo.getAltura(), retangulo.getLargura()));
    }
}
