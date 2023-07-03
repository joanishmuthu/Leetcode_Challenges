class Solution {
    
    public void reverse(int []arr, int low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        if(k > n){
            k = k%n;
        }
        //1. reversing the whole array
        reverse(nums, start, end);
 

        //2. reversing the k part
        reverse(nums, start, k-1);

        //3. reverse the remaining part
        reverse(nums, k, end);

    }
}