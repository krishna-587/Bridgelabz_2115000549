import java.util.*;
public class Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int arr[] = factor(number);

        System.out.print("All factors of a number " + number + " are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Sum of all factors is: ");
        System.out.println(sum(arr));

        System.out.print("Product of all factors is: ");
        System.out.println(Product(arr));

        System.out.print("Square sum of all factors is: ");
        System.out.println(squareSum(arr));
    }

    public static int[] factor(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int fact[] = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                fact[index++] = i;
            }
        }
        return fact;
    }

    public static int sum(int arr[]) {
        int Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i];
        }
        return Sum;
    }

    public static int Product(int arr[]) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public static int squareSum(int arr[]) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + (int) (Math.pow(arr[i], 2));
        }
        return totalSum;
    }
}
