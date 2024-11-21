class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
  Map<String,Integer> f = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            f.put(list1[i],i);
        }
        int min = Integer.MAX_VALUE;
        List<String> l =new ArrayList<>();
        
        for(int j=0;j<list2.length;j++){
            String str = list2[j];
            if(f.containsKey(str)){
                int sum = j+f.get(str);
                if(sum<min){
                    min=sum;
                    l.clear();
                    l.add(str);
                }
                else if(sum==min)
                    l.add(str);
            }
        }
        return l.toArray(new String[0]);
    }
}