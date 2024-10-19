class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> f = new HashMap<>();
        for(int n:nums){
            f.put(n,f.getOrDefault(n,0)+1);
        }
        List<Integer> l = new ArrayList<>();
        int count=0;
        for(Map.Entry<Integer,Integer> e : f.entrySet()){
            if(e.getValue()==2){
                l.add(e.getKey());
                count++;
            }
        }
        int[] arr = new int[count];
        for(int i=0;i<count;i++)
            arr[i] = l.get(i);
        return arr;
        
    }
}