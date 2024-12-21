class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cardIdx1 = 0;
        int cardIdx2 = 0;
        
        for (int i = 0; i < goal.length; i++) {
            String goalStr = goal[i];
            
            if (cardIdx1 < cards1.length && goalStr.equals(cards1[cardIdx1])) {
                cardIdx1++;
            } else if (cardIdx2 < cards2.length && goalStr.equals(cards2[cardIdx2])) {
                cardIdx2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}