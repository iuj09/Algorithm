class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] my = my_string.toCharArray();
        
        for(int i=0;i<n;i++) {
            answer += my[i];
        }
        
        return answer;
    }
}