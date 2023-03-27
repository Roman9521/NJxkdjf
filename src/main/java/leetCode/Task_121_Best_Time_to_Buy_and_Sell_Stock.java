package leetCode;

public class Task_121_Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        int answer = 0;
        int previousMin = Integer.MAX_VALUE;
        for (int meaning : prices) {
            answer = Integer.max(answer, meaning - previousMin);
            previousMin = Integer.min(previousMin, meaning);
        }
        return answer;
    }
}
