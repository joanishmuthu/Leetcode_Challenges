class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++) {
        	arr.add(nums[i]);
        }
        int res=0;
        for(int i=0;i<=n;i++) {
        	if(!arr.contains(i)) {
        		res=i;
        		break;
        	}
        }
        return res;
    }
}