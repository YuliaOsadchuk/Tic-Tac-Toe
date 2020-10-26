package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String s = scanner.next();
        String[] array = new String[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(s.charAt(i));
        }
        String start = "---------";
        System.out.println(start);
        System.out.println("| " + array[0] + " " + array[1] + " " + array[2] + " |");
        System.out.println("| " + array[3] + " " + array[4] + " " + array[5] + " |");
        System.out.println("| " + array[6] + " " + array[7] + " " + array[8] + " |");
        System.out.println(start);
    }
}
