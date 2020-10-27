import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                sorted = true;
            } else {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
    }
}