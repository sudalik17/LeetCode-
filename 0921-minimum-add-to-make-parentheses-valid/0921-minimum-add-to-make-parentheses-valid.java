class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int left=0;
        int right=0;
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                left++;
            }
            else{
                if(left>0)
                    left--;
                else
                    right++;
            }
        }
        return left+right;
        
    }
}