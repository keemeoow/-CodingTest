class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        // skip 삭제한 알파벳들만 모은 리스트 
        String alphabet = new String();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!skip.contains(String.valueOf(c))) {
                alphabet += c;
            }
        }
        //int validLength = validChars.length();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int currentIndex = alphabet.indexOf(String.valueOf(c)); // 해당 문자의 인덱스 찾기
            int newIndex = (currentIndex + index) % alphabet.length(); // index만큼 이동
            answer += alphabet.charAt(newIndex); // 이동한 문자 추가
        }
        return answer.toString();
    }
}
