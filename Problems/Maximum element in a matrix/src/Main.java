import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int max = Integer.MIN_VALUE;
        int iMax = 0;
        int jMax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
                if (max < array[i][j]) {
                    max = array[i][j];
                    iMax = i;
                    jMax = j;
                }
            }
        }
        System.out.println(iMax + " " + jMax);
    }
}