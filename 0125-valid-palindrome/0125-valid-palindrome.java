class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
		String[] arr=s.split("");
		for(int i=0;i<arr.length;i++) {
			if(Character.isAlphabetic(arr[i].charAt(0)) || Character.isDigit(arr[i].charAt(0))) {
				if(Character.isAlphabetic(arr[i].charAt(0))) {
					char t=Character.toLowerCase(arr[i].charAt(0));
					sb.append(t);
				}
				else {
					sb.append(arr[i]);
				}
			}
		}
		String rev=sb.toString();
		sb.reverse();
		if(sb.toString().equals(rev)) {
			return true;
		}
		else {
			return false;
		}
    }
}