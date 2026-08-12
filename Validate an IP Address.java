class Solution {
	public boolean isValid(String s) {
		String[] part = s.split("\\.");
		if (part.length != 4)return false;
		for (String p : part) {
			if (p.length() == 0 || p.length()>3)
				return false;
			for (char ch :p.toCharArray()) {
				if (!Character.isDigit(ch))
					return false; }
				if (p.length() >1 && p.charAt(0) == '0')
					return false;
				int num = Integer.parseInt(p);
				if (num<0 || num>255) {
					return false;
				}
			}
			return true;
		}
	}
