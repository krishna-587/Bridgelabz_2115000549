public class  RandomGenerator{
    public static void main(String[] args) {
        RandomGenerator rg = new RandomGenerator();
        int randomArray[] = rg.generate4DigitRandomArray(5);

        double[] result = rg.findAverageMinMax(randomArray);

        System.out.println("The average of values are: " + result[0]);
        System.out.println("The minimum of values are: " + result[1]);
        System.out.println("The maximum of values are: " + result[2]);

    }

    public int[] generate4DigitRandomArray(int size){
        int random[] = new int[size];
        for (int i = 0; i < size; i++) {
            random[i] = (int) (Math.random() * 9000)+ 1000;
        }

        return random;
    }

    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for(int val : numbers){
            min = Math.min(val, min);
            max = Math.min(val, max);
            sum += val;
        }

        double average = sum/numbers.length;
        return new double[]{average, min, max};
    }

}