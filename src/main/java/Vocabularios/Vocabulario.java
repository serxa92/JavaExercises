package Vocabularios;
/* COMPARACION DE VOCABULARIOS CON CONJUNTOS
    Dadas dos cadenas de texto, escribe una función que devuelva:
    Las palabras únicas de cada texto.✅
    Las palabras en común entre ambos textos.
    Todas las palabras ordenadas alfabéticamente (sin duplicados).
    Usa set() y sorted() para resolverlo. */

import java.awt.*;
import java.util.*;
import java.util.List;

public class Vocabulario {

    public static Set<String> obtenerPalabras(String texto) {
        //Creamos un set vacío
        Set<String> palabras = new HashSet<>();

        //Separamos el texto en palabras
        String[] palabras1 = texto.toLowerCase().split(" ");

        //Agregamos al Set
        for (String palabra : palabras1) {
            palabras.add(palabra);
        }
        return palabras;
    }//function

    public static void main(String[] args) {

        //Declaramos los 2 textos
        String texto1 = "El gato duerme en la silla";
        String texto2 = "La silla está junto al perro";

        //Sacamos las palabras
        Set<String> palabras1 = obtenerPalabras(texto1);
        Set<String> palabras2 = obtenerPalabras(texto2);

        //PALABRAS ÚNICAS
        System.out.println("PALABRAS ÚNICAS:");
        System.out.println(palabras1);
        System.out.println(palabras2);
        System.out.println("-------------------------------------------------");

        //Copiamos las palabras para no borrarlas
        Set<String> comunes = new HashSet<>(palabras1);
        // Dejamos solo las palabras que están en ambos textos
        comunes.retainAll(palabras2);

        //PALABRAS COMUNES
        System.out.println("PALABRAS COMUNES");
        System.out.println(comunes);
        System.out.println("-------------------------------------------------");
        //Añadimos las palabras sin duplicados
        palabras1.addAll(palabras2);

        //Copiamos las palabras del Set
        List<String> palabras3 = new ArrayList<>(palabras1);
        Collections.sort(palabras3);
        System.out.println("PALABRAS ORDENADAS ALFABÉTICAMENTE:");
        System.out.println(palabras3);


    }//main
}//class
