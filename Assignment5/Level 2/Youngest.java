import java.util.*;
public class Youngest{
    static String[] names = {"Amar", "Akbar", "Anthony"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age[] = new int[3];
        int height[] = new int[3];

        System.out.println("Enter the age of Amar: ");
        age[0] = sc.nextInt();
        System.out.println("Enter the height of Amar: ");
        height[0] = sc.nextInt();

        System.out.println("Enter the age of Akbar: ");
        age[1] = sc.nextInt();
        System.out.println("Enter the height of Akbar: ");
        height[1] = sc.nextInt();

        System.out.println("Enter the age of Anthony: ");
        age[2] = sc.nextInt();
        System.out.println("Enter the height of Anthony: ");
        height[2] = sc.nextInt();

        System.out.println("Youngest of three friends is: "+ Findyoungest(names, age));
        System.out.println("Tallest of three friends is: "+ Findtallest(names, height));

    }

    public static String Findyoungest(String [] names ,int []age){
        int young = age[0];
        String name = names[0];

        for (int i =1; i < age.length; i++) {
            if(age[i] > young){
                young = age[i];
                name = names[i];
            }
        }
        return name;
    }
    public static String Findtallest(String []names , int [] height){
        int tall = height[0];
        String name = names[0];

        for (int i =1; i < height.length; i++) {
            if(height[i] > tall){
                tall = height[i];
                name = names[i];
            }
        }
        return name;
    }
}