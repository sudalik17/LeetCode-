import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String str = "";
        for(int i=0;i<num.length;i++){
             str =str + Integer.toString(num[i]);
            
        }
        BigInteger b = new BigInteger(str);
        BigInteger sum = b.add(BigInteger.valueOf(k));
        List<Integer> l = new ArrayList<>();
        String s = sum.toString();
        for(int i=0;i<s.length();i++){
            l.add(s.charAt(i)-'0');
        }
        return l;
    }
}