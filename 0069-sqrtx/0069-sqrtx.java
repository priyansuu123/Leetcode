class Solution {
    public int mySqrt(int x) {
      int left = 0;
      int right = x;

      while(left <= right){
        int mid = (left + right)/2;

        if(mid ==0 || mid <= x/mid){
            left = mid +1;
        }else{
            right = mid -1;
        }
      }
        return right;
    }
}