package tictactoe;

import java.util.Scanner;

public class Main {
    public static String status = "";
    public static boolean xWin = false;
    public static boolean oWin = false;
    public static boolean draw = false;
    public static boolean gameOver = false;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] array = new char[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '_';
            }
        }
        printArray(array);
        boolean moveX = true;
        boolean moveO = false;
        boolean coordinateEntered = false;
        int iCoordinates = 0;
        int jCoordinates = 0;
        while (!gameOver) {
            while (!coordinateEntered) {
                System.out.println("Enter the coordinates: ");
                String s = scanner.next();
                try {
                    iCoordinates = Integer.parseInt(s);
                } catch (Exception e) {
                    System.out.println("You should enter numbers!");
                    continue;
                }

                try {
                    s = scanner.next();
                    jCoordinates = Integer.parseInt(s);
                } catch (Exception e) {
                    System.out.println("You should enter numbers!");
                    continue;
                }

                iCoordinates--;
                jCoordinates--;
                if (iCoordinates < 0 || iCoordinates > 2 || jCoordinates < 0 || jCoordinates > 2) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }

                jCoordinates = Math.abs(jCoordinates - 2);
                if (array[jCoordinates][iCoordinates] != '_') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    coordinateEntered = true;
                }
            }

            if (moveX) {
                array[jCoordinates][iCoordinates] = 'X';
                moveX = false;
            } else {
                array[jCoordinates][iCoordinates] = 'O';
                moveX = true;
            }
            coordinateEntered = false;
            checkWinXOrO(array);
            printArray(array);
        }

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
            gameOver = true;
        } else if (oWin) {
            status = "O wins";
            gameOver = true;
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
        draw = true;
        status = "Draw";
        gameOver = true;
    }

    public static void makeMove() {

    }
}
