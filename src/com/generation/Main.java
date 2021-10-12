package com.generation;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
//                pasa a la siguiente iteracion sin terminar de ejecutar el codigo debajo
                continue;
            }
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}

