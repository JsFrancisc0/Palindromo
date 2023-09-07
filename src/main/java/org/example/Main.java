package org.example;

public class Main {
    public static void main(String[] args){

    String cadena = "oso";

    System.out.println(esPalindromo(cadena));

    }

    /*public static boolean esPalindromo(String cadena) {

        String resultado = "";
        resultado = cadena.split('').reverse().join('');

        return cadena.equals(resultado);
    }*/

    public static boolean esPalindromo(String cadena){
        char[] resultado= cadena.toCharArray();;
        String comparacion="";
        for (int i = 0; i <resultado.length ; i++) {
            comparacion+=resultado[(resultado.length-1)-i];
        }

        return  cadena.equals(comparacion);
    }
}

