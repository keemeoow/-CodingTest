class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String pw;

        // 각 배열의 원소 합한 pw 저장 (10진수 -> 2진수)
        // pw의 각 원소 탐색하여 (1이면 -> #, 0이면 -> 공백) 으로 원소 저장
        for(int i = 0 ; i < n ; i++){
            pw = String.format("%"+n+"s", Integer.toBinaryString(arr1[i] | arr2[i]));
            pw = pw.substring(pw.length() - n);
            pw = pw.replaceAll("1", "#");
            pw = pw.replaceAll("0", " ");
            answer[i] = pw;
        }
        return answer;
    }
}