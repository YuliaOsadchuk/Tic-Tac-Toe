package tictactoe;

import java.util.Scanner;

public class Main {
    public static String status = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String s = scanner.next();
        char[][] array = new char[3][3];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = s.charAt(index);
                index++;
            }
        }
        printArray(array);
        checkWinXOrO(array);
        System.out.println(status);
    }

    public static void printArray(char[][] array) {
        String start = "---------";
        System.out.println(start);
        for (char[] c : array) {
            System.out.print("| ");
            for (char ch : c) {
                System.out.print(ch + " ");
            }
            System.out.println("|");
        }
        System.out.println(start);
    }

    public static void checkWinXOrO(char[][] array) {
        boolean xWin = false;
        boolean oWin = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == 88 && array[i][0] == array[i][1] && array[i][0] == array[i][2] ||
                    array[0][i] == 88 && array[0][i] == array[1][i] && array[0][i] == array[2][i]) {
                xWin = true;
            }
        }
        if (array[0][0] == 88 && array[0][0] == array[1][1] && array[0][0] == array[2][2] ||
                array[0][2] == 88 && array[0][2] == array[1][1] && array[0][2] == array[2][0]) {
            xWin = true;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == 79 && array[i][0] == array[i][1] && array[i][0] == array[i][2] ||
                    array[0][i] == 79 && array[0][i] == array[1][i] && array[0][i] == array[2][i]) {
                oWin = true;
            }
        }
        if (array[0][0] == 79 && array[0][0] == array[1][1] && array[0][0] == array[2][2] ||
                array[0][2] == 79 && array[0][2] == array[1][1] && array[0][2] == array[2][0]) {
            oWin = true;
        }

        if (xWin && oWin) {
            status = "Impossible";
        } else if (xWin) {
            status = "X wins";
        } else if (oWin) {
            status = "O wins";
        } else {
            checkEmptyCells(array);
        }
    }


    public static void checkEmptyCells(char[][] array) {
        int x = 0;
        int o = 0;
        for (char[] i : array) {
            for (char j : i) {
                if (j == 88) {
                    x++;
                } else if (j == 79) {
                    o++;
                }
            }
        }
        if (x - o >= 2 || o - x >= 2) {
            status = "Impossible";
            return;
        }

        for (char[] i : array) {
            for (char j : i) {
                if (j == 95) {
                    status = "Game not finished";
                    return;
                }
            }
        }
        status = "Draw";
    }
}
