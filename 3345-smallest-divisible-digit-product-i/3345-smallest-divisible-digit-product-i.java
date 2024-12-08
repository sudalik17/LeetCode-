class Solution {
    public int smallestNumber(int n, int t) {
        int i=n;
        while(true){
            if(pro(i)%t == 0)
                return i;
            i++;
        }
       
    }
    public int pro(int n){
        int f=1;
        while(n>0){
            int m = n%10;
            f = f*m;
            n = n/10;
        }
        return f;
    }
}