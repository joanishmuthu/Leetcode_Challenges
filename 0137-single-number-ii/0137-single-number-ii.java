class Solution {
	static int result;
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm=new HashMap<>();
    	for(int i=0;i<nums.length;i++) {
        	if(!hm.containsKey(nums[i])) {
        		hm.put(nums[i], 1);
        	}
        	else {
        		int val=hm.get(nums[i]);
        		++val;
        		hm.remove(nums[i]);
        		hm.put(nums[i], val);
        	}
        }
    	result=0;
    	hm.forEach((k,v)->{if(v==1) {result=k;}});
    	return result;
    }
}