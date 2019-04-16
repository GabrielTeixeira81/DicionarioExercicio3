package br.com.digitalhouse;


import java.util.HashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {

        Set<Integer> elementos = new HashSet<>();
        elementos.add(1);
        elementos.add(2);
        elementos.add(3);
        elementos.add(4);

        Prova prova = new Prova();
        prova.somaTotal(elementos);

    }
}
