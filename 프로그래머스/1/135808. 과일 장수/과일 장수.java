import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        
        int totalProfit = 0;
        int n = score.length;

        for (int i = n - 1; i >= m - 1; i -= m) {
            int lowestScore = score[i - m + 1];
            totalProfit += lowestScore * m;
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        int maxProfit = sol.solution(k, m, score);
        System.out.println(maxProfit);
    }
}
