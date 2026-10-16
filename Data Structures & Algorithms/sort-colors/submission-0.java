class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sort=nums[i]; 
           map.put(sort,map.getOrDefault(sort,0)+1);

           int index =0;

           for(int key=0;key<=2;key++){
            for(int j=0;j<map.getOrDefault(key,0);j++){
                nums[index]=key;
                index++;
            }

           }
            
        }
    }
}