class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int start=-1,end=-1;
        boolean flag = false;
        
        for(int i=0;i<nums.length;i++){
            if (nums[i] ==  target){
            if (start != -1){
                end = i;
            }else{
                start =i;
                end =i;
            }
                
        }

        }
    
        
        return new int[]{start,end};
        
    }
}
