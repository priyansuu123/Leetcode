class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum= 0;

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        int min = Integer.MAX_VALUE;
        int cm = 0;

        for(int i = 0; i<nums.length;i++){
            totalSum+=nums[i];
            cs = cs+nums[i];
            ms = Math.max(cs,ms);
            if(cs<0){
                cs= 0;
            }
            cm =cm+nums[i];
            min=Math.min(cm,min);
            if(cm>0){
                cm=0;
            }
        }
            if(ms<0){
                return ms;
            }
        
            int circularSum =  totalSum-min;
        return Math.max(ms, circularSum);
        
    
    }
}