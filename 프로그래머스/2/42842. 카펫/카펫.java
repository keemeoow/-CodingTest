class Solution {
    public int[] solution(int brown, int yellow) {
        int totalGrid = brown + yellow;
        
        for (int w = 3; w <= totalGrid; w++) {
            if (totalGrid % w == 0) {
                int h = totalGrid / w;
                if ((w-2)*(h-2) == yellow && w >= h) {
                    return new int[] {w, h};
                }
            }
        }         
        return new int[0];
    }   
}