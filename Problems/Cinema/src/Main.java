import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int tickets = scanner.nextInt();
        boolean free = false;
        int foundTicket = 0;
        int rowResult = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0 && !free) {
                    foundTicket++;
                } else {
                    foundTicket = 0;
                }
                if (tickets == foundTicket) {
                    free = true;
                    rowResult = i + 1;
                }
            }
            foundTicket = 0;
        }
        System.out.println(rowResult);
    }
}