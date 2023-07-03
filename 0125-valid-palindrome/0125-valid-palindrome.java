class Solution {
    public boolean isPalindrome(String s) {
        String res="";
    	for(int i=0;i<s.length();i++) {
        	if(((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122)) {
        		res=res+s.charAt(i);
        	}
        	else if(((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90) ) {
        		int a=(int)s.charAt(i)+32;
        		res=res+(char)a;
        	}
        	else if((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57) {
        		res=res+s.charAt(i);
        	}
        }
    	StringBuilder sb=new StringBuilder(res);
    	sb.reverse();
    	String r1=sb.toString();
    	if(res.equals(r1)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}