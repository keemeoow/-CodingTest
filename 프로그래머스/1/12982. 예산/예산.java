import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0; // 지원할 수 있는 부서의 수
        Arrays.sort(d);
        
        for (int amount : d) {
            if(budget >= amount) {
                budget -= amount;
                answer++;
            }
            else {
                break;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] d1 = {1, 3, 2, 5, 4};
        int budget1 = 9;
        System.out.println(sol.solution(d1, budget1)); 

        int[] d2 = {2, 2, 3, 3};
        int budget2 = 10;
        System.out.println(sol.solution(d2, budget2));
    }
}