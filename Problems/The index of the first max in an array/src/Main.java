import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}