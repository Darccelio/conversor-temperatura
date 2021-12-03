package com.letscode.conversor;

public class conversor {

    public static void main(String[] args) {

//        Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra), Fahrenheit (F) seguindo as fórmulas:
//
//        F = (C * 1.8) + 32
//        K = C + 273.15
//        Re = C * 0.8
//        Ra = (C * 1.8) + 491

//        Considere a conversão de 18 ºC e a precisão de duas casas decimais

        final float CELCIUS = 18.00f;

        final float CELSIUS_TO_KELVIN = (CELCIUS * 1.8f) + 32;

        final float CELSIUS_TO_REAUMUR = CELCIUS * 0.8f;

        final float CELSIUS_TO_RANKINE = (CELCIUS * 1.8f) + 491;

        final float CELSIUS_TO_FAHRENHEIT = (CELCIUS * 1.8f) + 32;

        System.out.printf("%.2fº Celsius equivale a %.2fº Kelvin (K) %n", CELCIUS, CELSIUS_TO_KELVIN);
        System.out.printf("%.2fº Celsius equivale a %.2fº Réaumur (Re) %n", CELCIUS, CELSIUS_TO_REAUMUR);
        System.out.printf("%.2fº Celsius equivale a %.2fº Rankine (Ra) %n", CELCIUS, CELSIUS_TO_RANKINE);
        System.out.printf("%.2fº Celsius equivale a %.2fº Fahrenheit (F)%n", CELCIUS, CELSIUS_TO_FAHRENHEIT);





    }
}
