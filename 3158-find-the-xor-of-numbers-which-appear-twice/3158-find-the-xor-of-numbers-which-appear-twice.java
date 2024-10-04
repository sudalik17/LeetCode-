class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int x=0;
        HashMap<Integer,Integer> f = new HashMap<>();
        for(int n:nums){
            f.put(n,f.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : f.entrySet()){
            if(e.getValue()==2){
                x = x ^ e.getKey();
            }
        }
        return x;
    }
}