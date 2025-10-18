package Campanadas;

import java.util.Scanner;
/*DAR LA CAMPANADA
Crear un programa que lea del teclado dos valores que indican hora de comienzo y hora de fin (ej: 16:30
y 19:17), y presente por pantalla la cantidad de veces que un reloj emite campanadas (las campanas se producen en los
minutos: 0, 15, 30 y 45). Se supone que la hora de comienzo es menor que la hora de final y ambas pertenecen al mismo
día.
Por ejemplo, si la hora de comienzo es 9:44 y la hora de fin es 10:01, hay que informar de 2 campanadas.
Si la hora de comienzo es 8:00 y la hora de fin es 10:07, el programa debe indicar que sonaron 8 campanadas.*/

public class Campanadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora de inicio (HH:mm):");
        String inicio = sc.nextLine();
        System.out.println("Introduce la hora de fin (HH:mm):");
        String fin = sc.nextLine();

        // Pasamos la hora de inicio a minutos
        String[] partes = inicio.split(":");
        int hora = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int totalMin = hora * 60 + minutos;

        //Pasamos la hora de fin a minutos
        String[] partes2 = fin.split(":");
        int hora2 = Integer.parseInt(partes2[0]);
        int minuto2 = Integer.parseInt(partes2[1]);
        int totalMin2 = hora2 * 60 + minuto2;


        int campanadas = 0;

        for (int i = totalMin + 1; i <= totalMin2; i++) {
            if (i % 60 == 0 || i % 60 == 15 || i % 60 == 30 || i % 60 == 45) {
                campanadas++;
            }
        }
        System.out.println("La campana ha sonado " + campanadas + " veces.");

    }//main
}//class
