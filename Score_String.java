class Solution {
    public int scoreOfString(String s) {
        char c[]=s.toCharArray();
        int res=0;
        for(int i=1;i<c.length;i++){
            res+=Math.abs((int)c[i-1]-(int)c[i]);
        }
        return res;
    }
}