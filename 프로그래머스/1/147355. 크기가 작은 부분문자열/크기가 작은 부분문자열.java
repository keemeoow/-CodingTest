public class Solution {
    public int solution(String t, String p) {
        int pLength = p.length();
        long pNum = Long.parseLong(p);
        int count = 0;

        for (int i = 0; i <= t.length() - pLength; i++) {
            String substring = t.substring(i, i + pLength);
            long subNum = Long.parseLong(substring);
            if (subNum <= pNum) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String t1 = "3141592";
        String p1 = "271";
        System.out.println(sol.solution(t1, p1)); // 2
        
        String t2 = "500220839878";
        String p2 = "7";
        System.out.println(sol.solution(t2, p2)); // 8
        
        String t3 = "10203";
        String p3 = "15";
        System.out.println(sol.solution(t3, p3)); // 3
    }
}
