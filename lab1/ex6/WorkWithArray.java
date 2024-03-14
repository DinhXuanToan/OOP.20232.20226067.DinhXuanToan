package ex6;

import java.util.Arrays;
import java.util.Scanner;

public class WorkWithArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Enter size of array: ");
        n = input.nextInt();

        int[] a = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        Arrays.sort(a);
        System.out.println("Sorted a: " + Arrays.toString(a));

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        double average = (double) sum / n;

        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + average);
        input.close();
    }
}