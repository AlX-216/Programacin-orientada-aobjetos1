package com.mycompany.Actividad_2;

import java.util.Scanner;

public class Actividad_2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String EntraU = lector.nextLine();

        if (EntraU.equals("Alan Alexander")) {
            System.out.println("Sea usted bienvenido " + EntraU + ". Que tenga un excelente día.");
        } else if (EntraU.equals("alan alexander")) {
            System.out.println("Casi, pero no");
        } else if (EntraU.equalsIgnoreCase("Alan") || EntraU.equalsIgnoreCase("Alexander")) {
            System.out.println("Estuviste cerca pero no");
        } else {
            System.out.println("A quien intentas engañar?: " + EntraU);
        }

        lector.close();
    }
}
