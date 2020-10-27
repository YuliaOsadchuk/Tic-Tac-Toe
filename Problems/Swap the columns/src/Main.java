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
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        for (int z = 0; z < array.length; z++) {
            int q = array[z][i];
            array[z][i] = array[z][j];
            array[z][j] = q;
        }

        for (int[] w : array) {
            for (int e : w) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}