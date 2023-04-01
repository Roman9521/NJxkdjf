package leetCode;

public class Task_746_Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int previous = cost[0];
        int currency = cost[1];
        for (int i = 2; i < cost.length; i ++) {
            int next = cost[i] + Math.min(previous, currency);
            previous = currency;
            currency = next;
        }
        return Math.min(previous, currency);
    }
    public static int minCostClimbingStairs1(int[] cost) {
        int[] minCost = new int[cost.length];
        minCost[0] = cost[0];
        minCost[1] = cost[1];
        for (int i = 2; i < cost.length; i ++) {
            minCost[i] = cost[i] + Math.min(minCost[i - 1], minCost[i - 2]);
        }
        return Math.min(minCost[minCost.length - 1], minCost[minCost.length - 2]);
    }
}
