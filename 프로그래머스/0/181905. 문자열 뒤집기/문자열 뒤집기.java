class Solution {
    public String solution(String my_string, int s, int e) {
        
        StringBuffer sb = new StringBuffer(my_string.substring(0,s));
        sb.append(new StringBuffer(my_string.substring(s,e+1)).reverse());
        sb.append(my_string.substring(e+1));
        
        return sb.toString();
    }
}