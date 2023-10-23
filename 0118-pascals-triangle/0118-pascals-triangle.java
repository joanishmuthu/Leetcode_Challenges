class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> a=new ArrayList<Integer>();
        a.add(1);
        res.add(a);
        int i=1;
        while(i<numRows) {
        	a=new ArrayList<Integer>();
        	a.add(1);
        	List<Integer> prev=res.get(i-1);
        	if(prev.size()>1) {
        		for(int j=0;j<prev.size()-1;j++) {
            		int v=prev.get(j)+prev.get(j+1);
            		a.add(v);
            	}
        	}
        	a.add(1);
        	res.add(a);
        	i++;
        }
        return res;
    }
}