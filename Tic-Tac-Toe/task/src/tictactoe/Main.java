package tictactoe;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static String status = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String s = scanner.next();
        char[] array = s.toCharArray();
        //printArray(array);
        checkEmptyCells(array);
        System.out.println(status);
    }

    public static void printArray(char[] array) {
        String start = "---------";
        System.out.println(start);
        System.out.println("| " + array[0] + " " + array[1] + " " + array[2] + " |");
        System.out.println("| " + array[3] + " " + array[4] + " " + array[5] + " |");
        System.out.println("| " + array[6] + " " + array[7] + " " + array[8] + " |");
        System.out.println(start);
    }

    public static void checkEmptyCells(char[] array) {
        for (char i : array) {
            if (i == 95) {
                status = "Game not finished";
                return;
            }
        }
    }
}
