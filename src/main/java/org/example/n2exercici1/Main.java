package org.example.n2exercici1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    // TODO refactor try{}catch()
    // no he podido encontrar la manera de llamar metodos en main y usar el bloque try-catch desde main
    // al intentarlo de esta manera se me crea un bucle infinito y/o no me funciona bien
    public static void main(String[] args) {


        int option = 0;

        do {
            System.out.println("""
                    Escoge una opción:\s
                    1. Introducir byte\s
                    2. Introducir int\s
                    3. Introducir float\s
                    4. Introducir double\s
                    5. Introducir char\s
                    6. Introducir String\s
                    7. Introducir boolean\s
                    8. Salir del programa\s
                    """
            );


            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    Input.readByte("Introduce un byte");
                    break;
                case 2:
                    Input.readInt("Introduce un int");
                    break;
                case 3:
                    Input.readFloat("Introduce un float");
                    break;
                case 4:
                    Input.readDouble("Introduce un double");
                    break;
                case 5:
                    try {
                        Input.readChar("Introduce un char");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        Input.readString("Introduce un string");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    // TODO encontrar la manera de no usar bloque try-catch en dos sitios
                    try {
                        Input.readBoolean("Introduce Sí o No");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    System.out.println("Adiós");
                    break;
            }

        } while (option != 8);
    }
}

