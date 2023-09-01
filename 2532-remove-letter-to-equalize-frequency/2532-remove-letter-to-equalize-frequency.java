class Solution {
    public boolean equalFrequency(String word) {
        boolean res=false;
    	for(int i=0;i<word.length();i++) {
        	String w="";
        	w=word.substring(0,i)+word.substring(i+1);
        	if(valuechecker(w)) {
        		res=true;
        		break;
        	}
        }
    	return res;
    }
    	private boolean valuechecker(String w) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<w.length();i++) {
			if(!hm.containsKey(w.charAt(i))) {
				hm.put(w.charAt(i), 1);
			}
			else {
				int val=hm.get(w.charAt(i));
				hm.remove(w.charAt(i));
				hm.put(w.charAt(i), val+1);
			}
		}
		int val=0;
		boolean b=true;
		boolean res=true;
		for(Map.Entry<Character, Integer> m:hm.entrySet()) {
			if(b) {
				b=false;
				val=m.getValue();
			}
			else {
				if(val!=m.getValue()) {
					res=false;
				}
			}
		}
		return res;
	}
}