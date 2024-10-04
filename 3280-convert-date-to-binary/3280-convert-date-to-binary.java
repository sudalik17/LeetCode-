class Solution {
    public String convertDateToBinary(String date) {
        String str="";
        String s[] = date.split("-");
        for(int i=0;i<s.length;i++){

        str = str+Integer.toBinaryString(Integer.parseInt(s[i]));
        if(i != s.length-1)
        str = str+"-";
        }
        return str;
    }
}