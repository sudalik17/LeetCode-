class Solution {
    public int numberOfMatches(int n) {
        if(n==1)
            return 0;
        int m=0;
        int a=0,sum=0;
        while(true){
            if(n%2==0){
                a=m=n/2; 
                sum+=m;
            }
            else{
                m = n/2;
                a = m+1;
            
            
            sum+=m;}
            if(m==1 && a==1)
                break;
            n=a;
            
        }
        return sum;
    }
}