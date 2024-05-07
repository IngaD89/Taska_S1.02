package org.example.n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);
    private String message;


    public Input(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static byte readByte(String message) throws InputMismatchException {
        byte byteInput = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.println(message);
                byteInput = scanner.nextByte();
                scanner.nextLine();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Vuelva intentar");
                scanner.nextLine();
            }
        }
        System.out.println("Byte válido es " + byteInput);
        return byteInput;
    }

    public static int readInt(String message) throws InputMismatchException {
        int intInput = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.println(message);
                intInput = scanner.nextInt();
                scanner.nextLine();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Vuelva intentar");
                scanner.nextLine();
            }
        }
        System.out.println("Int válido es " + intInput);
        return intInput;
    }

    public static float readFloat(String message) throws InputMismatchException {
        float floatInput = 0f;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.println(message);
                floatInput = scanner.nextFloat();
                scanner.nextLine();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Vuelva intentar");
                scanner.nextLine();
            }
        }
        System.out.println("Float válido es " + floatInput);
        return floatInput;
    }

    public static double readDouble(String message) throws InputMismatchException {
        double doubleInput = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.println(message);
                doubleInput = scanner.nextDouble();
                scanner.nextLine();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Vuelva intentar");
                scanner.nextLine();
            }
        }
        System.out.println("Double válido es " + doubleInput);
        return doubleInput;
    }

    public static char readChar(String message) throws Exception {
        char charInput = ' ';

        System.out.println(message);
        charInput = scanner.next().charAt(0);

        System.out.println("Char válido es " + charInput);
        return charInput;
    }

    public static String readString(String message) throws Exception {
        String stringInput = "";

        System.out.println(message);
        stringInput = scanner.nextLine();
        System.out.println("String correcto es: " + stringInput);
        return stringInput;
    }

    public static boolean readBoolean(String message) throws Exception {

        char letter = ' ';
        boolean b = false;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.println(message);
                letter = scanner.next().charAt(0);
                if (letter == 's' || letter == 'S') {
                    b = true;
                    isValid = true;
                    System.out.println(b);
                } else if (letter == 'n' || letter == 'N') {
                    b = false;
                    isValid = true;
                    System.out.println(b);
                }
            } catch (InputMismatchException e) {
                System.out.println("Vuelva intentar");
                scanner.nextLine();
            }
        }
        return b;
    }

}
