class Solution {
    public String reverseStr(String s, int k) {
        boolean rev = true;
		String res = "";
		for (int i = 0; i < s.length(); i += k) {
			if (rev) {
				StringBuilder sb = new StringBuilder();
				if (i + k > s.length()) {
					sb.append(s.substring(i));
					res = res + sb.reverse();
					rev = !rev;
				} else {
					sb.append(s.substring(i, i + k));
					res = res + sb.reverse();
					rev = !rev;
				}

			} else {
				if (i + k > s.length()) {
					res = res + s.substring(i);
					rev = !rev;
				} else {
					res = res + s.substring(i, i + k);
					rev = !rev;
				}

			}
		}
		return res;
    }
}