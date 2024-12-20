class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int j=0;
        
       for(int n:s){
           nums[j] = n;
           j++;
       }

        return s.size();
        
    }
}