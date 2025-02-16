import java.util.*;
public class searchFirstNegativeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(search(arr, size));
    }

    public static int search(int arr[], int size){
        for (int i = 0; i < size; i++) {
            if(arr[i] < 0){
                return i;
            }
        }
        return -1;
    }    
}