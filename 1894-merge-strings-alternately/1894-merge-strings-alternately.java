class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        boolean f=true;
        boolean p=false;
        int j=0;
    	for(int i=0;i<word1.length();i++) {
        	res=res+word1.charAt(i);
        	while(j<word2.length()) {
        		res=res+word2.charAt(j);
        		j++;
        		break;
        	}
        }if(j<word2.length()) {
        	res=res+word2.substring(j,word2.length());
        }
    	return res;
    }
}