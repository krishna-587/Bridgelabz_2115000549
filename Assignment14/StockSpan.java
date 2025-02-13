import java.util.Stack;

public class StockSpan {

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); 
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());



            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {8, 50, 100, 65, 78, 24, 85};
        int[] span = calculateSpan(prices);
        
        System.out.print("Stock Spans: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
