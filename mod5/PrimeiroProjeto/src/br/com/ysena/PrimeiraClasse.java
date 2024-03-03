package br.com.ysena;

import java.util.Scanner;

public class PrimeiraClasse {

    public static void main(String[] args) {
        System.out.println("Convertendo Celcius para Fahrenheit");
        double fah;
        int celcius;
        celcius = 23;
        double CONSTANTE_CE2FA = 1.8;
        System.out.println("Calculando...");
        fah = (int) ((celcius * CONSTANTE_CE2FA) + 32);
        System.out.println(String.format(celcius + "ºC em Fahrenheit é: %.0f ºF", fah));


    }
}
