import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sequence = 1; //довжина послідовності
        int maxSequence = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                sequence++;
            } else {
                if (maxSequence < sequence) {
                    maxSequence = sequence;
                }
                sequence = 1;
            }
        }
        if (maxSequence < sequence) {
            maxSequence = sequence;
        }

        System.out.println(maxSequence);
    }
}