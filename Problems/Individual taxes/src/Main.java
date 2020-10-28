import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //к-сть компаній
        int[] incomes = new int[n];
        int[] individualTaxes = new int[n];
        for (int i = 0; i < incomes.length; i++) {
            incomes[i] = scanner.nextInt();
        }
        for (int i = 0; i < individualTaxes.length; i++) {
            individualTaxes[i] = scanner.nextInt();
        }
        double max = 0;
        int maxCompany = 0;
        double[] taxes = new double[n];
        for (int i = 0; i < incomes.length; i++) {
            taxes[i] = incomes[i] / 100.0 * individualTaxes[i];
        }
        for (int i = 0; i < taxes.length; i++) {
            if (max < taxes[i]) {
                max = taxes[i];
                maxCompany = i + 1;
            }
        }
        System.out.println(maxCompany);
    }
}