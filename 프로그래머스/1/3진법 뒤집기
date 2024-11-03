class Solution {
    public int solution(int n) {

        StringBuilder base3 = new StringBuilder();
        
        while (n > 0) {
            base3.append(n % 3);
            n /= 3;
        }     
        
        base3.reverse();
        
        int answer = 0;
        for (int i = 0; i < base3.length(); i++) {
            answer += (base3.charAt(i) - '0') * Math.pow(3, i);
        }
       
        return answer;
    }
}
