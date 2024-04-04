class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String a = "";
        String b = "";
        
        for(int i=0;i<num_list.length;i++) {
            if(num_list[i] % 2 != 0) {
                a += num_list[i];
            } else {
                b += num_list[i];
            }
        }
        
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        
        answer = x + y;
        
        return answer;
    }
}