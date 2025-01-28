import java.util.*;
public class BMIAnalysis {

    public static void calculateBMI(double[][] data) {
        for(int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0;
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }


    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal";
            } else if (bmi >= 25.0 && bmi < 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        return statuses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; 

        System.out.println("Enter weight (in kg) and height (in cm) for 10 individuals:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        
        calculateBMI(data);
        String[] statuses = determineBMIStatus(data);

        System.out.println("\nResults:");
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\t	Status");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                i + 1, data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        scanner.close();
    }
}