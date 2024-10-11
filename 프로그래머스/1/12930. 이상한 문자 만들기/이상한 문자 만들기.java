public class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isOdd = true;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == ' ') {
                answer.append(currentChar);
                isOdd = true;
            } else {
                if (isOdd) {
                    answer.append(Character.toUpperCase(currentChar));
                } else {
                    answer.append(Character.toLowerCase(currentChar));
                }
                isOdd = !isOdd;
            }
        }
        
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("try hello world")); 
    }
}
